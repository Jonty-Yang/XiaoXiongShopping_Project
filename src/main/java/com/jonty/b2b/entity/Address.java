package com.jonty.b2b.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 创建作者: AHao
 * 创建日期: 2023/1/13 18:34
 * 项目名称: XiaoXiongShopping_Project
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Address { // 收获地址类

    private Integer aid;    // 地址编号
    private Integer uid;    // 用户编号
    private String province;// 省份
    private String city;    // 城市
    private String detail;  // 地址详情
    private Integer status; // 状态
    private String spare;   // 备用地址
}
