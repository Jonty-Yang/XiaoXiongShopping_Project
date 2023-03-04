package com.jonty.b2b.filter;

import com.jonty.b2b.util.JwtUtils;
import io.jsonwebtoken.Claims;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collections;
import java.util.Date;

/**
 * 创建作者: AHao
 * 创建日期: 2022/12/27 16:54
 * 项目名称: XiaoXiongShopping_Project
 */


public class AuthFilter extends OncePerRequestFilter {
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        // 放行login和/user/register请求
        if(request.getRequestURI().contains("login") || request.getRequestURI().contains("/user/register")){
            filterChain.doFilter(request,response);
            return;
        }
        // 放行axios试探请求方法options
        if(request.getMethod().equalsIgnoreCase("options")){
            filterChain.doFilter(request,response);
            return;
        }
        // 获取请求头中的token
        String token = request.getHeader("token");
        if(token == null){
            throw new RuntimeException("凭证不能为空");
        }
        // 解析凭证
        Claims claims = JwtUtils.parse(token);
        if(claims.getExpiration().before(new Date())){
            throw new RuntimeException("凭证已过期！");
        }
        // 存到上下文
        SecurityContextHolder.getContext().setAuthentication(
                new UsernamePasswordAuthenticationToken(
                        claims.getSubject(),
                        null,
                        Collections.emptyList()
                )
        );
        filterChain.doFilter(request,response);
    }
}
