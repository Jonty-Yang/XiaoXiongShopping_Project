package com.jonty.b2b.service;

import com.jonty.b2b.entity.GoodsType;

import java.util.List;

/**
 * 创建作者: AHao
 * 创建日期: 2022/12/27 16:46
 * 项目名称: XiaoXiongShopping_Project
 */
public interface IGoodsTypeService {

    List<GoodsType> findGoodsType();
}
