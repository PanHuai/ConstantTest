package com.phlyl.manage.lyl.controller;

import com.phlyl.manage.lyl.pojo.huntJob.ResumeTop;
import com.phlyl.manage.lyl.pojo.huntJob.User;
import com.phlyl.manage.lyl.response.ResponseInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;
import java.util.function.Function;

/**
 * Created by 潘淮  on 2018/9/7.<br>
 *
 *   *                      头上三尺有圣明
 * *
 * * #                       _oo0oo_                     #
 * * #                      o8888888o                    #
 * * #                      88" . "88                    #
 * * #                      (| -_- |)                    #
 * * #                      0\  =  /0                    #
 * * #                    ___/`---'\___                  #
 * * #                  .' \\|     |# '.                 #
 * * #                 / \\|||  :  |||# \                #
 * * #                / _||||| -:- |||||- \              #
 * * #               |   | \\\  -  #/ |   |              #
 * * #               | \_|  ''\---/''  |_/ |             #
 * * #               \  .-\__  '-'  ___/-. /             #
 * * #             ___'. .'  /--.--\  `. .'___           #
 * * #          ."" '<  `.___\_<|>_/___.' >' "".         #
 * * #         | | :  `- \`.;`\ _ /`;.`/ - ` : | |       #
 * * #         \  \ `_.   \_ __\ /__ _/   .-` /  /       #
 * * #     =====`-.____`.___ \_____/___.-`___.-'=====    #
 * * #                       `=---='                     #
 * * #     ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~   #
 * * #                                                   #
 * * #               佛祖保佑         永无BUG             #
 */
@RestController
@RequestMapping("/user")
public class UserController {
    private final Logger logger = LoggerFactory.getLogger(UserController.class);

    @RequestMapping("/info")
    public ResponseInfo getUserInfo(@RequestBody(required = false) Map<String,Object> map, HttpServletRequest request) {
        Map<String, Object> param = new HashMap<>();
        String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath();
        logger.info(request.getServletPath());  // request.getQueryString() 获取请求参数
        param.put("code", 200);
        param.put("msg", "成功");
        param.put("data", basePath);
        return new ResponseInfo(param);
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("peter", "anna", "mike", "xenia");
        list.sort((a,b)-> b.compareTo(a));
        for (String s : list) {
            System.out.println(s);
        }
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        User user = new User();
        ResumeTop resumeTop = new ResumeTop();
        Function<User, ResumeTop> function = new Function<User, ResumeTop>() {(user) -> {

            ResumeTop resumeTop1 = new ResumeTop();
            return resumeTop1;
        }
           /* @Override
            public ResumeTop apply(User user) {
                return null;
            }*/
        }

    }
}
