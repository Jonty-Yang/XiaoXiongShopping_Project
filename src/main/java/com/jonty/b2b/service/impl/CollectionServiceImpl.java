package com.jonty.b2b.service.impl;

import com.jonty.b2b.entity.Collection;
import com.jonty.b2b.mapper.CollectionMapper;
import com.jonty.b2b.service.ICollectionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * 创建作者: AHao
 * 创建日期: 2023/1/11 21:03
 * 项目名称: XiaoXiongShopping_Project
 */

@Service
@Slf4j
public class CollectionServiceImpl implements ICollectionService {

    @Autowired
    private CollectionMapper collectionMapper;

    // 收藏商品
    @Override
    public int addCollection(Collection collection) {
        collection.setDate(new Date());
        // 先查询当前用户所有收藏的商品
        List<Collection> collectionList = collectionMapper.findAllByUid(collection.getUid());
        for (Collection c : collectionList) {
            if (c.getGid() == (int) collection.getGid()) {
                // 说明已经收藏过
                return 2;
            }
        }
        return collectionMapper.addCollection(collection);
    }

    @Override
    public int deleteCollectionByUidGId(Integer uid, Integer gid) {
        return collectionMapper.deleteCollectionByUidGId(uid, gid);
    }

    @Override
    public List<Collection> findAllByUid(Integer uid) {
        return collectionMapper.findAllByUid(uid);
    }
}
