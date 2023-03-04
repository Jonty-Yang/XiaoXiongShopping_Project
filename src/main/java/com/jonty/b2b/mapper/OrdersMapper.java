package com.jonty.b2b.mapper;

import com.jonty.b2b.entity.Orders;

import java.util.List;

/**
 * 创建作者: AHao
 * 创建日期: 2023/1/11 15:41
 * 项目名称: XiaoXiongShopping_Project
 */
public interface OrdersMapper {

    // 创建订单
    int createOrder(Orders orders);

    // 根据uid查询订单信息
    List<Orders> findAllByUid(Integer uid);
}
