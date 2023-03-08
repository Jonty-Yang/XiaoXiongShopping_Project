package com.jonty.b2b.controller;

import com.jonty.b2b.entity.Collection;
import com.jonty.b2b.service.ICollectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 创建作者: AHao
 * 创建日期: 2023/1/11 21:06
 * 项目名称: XiaoXiongShopping_Project
 */
@RestController
@RequestMapping("/collection")
public class CollectionController {

    @Autowired
    private ICollectionService collectionService;

    @PostMapping("/add")
    public String addCollection(@RequestBody Collection collection) {
        int add = collectionService.addCollection(collection);
        String msg = "";
        if (add == 1) {
            msg = "收藏成功";
        } else if (add == 2) {
            msg = "已经收藏过了";
        } else {
            msg = "收藏失败";
        }
        return msg;
    }

    @DeleteMapping("/deleteByUidGid/{uid}/{gid}")
    public String deleteCollectionByUidGId(@PathVariable("uid") Integer uid,
                                           @PathVariable("gid") Integer gid) {
        return collectionService.deleteCollectionByUidGId(uid, gid) >= 1 ? "删除成功！" : "删除失败！";
    }

    @GetMapping("/findAllByUid/{uid}")
    public List<Collection> findAllByUid(@PathVariable("uid") Integer uid) {
        return collectionService.findAllByUid(uid);
    }
}
