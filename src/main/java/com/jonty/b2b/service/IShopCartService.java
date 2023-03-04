package com.jonty.b2b.service;

import com.jonty.b2b.entity.ShopCart;

import java.util.List;

/**
 * 创建作者: AHao
 * 创建日期: 2022/12/30 13:55
 * 项目名称: XiaoXiongShopping_Project
 */
public interface IShopCartService {

    // 根据uid查询购物车数据
    List<ShopCart> findCartByUid(Integer uid);

    //添加到购物车
    int addCart(ShopCart cart);

}
