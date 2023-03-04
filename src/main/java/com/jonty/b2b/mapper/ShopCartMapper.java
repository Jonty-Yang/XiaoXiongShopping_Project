package com.jonty.b2b.mapper;

import com.jonty.b2b.entity.ShopCart;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 创建作者: AHao
 * 创建日期: 2022/12/30 13:52
 * 项目名称: XiaoXiongShopping_Project
 */

public interface ShopCartMapper {

    // 根据uid查询购物车数据
    List<ShopCart> findCartByUid(Integer uid);

    //添加到购物车
    int addCart(ShopCart cart);

    // 修改购物车商品数量，如果该商品已经在购物车，则只需要修改数量即可
    int updateNumByCart(ShopCart cart);
}
