package com.example.provider9005;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName provider9005Application
 * @Description TODO
 * @Author jincheng
 * @Date 2022/10/3 9:58
 * @Version 1.0
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class Provider9005Application {
    public static void main(String[] args) {
        SpringApplication.run(Provider9005Application.class,args);
    }
}
