package com.jonty.b2b.service.impl;

import com.jonty.b2b.entity.Goods;
import com.jonty.b2b.entity.Orders;
import com.jonty.b2b.entity.User;
import com.jonty.b2b.mapper.GoodsMapper;
import com.jonty.b2b.mapper.OrdersMapper;
import com.jonty.b2b.mapper.UserMapper;
import com.jonty.b2b.service.IOrdersService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * 创建作者: AHao
 * 创建日期: 2023/1/11 15:46
 * 项目名称: XiaoXiongShopping_Project
 */

@Service
@Slf4j
public class OrdersServiceImpl implements IOrdersService {

    @Autowired
    private OrdersMapper ordersMapper;

    @Autowired
    private GoodsMapper goodsMapper;

    @Autowired
    private UserMapper userMapper;

    @Transactional(rollbackFor = Exception.class) // 事物回滚注解
    @Override
    public int createOrder(Orders orders) {
        log.info("订单信息：[{}]", orders);
        orders.setDate(new Date());
        // todo 1. 查询该订单商品库存是否够扣减
        Goods currentGoods = goodsMapper.findGoodsByGid(orders.getGid());
        if (currentGoods.getStock() < orders.getNumber()) {
            log.info("库存不足！");
            throw new RuntimeException("库存不足！");
        }
        // 扣减库存 持久化
        goodsMapper.deductGoodsStock(orders.getGid(), orders.getNumber());
        // todo 2. 查询当前用户余额是否够买该商品总价
        User currentUser = userMapper.selectByPrimaryKey(orders.getUid());
        if (currentUser.getBalance() < orders.getTotal()) {
            log.info("余额不足！");
            throw new RuntimeException("余额不足！");
        }
        // todo 3. 扣减余额
        userMapper.deductBalance(orders.getUid(), orders.getTotal());
        // todo 4. 创建订单 持久化
        return ordersMapper.createOrder(orders);
    }

    // 根据uid查询订单信息
    @Override
    public List<Orders> findAllByUid(Integer uid) {
        return ordersMapper.findAllByUid(uid);
    }

    @Override
    public String updateOrdersById(Orders orders) {
        log.info("修改后的信息为:[{}]", orders);
        return null;
    }
}
