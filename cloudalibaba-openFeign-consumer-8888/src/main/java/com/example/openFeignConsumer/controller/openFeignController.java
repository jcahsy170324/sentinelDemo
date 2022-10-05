package com.example.openFeignConsumer.controller;

import com.example.openFeignConsumer.service.OpenFeignService;
import common.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName openFeignController
 * @Description TODO
 * @Author jincheng
 * @Date 2022/10/5 13:16
 * @Version 1.0
 **/
@RestController
public class openFeignController {
    @Autowired
    OpenFeignService openFeignService;

    @RequestMapping("getInfo/{id}")
    public JsonResult<String> getInfo(@PathVariable("id") Long id){
        return openFeignService.jcSql(id);
    }
}
