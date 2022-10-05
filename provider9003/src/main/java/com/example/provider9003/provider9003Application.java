package com.example.provider9003;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName provider9003Application
 * @Description TODO
 * @Author jincheng
 * @Date 2022/10/3 9:53
 * @Version 1.0
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class provider9003Application {
    public static void main(String[] args) {
        SpringApplication.run(provider9003Application.class,args);
    }
}
