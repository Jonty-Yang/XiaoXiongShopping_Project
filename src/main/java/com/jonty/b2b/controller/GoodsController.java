package com.jonty.b2b.controller;

import com.jonty.b2b.entity.Goods;
import com.jonty.b2b.service.IGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 创建作者: AHao
 * 创建日期: 2022/12/29 11:31
 * 项目名称: XiaoXiongShopping_Project
 */
@RestController
@RequestMapping("/goods")
public class GoodsController {

    @Autowired
    private IGoodsService goodsService;

    // 查询所有商品
    @GetMapping("/findAllGoods")
    public List<Goods> findAll() {
        return goodsService.findAll();
    }

    // 用于首页猜你喜欢区域展示的商品
    @GetMapping("/findAllGoodsLimit")
    public List<Goods> findAllLimit() {
        System.out.println("请求到后端");
        int[] ids = new int[4];
        return goodsService.findAllByLimit(ids);
    }

    // 根据商品名称查询商品
    @GetMapping("/findGoodsByName/{name}")
    public List<Goods> findGoodsByName(@PathVariable String name) {
        return goodsService.findGoodsByName(name);
    }

    // 根据商品类型id查询商品信息
    @GetMapping("/findGoodsByTid/{tid}")
    public List<Goods> findGoodsByTid(@PathVariable Integer tid){
        return goodsService.findGoodsByTid(tid);
    }

    @GetMapping("/findGoodsBySid/{sid}")
    public List<Goods> findGoodsBySid(@PathVariable Integer sid){
        return goodsService.findGoodsBySid(sid);
    }
}
