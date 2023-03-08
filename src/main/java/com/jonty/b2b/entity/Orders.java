package com.jonty.b2b.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Orders { // 订单类

    private Integer oid;        // 订单编号
    private Integer gid;        // 商品编号
    private String goods_name;  // 商品名称
    private Integer uid;        // 用户编号
    private Double price;       // 商品单价
    private Double total;       // 订单总价
    private Integer number;     // 购买的商品数量
    private Date date;          // 购买日期
    private Integer noReceipt;  // 待发货
    private Integer noSendGoods;// 待收货
    private Integer noComment;  // 待评论
    private Integer status;     // 状态
    private String spare1;      // 备用字段1
    private String spare2;      // 备用字段2

}
