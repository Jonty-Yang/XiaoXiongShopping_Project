package com.jonty.b2b.vo;

import com.jonty.b2b.entity.Goods;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * author: Jonty
 * Date: 2023/3/5
 * project: xiao_xiong_shopping
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SimpleGoodsInfo {

    private Integer id;
    private String name;
    private Double price;

    /**
     * 简单商品转实体对象
     * @return
     */
    public Goods toGoods() {
        Goods goods = new Goods();
        goods.setGid(id);
        goods.setName(name);
        goods.setDis_price(price);
        return goods;
    }
}
