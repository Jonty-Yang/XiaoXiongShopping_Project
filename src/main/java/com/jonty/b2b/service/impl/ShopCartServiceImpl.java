package com.jonty.b2b.service.impl;

import com.jonty.b2b.entity.ShopCart;
import com.jonty.b2b.mapper.ShopCartMapper;
import com.jonty.b2b.service.IShopCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * 创建作者: AHao
 * 创建日期: 2022/12/30 13:56
 * 项目名称: XiaoXiongShopping_Project
 */

@Service
public class ShopCartServiceImpl implements IShopCartService {

    @Autowired
    private ShopCartMapper shopCartMapper;

    // 根据uid查询购物车数据
    @Override
    public List<ShopCart> findCartByUid(Integer uid) {
        return shopCartMapper.findCartByUid(uid);
    }

    // 添加到购物车
    @Override
    public int addCart(ShopCart cart) {
        cart.setDate(new Date());
        // 先查询当前用户的购物车商品
        List<ShopCart> cartList = shopCartMapper.findCartByUid(cart.getUid());
        for (ShopCart c : cartList) {
            if (c.getGid() == (int) cart.getGid()) {
                // 如果该商品已在购物车，则只需要修改该商品的数量即可
                return shopCartMapper.updateNumByCart(cart);
            }
        }
        // 添加到购物车
        return shopCartMapper.addCart(cart);
    }
}
