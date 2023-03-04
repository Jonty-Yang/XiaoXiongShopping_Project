package com.jonty.b2b.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 创建作者: AHao
 * 创建日期: 2023/1/13 18:14
 * 项目名称: XiaoXiongShopping_Project
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Shop { // 商家类

    private Integer sid;        // 商家编号
    private String shop_name;   // 店铺名称
    private String username;    // 商家昵称
    private String password;    // 密码
    private String address;     // 店铺地址
    private Date date;          // 开店日期
    private String power;       // 商家权限
    private Integer status;      // 状态
    private String spare;       // 备用字段

}
