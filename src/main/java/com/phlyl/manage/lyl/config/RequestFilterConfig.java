package com.phlyl.manage.lyl.config;

import com.phlyl.manage.lyl.common.constant.Constants;
import com.phlyl.manage.lyl.filter.RequestFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 潘淮  on 2018/9/7.<br>
 */
@Configuration
@Component
public class RequestFilterConfig {

    @Autowired
    private RequestFilter filter;

    @Bean
    public FilterRegistrationBean filterRegistrationBean() {
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        registrationBean.setFilter(filter);

        List<String> list = new ArrayList<>();
        list.add("/user/info");
        list.add("/user/getmsg");
        registrationBean.setUrlPatterns(list);
        registrationBean.setOrder(Constants.ONE);
        registrationBean.setEnabled(true);
        return registrationBean;
    }
}
