package com.example.consumer8084.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import common.JsonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName DemoController
 * @Description TODO
 * @Author jincheng
 * @Date 2022/10/4 16:21
 * @Version 1.0
 **/
@RestController
@Slf4j
public class DemoController {
    //服务提供者的url
    @Value("${service-url.nacos-user-service}")
    private String SERVICE_URL;
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/consumer/fallback/{id}")
    @SentinelResource(value = "fallback",fallback = "fallbackDemo",blockHandler = "blockHandlerDemo")
    public JsonResult<String> fallback(@PathVariable Long id){
        JsonResult<String> forObject = null;
        if (id <= 3){
            //通过Ribbon发起远程访问
            forObject = restTemplate.getForObject(SERVICE_URL + "/info/" + id, JsonResult.class);
        }
        return forObject;
    }

    public JsonResult<String> fallbackDemo(Long id,Throwable e){
        JsonResult<String> result = new JsonResult<>(445,"NullPointException异常");
        return result;
    }

    public JsonResult<String> blockHandlerDemo(Long id,Throwable e){
        JsonResult<String> result = new JsonResult<>(446,"Block....");
        return result;
    }


}
