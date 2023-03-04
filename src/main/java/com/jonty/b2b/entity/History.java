package com.jonty.b2b.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 创建作者: AHao
 * 创建日期: 2023/1/13 18:18
 * 项目名称: XiaoXiongShopping_Project
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class History { // 历史记录类

    private Integer hid;    // 记录编号
    private Integer gid;    // 商品编号
    private Integer uid;    // 用户编号
    private Date date;      // 历史记录时间
    private Integer status; // 状态
    private String spare;   // 备用字段
}
