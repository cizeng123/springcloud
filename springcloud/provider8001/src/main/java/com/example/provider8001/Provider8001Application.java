package com.example.provider8001;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.example.provider8001.mapper")
public class Provider8001Application {

    public static void main(String[] args) {
        SpringApplication.run(Provider8001Application.class, args);
    }

}

