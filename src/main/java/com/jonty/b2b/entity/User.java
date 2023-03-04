package com.jonty.b2b.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * user
 * @author 
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User implements Serializable { // 用户类

    private Integer uid;        // 用户编号
    private String username;    // 用户昵称
    private String password;    // 密码
    private String phone;       // 手机号
    private String sex;         // 性别
    private Date birthday;      // 生日
    private String introduce;   // 个人简介
    private String headimg;     // 头像
    private Integer aid;        // 地址编号
    private Double balance;     // 余额
    private Integer status;     // 状态

    private String spare1;      // 备用字段1
    private String spare2;      // 备用字段2

    private static final long serialVersionUID = 1L;

}