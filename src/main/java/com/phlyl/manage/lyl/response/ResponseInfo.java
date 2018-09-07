package com.phlyl.manage.lyl.response;

import java.util.Map;

/**
 * Created by 潘淮  on 2018/9/7.<br>
 */
public class ResponseInfo {

    private int code;

    private String msg;

    private Object data;

    public ResponseInfo(Map<String,Object> map){
        this.code = Integer.valueOf(map.get("code").toString());
        this.msg = (String) map.get("msg");
        this.data = map.get("data");
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
