package com.phlyl.manage.lyl.filter;

import com.google.gson.JsonObject;
import com.phlyl.manage.lyl.common.StringUtils;
import com.phlyl.manage.lyl.common.constant.Constants;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by 潘淮  on 2018/9/7.<br>
 */
@Component
public class RequestFilter implements Filter {
    /**
     * 从缓存中获取TOKEN 与请求头中的TOKEN进行验证
     * TOKEN传输过程中进行加密
     */

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        String header = request.getHeader(Constants.TOKEN);
        if (StringUtils.isNotBlank(header)){
            // 处理  是否失效
            filterChain.doFilter(servletRequest,servletResponse);
        }else {
            JsonObject object = new JsonObject();
            object.addProperty("code", 403);
            object.addProperty("msg", "无访问权限，请进行登录");
            object.addProperty("data", "");
            HttpServletResponse response = (HttpServletResponse) servletResponse;
            response.setHeader("content-type", "text/html;charset=utf-8");
            response.getOutputStream().write(object.toString().getBytes("utf-8"));
        }
    }

    @Override
    public void destroy() {

    }
}
