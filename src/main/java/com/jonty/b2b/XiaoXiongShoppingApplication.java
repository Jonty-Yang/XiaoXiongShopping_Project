package com.jonty.b2b;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.jonty.b2b.mapper")
@Slf4j
public class XiaoXiongShoppingApplication {

    public static void main(String[] args) {
        SpringApplication.run(XiaoXiongShoppingApplication.class, args);
        log.info("项目启动成功！");
        log.info("项目启动成功 master");
        log.info("项目启动成功 dev");
    }

}
