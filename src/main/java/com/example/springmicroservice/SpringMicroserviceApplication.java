package com.example.springmicroservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication(scanBasePackages = "com.example")
@ComponentScan("com.example.zhuxu")
@MapperScan("com.example.zhuxu")
@SpringBootConfiguration
public class SpringMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringMicroserviceApplication.class, args);
    }

}
