package com.jonty.b2b.service.impl;

import com.jonty.b2b.entity.Goods;
import com.jonty.b2b.mapper.GoodsMapper;
import com.jonty.b2b.service.IGoodsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

/**
 * 创建作者: AHao
 * 创建日期: 2022/12/29 11:26
 * 项目名称: XiaoXiongShopping_Project
 */
@Service
@Slf4j
@Transactional // 事务回滚注解
public class GoodsServiceImpl implements IGoodsService {

    @Resource
    private GoodsMapper goodsMapper;

    // 查询所有商品
    @Override
    public List<Goods> findAll() {
        return goodsMapper.findAll();
    }

    // 用于首页猜你喜欢区域展示的商品
    @Override
    public List<Goods> findAllByLimit(int[] ids) {
        Set<Integer> set = new HashSet<>();
        while (set.size() < 4) {
            set.add(new Random().nextInt(8) + 1);
        }
        Object[] array = set.toArray();
        for (int i = 0; i < array.length; i++) {
            ids[i] = (int) array[i];
        }
        log.info("set[{}]:", set);
        log.info("ids[{}]:", ids);
        return goodsMapper.findAllByLimit(ids);
    }

    // 根据商品名称模糊查商品信息
    @Override
    public List<Goods> findGoodsByName(String name) {
        return goodsMapper.findGoodsByName(name);
    }

    // 根据商品类型id查询商品信息
    @Override
    public List<Goods> findGoodsByTid(Integer tid) {
        return goodsMapper.findGoodsByTid(tid);
    }

    // 根据店铺sid查询商品
    @Override
    public List<Goods> findGoodsBySid(Integer sid) {
        return goodsMapper.findGoodsBySid(sid);
    }

    // 扣减库存
    @Override
    public int deductGoodsStock(Integer gid, Integer stock) {
        return goodsMapper.deductGoodsStock(gid,stock);
    }
}
