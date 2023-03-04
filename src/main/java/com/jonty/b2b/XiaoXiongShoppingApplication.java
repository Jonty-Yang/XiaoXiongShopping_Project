package com.jonty.b2b;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.jonty.b2b.mapper")
public class XiaoXiongShoppingApplication {

    public static void main(String[] args) {
        SpringApplication.run(XiaoXiongShoppingApplication.class, args);
    }

}
