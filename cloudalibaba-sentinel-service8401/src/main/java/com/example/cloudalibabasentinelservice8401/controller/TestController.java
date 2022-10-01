package com.example.cloudalibabasentinelservice8401.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName TestController
 * @Description TODO
 * @Author jincheng
 * @Date 2022/10/1 16:05
 * @Version 1.0
 **/
@RestController
public class TestController {
    @RequestMapping("/testA")
    public String testA(){
        try{
            TimeUnit.MILLISECONDS.sleep(800);
        }catch (Exception e) {
            e.printStackTrace();
        }
        return "testA";
    }

    @RequestMapping("/testB")
    public String testB(){
        return "testB";
    }
}
