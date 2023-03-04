package com.jonty.b2b.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 创建作者: AHao
 * 创建日期: 2022/12/22 16:00
 * 项目名称: boot-vue-login
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonResponse<T> {

    private Integer code; // 状态码
    private String message; //消息
    private T data;  // 数据

    public CommonResponse(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
