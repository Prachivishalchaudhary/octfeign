package com.example.demo1feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class Demo1feignApplication {

    public static void main(String[] args) {
        SpringApplication.run(Demo1feignApplication.class, args);
    }

}
