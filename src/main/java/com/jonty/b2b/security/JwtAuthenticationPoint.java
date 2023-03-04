package com.jonty.b2b.security;

import com.alibaba.fastjson.JSON;
import com.jonty.b2b.common.CommonResponse;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 创建作者: AHao
 * 创建日期: 2022/12/27 16:55
 * 项目名称: XiaoXiongShopping_Project
 */

public class JwtAuthenticationPoint implements AuthenticationEntryPoint {
    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException ex) throws IOException, ServletException {
        CommonResponse resp = new CommonResponse();
        resp.setCode(403);
        resp.setMessage("authentication error");
        resp.setData(ex.getMessage());
        response.setContentType("application/json;charset=utf-8");
        PrintWriter writer = response.getWriter();
        writer.write(JSON.toJSONString(resp));
        writer.flush();
        writer.close();
    }
}
