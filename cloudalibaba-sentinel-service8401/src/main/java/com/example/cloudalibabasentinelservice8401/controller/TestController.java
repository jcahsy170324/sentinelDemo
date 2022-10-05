package com.example.cloudalibabasentinelservice8401.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.example.cloudalibabasentinelservice8401.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
    @Autowired
    TestService testService;

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
        return testService.common();
    }

    @RequestMapping("/testService")
    public String testService(){
        return testService.common();
    }

    @RequestMapping("/testC")
    public String testC(){
        return "testC";
    }

    @RequestMapping("/testD")
    public String testD(Integer id){
        if (id != null && id > 1){
            throw new RuntimeException("异常熔断");
        }
        return "testD";
    }

    @RequestMapping("/testHotKey")
    @SentinelResource(value = "testHotKey",blockHandler = "myBlockHandler")
    public String testHotKey(@RequestParam(value = "hot1",required = false)String hot1,
                             @RequestParam(value = "hot2",required = false)String hot2,
                             @RequestParam(value = "hot3",required = false)String hot3){

        return "testHotKey...";
    }

    public String myBlockHandler(String hot1, String hot2, String hot3, BlockException exception){
        return "System is busy";
    }

    @RequestMapping("/testHandler")
    @SentinelResource(value = "testHandler",blockHandlerClass = com.example.cloudalibabasentinelservice8401.common.BlockHandler.class,
    blockHandler = "handlerException1")
    public String testHandler(){
        return "----testHandler";
    }

    @GetMapping("/order/test1")
    @SentinelResource(value = "test1")
    public String test1() throws InterruptedException {
        return "test1 ";
    }
}
