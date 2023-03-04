package com.jonty.b2b.advice;

import com.jonty.b2b.common.CommonResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * 创建作者: AHao
 * 创建日期: 2022/12/22 16:15
 * 项目名称: boot-vue-login
 */
@RestControllerAdvice
public class GlobalExceptionAdvice {

    @ExceptionHandler(value = Exception.class)
    public CommonResponse<String> handleException(HttpServletRequest request, Exception ex) {
        CommonResponse<String> response = new CommonResponse<>();
        response.setCode(500);
        response.setMessage("error");
        response.setData(ex.getMessage());
        return response;
    }
}
