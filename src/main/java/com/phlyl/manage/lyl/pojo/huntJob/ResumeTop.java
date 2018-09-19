package com.phlyl.manage.lyl.pojo.huntJob;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 简历 公共部分
 * Created by 潘淮  on 2018/9/8.<br>
 */
public class ResumeTop {

    /**
     * 分 表
     *
     * 基本信息
     * { 姓名，性别，出生日期，开始工作年份，手机，邮箱，居住地址，求职状态| 前者为必填 |，户口国籍，婚姻状况，政治面貌，身高，其他联系方式，身份证 }
     *
     * 求职意向
     * { 期望薪资，工作城市，职位，行业，个人标签，到岗时间，工作类型}
     *
     * 工作经历
     * {时间，公司，职能，职位，行业，部门，公司性质，工作描述，工作类型（全职，兼职，实习，全/兼职），海外经历}
     *
     * 项目经历
     * { 所属公司，时间，项目，项目描述，责任描述}
     *
     * 教育经历
     * {时间，学校，学历，专业，专业描述，海外经历}
     *
     * 在校情况
     * {时间，奖项}
     *
     * 附加信息
     * {主题（推荐和可自定义），描述}
     *
     */

    // id
    private int id;
    // userID
    private int userId;
    // 性别  0 男 false  1 女 true
    private boolean sex;
    //  创建，更新时间
    private Date createTime;
    // 手机号码
    private String tel;
    // 邮箱
    private String mail;
    // 出生日期
    private Date birthDay;
    // 求职状态
    private int state;
    // 居住地址
    private String adress;

    // 学历
    private int education;
    // 学校毕业
    private String school;
    // 专业
    private String professional;

    // 目前工资
    private BigDecimal salary;

    // 最近工作 公司名称
    private String companyName;
    // 职位
    private String job;
    // 行业
    private String industry;







}
