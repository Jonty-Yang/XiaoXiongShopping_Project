package com.jonty.b2b.service;

import com.jonty.b2b.entity.Goods;

import java.util.List;

/**
 * 创建作者: AHao
 * 创建日期: 2022/12/29 11:25
 * 项目名称: XiaoXiongShopping_Project
 */
public interface IGoodsService {

    // 查询所有商品
    List<Goods> findAll();

    // 用于首页猜你喜欢区域展示的商品
    List<Goods> findAllByLimit(int[] ids);

    // 根据商品名称查询
    List<Goods> findGoodsByName(String name);

    // 根据商品类型编号查询商品
    List<Goods> findGoodsByTid(Integer tid);

    // 根据店铺sid查询商品
    List<Goods> findGoodsBySid(Integer sid);

    // 扣减库存
    int deductGoodsStock(Integer gid,Integer stock);
}
