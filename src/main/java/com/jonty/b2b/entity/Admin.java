package com.jonty.b2b.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 创建作者: AHao
 * 创建日期: 2023/1/13 18:37
 * 项目名称: XiaoXiongShopping_Project
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Admin { // 商城平台后台管理类

    private Integer aid;    // 管理员编号
    private String name;    // 管理员名字
    private String password;// 密码
    private Integer status; // 状态
    private String spare;   // 备用字段

}
