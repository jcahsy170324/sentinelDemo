package com.example.consumer8084.service.impl;

import com.example.consumer8084.service.FeignService;
import common.JsonResult;
import org.springframework.stereotype.Component;

/**
 * @ClassName FeignServiceImpl
 * @Description TODO
 * @Author jincheng
 * @Date 2022/10/5 14:33
 * @Version 1.0
 **/
@Component
public class FeignServiceImpl implements FeignService {
    @Override
    public JsonResult<String> info(Long id) {
        return new JsonResult<>(444,"服务降级");
    }
}
