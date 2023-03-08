package com.jonty.b2b.service.impl;

import com.jonty.b2b.entity.GoodsType;
import com.jonty.b2b.mapper.GoodsTypeMapper;
import com.jonty.b2b.service.IGoodsTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 创建作者: AHao
 * 创建日期: 2022/12/27 16:47
 * 项目名称: XiaoXiongShopping_Project
 */

@Service
public class GoodsTypeServiceImpl implements IGoodsTypeService {

    @Autowired
    private GoodsTypeMapper goodsTypeMapper;

    @Override
    public List<GoodsType> findGoodsType() {
        return goodsTypeMapper.findGoodsType();
    }
}
