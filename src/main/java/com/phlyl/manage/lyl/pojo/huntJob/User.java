package com.phlyl.manage.lyl.pojo.huntJob;

import java.util.Date;

/**
 * 个人信息
 * Created by 潘淮  on 2018/9/8.<br>
 */
public class User {

    // id
    private int id;
    // 用户名
    private String name;
    // 密码 加密处理
    private String pwd;
    // 微信公众号 openid
    private String openId;
    // 手机号码
    private String tel;
    // 头像地址
    private String logo;
    // 邮箱
    private String mail;
    // 身份证
    private String cardId;
    // 创建日期
    private Date createTime;
    // 版本
    private int version;
    // 是否注销  0注销 false  1启用 true
    private boolean disable;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }
}
