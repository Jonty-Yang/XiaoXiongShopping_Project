package com.jonty.b2b.controller;

import com.jonty.b2b.entity.Orders;
import com.jonty.b2b.service.IOrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 创建作者: AHao
 * 创建日期: 2023/1/11 15:50
 * 项目名称: XiaoXiongShopping_Project
 */
@RestController
@RequestMapping("/orders")
public class OrdersController {

    @Autowired
    private IOrdersService ordersService;

    @PostMapping("/buy")
    public String creatOrders(@RequestBody Orders orders){
        int add = ordersService.createOrder(orders);
        return add > 0 ? "下单成功！" : "下单失败！";
    }

    // 根据uid查询订单信息
    @GetMapping("/findOrdersByUid/{uid}")
    public List<Orders> findOrdersByUid(@PathVariable("uid") Integer uid){
        return ordersService.findAllByUid(uid);
    }
}
