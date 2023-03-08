package com.jonty.b2b.controller;

import com.jonty.b2b.entity.GoodsType;
import com.jonty.b2b.service.IGoodsTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 创建作者: AHao
 * 创建日期: 2022/12/27 16:48
 * 项目名称: XiaoXiongShopping_Project
 */
@RestController
@RequestMapping("/goodsType")
public class GoodsTypeController {

    @Autowired
    private IGoodsTypeService goodsTypeService;

    @GetMapping("/getAllGoodsType")
    public List<GoodsType> findGoodsType() {
        return goodsTypeService.findGoodsType();
    }
}
