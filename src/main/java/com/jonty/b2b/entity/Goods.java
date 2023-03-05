package com.jonty.b2b.entity;

import com.jonty.b2b.vo.SimpleGoodsInfo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Goods { // 商品信息类

    private Integer gid;    // 商品id主键
    private Integer sid;    // 商家编号
    private String name;    // 商品名称
    private Integer tid;    // 商品类型id
    private double or_price; // 原价
    private double dis_price;// 折扣价
    private String color;   // 颜色
    private String remark;  // 商品描述
    private String img;     // 商品图片，封面
    private Integer stock;  // 库存
    private Integer sales;  // 总销量
    private Integer praise; // 点赞数
    private String date;    // 上架日期
    private Integer status; // 状态 做假删除
    private String spare1;  // 备用字段1
    private String spare2;  // 备用字段2

    // 连表查询
    // 商家店铺名称
    private String shop_name;
    // 商家地址
    private String address;

    // 商品类别名称
    private String tname;


    /**
     * 实体对象转 vo
     *
     * @return 简单商品信息 vo对象
     */
    public SimpleGoodsInfo simpleGoodsInfo() {
        return new SimpleGoodsInfo(
                this.gid,
                this.name,
                this.dis_price
        );
    }
}