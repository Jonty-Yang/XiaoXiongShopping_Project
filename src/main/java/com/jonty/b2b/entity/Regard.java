package com.jonty.b2b.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 创建作者: AHao
 * 创建日期: 2023/1/13 18:10
 * 项目名称: XiaoXiongShopping_Project
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Regard { // 店铺关注类

    private Integer rid;    // 关注编号
    private Integer sid;    // 商家编号
    private Integer uid;    // 用户编号
    private Date data;      // 关注时间
    private String spare;   // 备用字段
}
