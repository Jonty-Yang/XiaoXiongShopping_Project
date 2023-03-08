package com.jonty.b2b.advice;

import com.alibaba.fastjson.JSON;

import com.jonty.b2b.annotation.IgnoreResponseAdvice;
import com.jonty.b2b.common.CommonResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

/**
 * 创建作者: AHao
 * 创建日期: 2022/12/22 16:05
 * 项目名称: boot-vue-login
 */
@RestControllerAdvice
@Slf4j
public class CommonResponseDataAdvice implements ResponseBodyAdvice {

    @Override
    public boolean supports(MethodParameter methodParameter, Class converterType) {
        // 如果当前方法使用了自定义注解IgnoreResponseAdvice 就不进行响应数据封装
        if (methodParameter.getMethod().isAnnotationPresent(IgnoreResponseAdvice.class)) {
            return false;
        }
        // 如果类上使用了自定义注解IgnoreResponseAdvice 就不进行响应数据封装
        if (methodParameter.getDeclaringClass().isAnnotationPresent(IgnoreResponseAdvice.class)) {
            return false;
        }
        return true;
    }

    @Override
    public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType, Class selectedConverterType, ServerHttpRequest request, ServerHttpResponse response) {
        CommonResponse<Object> commonResponse = new CommonResponse<>(0, "");
        if (body == null) {
            return commonResponse;
        } else if (body instanceof CommonResponse) {
            commonResponse = (CommonResponse<Object>) body;
        } else {
            commonResponse.setCode(200);
            commonResponse.setMessage("success");
            commonResponse.setData(body);
        }

        // 如果数据就是一个字符串，需要手动转json
        if (StringHttpMessageConverter.class.isAssignableFrom(selectedConverterType)) {
            log.info("converter: [{}]", selectedConverterType);
            return JSON.toJSONString(commonResponse);
        }
        return commonResponse;
    }
}
