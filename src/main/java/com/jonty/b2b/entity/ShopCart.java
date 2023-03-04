package com.jonty.b2b.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 创建作者: AHao
 * 创建日期: 2022/12/30 13:51
 * 项目名称: XiaoXiongShopping_Project
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ShopCart { // 购物车类

    private Integer scid;       // 购物车编号
    private Integer gid;        // 商品id
    private Integer num;        // 数量
    private Integer uid;        // 用户id
    private Date date;          // 添加到购物车的日期
    private Integer status;     // 状态
    private String spare;       // 备用字段

    // 连表查询
    private Goods goods;


}
