package com.jonty.b2b.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 创建作者: AHao
 * 创建日期: 2023/1/13 18:22
 * 项目名称: XiaoXiongShopping_Project
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Comment { // 商品评论类

    private Integer cid;    // 评论编号
    private Integer gid;    // 商品编号
    private Integer uid;    // 用户编号
    private String content; // 评论内容
    private Integer level;  // 评论星级
    private Date date;      // 评论时间
    private Integer status; // 状态
    private String spare;   // 备用字段

}
