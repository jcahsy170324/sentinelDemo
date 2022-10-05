package com.example.openFeignConsumer.service;

import common.JsonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @ClassName OpenFeignService
 * @Description TODO
 * @Author jincheng
 * @Date 2022/10/5 13:01
 * @Version 1.0
 **/
@Service
//远程调用服务名称
@FeignClient("nacos-provider")
public interface OpenFeignService {
    /**
     **此方法表示远程调用服务info/{id}接口
     **/
    @GetMapping("info/{id}")
    public JsonResult<String> jcSql(@PathVariable("id")Long id);
}
