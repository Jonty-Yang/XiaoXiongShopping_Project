package com.jonty.b2b.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 创建作者: AHao
 * 创建日期: 2022/12/27 16:41
 * 项目名称: XiaoXiongShopping_Project
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GoodsType { // 商品类型类

    private Integer tid;    // 类型id
    private String tname;   // 类型名称
    private Integer status; // 状态
    private String spare;   // 备用字段

}
