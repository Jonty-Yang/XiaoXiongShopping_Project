package com.jonty.b2b.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 创建作者: AHao
 * 创建日期: 2022/12/22 15:53
 * 项目名称: boot-vue-login
 */

@Configuration
public class WebConfig {

    // 解决前后端跨域问题
    @Bean
    public WebMvcConfigurer webMvcConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                        .allowedOrigins("*")
                        .allowedMethods("GET", "POST", "OPTIONS", "PUT", "DELETE")
                        .maxAge(3600);
            }
        };
    }
}
