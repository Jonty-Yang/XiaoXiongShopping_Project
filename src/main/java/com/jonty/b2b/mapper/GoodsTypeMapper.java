package com.jonty.b2b.mapper;

import com.jonty.b2b.entity.GoodsType;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 创建作者: AHao
 * 创建日期: 2022/12/27 16:44
 * 项目名称: XiaoXiongShopping_Project
 */
public interface GoodsTypeMapper {

    @Select("select * from goods_type")
    List<GoodsType> findGoodsType();
}
