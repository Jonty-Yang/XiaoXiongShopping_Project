package com.jonty.b2b.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 创建作者: AHao
 * 创建日期: 2023/3/5 13:20
 * 项目名称: xiao_xiong_shopping
 */


/**
 * ID 封装类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TableId {

    private List<Id> ids;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Id {
        private Integer id;
    }
}
