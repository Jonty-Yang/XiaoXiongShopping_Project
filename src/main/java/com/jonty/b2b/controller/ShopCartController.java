package com.jonty.b2b.controller;

import com.jonty.b2b.entity.ShopCart;
import com.jonty.b2b.service.IShopCartService;
import org.springframework.beans.PropertyValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 创建作者: AHao
 * 创建日期: 2022/12/30 13:57
 * 项目名称: XiaoXiongShopping_Project
 */

@RestController
@RequestMapping("/cart")
public class ShopCartController {

    @Autowired
    private IShopCartService shopCartService;

    @GetMapping("/findCartByUid/{uid}")
    public List<ShopCart> findCartByUid(@PathVariable Integer uid) {
        return shopCartService.findCartByUid(uid);
    }

    @PostMapping("/add")
    public String addCart(@RequestBody ShopCart cart) {
        return shopCartService.addCart(cart) >= 1 ? "添加成功！" : "添加失败！";
    }
}
