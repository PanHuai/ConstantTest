package com.phlyl.manage.lyl.controller;

import com.phlyl.manage.lyl.response.ResponseInfo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by 潘淮  on 2018/9/7.<br>
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/info")
    public ResponseInfo getUserInfo(@RequestBody(required = false) Map<String,Object> map) {
        Map<String, Object> param = new HashMap<>();
        param.put("code", 200);
        param.put("msg", "成功");
        param.put("data", "");
        return new ResponseInfo(param);
    }
}
