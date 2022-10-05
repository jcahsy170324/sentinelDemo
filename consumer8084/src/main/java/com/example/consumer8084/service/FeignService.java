package com.example.consumer8084.service;

import com.example.consumer8084.service.impl.FeignServiceImpl;
import common.JsonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Service
@FeignClient(value = "nacos-provider")
public interface FeignService {
    /**
     * 远程调用对应方法
     **/
    @GetMapping("info/{id}")
    public JsonResult<String> info(@PathVariable("id") Long id);
}
