package com.example.openFeignConsumer;

import feign.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

/**
 * @ClassName openFeignConsumerApplication
 * @Description TODO
 * @Author jincheng
 * @Date 2022/10/5 12:09
 * @Version 1.0
 **/
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class openFeignConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(openFeignConsumerApplication.class, args);
    }

    @Bean
    Logger.Level feginLoggerLevel(){
        return Logger.Level.FULL;
    }
}
