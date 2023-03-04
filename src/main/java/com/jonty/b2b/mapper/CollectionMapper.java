package com.jonty.b2b.mapper;

import com.jonty.b2b.entity.Collection;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 创建作者: AHao
 * 创建日期: 2023/1/11 20:56
 * 项目名称: XiaoXiongShopping_Project
 */

public interface CollectionMapper {

    // 收藏商品
    int addCollection(Collection collection);

    // 取消收藏
    int deleteCollectionByUidGId(@Param("uid") Integer uid,@Param("gid") Integer gid);

    // 查询所有收藏商品 根据uid
    List<Collection> findAllByUid(Integer uid);

}
