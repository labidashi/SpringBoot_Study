package com.Springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
//扫描mybatis所有业务mapper接口
@MapperScan("com.Springboot.mapper")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
