package com.jonty.b2b.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 创建作者: AHao
 * 创建日期: 2023/1/11 20:54
 * 项目名称: XiaoXiongShopping_Project
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Collection { // 商品收藏类

    private Integer cid;    // 收藏编号
    private Integer gid;    // 商品编号
    private Integer uid;    // 用户编号
    private Date date;      // 收藏日期
    private String spare;   // 备用字段

    // 连表查询
    private String img;         // 商品图片
    private String name;        // 商品名称
    private Double or_price;    // 原价
    private Double dis_price;   // 折扣价
}
