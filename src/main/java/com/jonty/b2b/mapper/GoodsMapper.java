package com.jonty.b2b.mapper;

import com.jonty.b2b.entity.Goods;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 创建作者: AHao
 * 创建日期: 2022/12/29 11:06
 * 项目名称: XiaoXiongShopping_Project
 */
public interface GoodsMapper {

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

    // 根据商品编号gid查询商品信息
    Goods findGoodsByGid(Integer gid);

    // 扣减库存
    int deductGoodsStock(@Param("gid") Integer gid, @Param("stock") Integer stock);

}
