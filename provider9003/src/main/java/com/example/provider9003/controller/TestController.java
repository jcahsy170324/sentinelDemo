package com.example.provider9003.controller;

import common.JsonResult;
import org.bouncycastle.pqc.crypto.newhope.NHOtherInfoGenerator;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * @ClassName TestController
 * @Description TODO
 * @Author jincheng
 * @Date 2022/10/3 10:01
 * @Version 1.0
 **/
@RestController
public class TestController {
    @Value("${server.port}")
    public String port;

    public static HashMap<Long, String> hashMap = new HashMap<Long, String>();

    static {
        hashMap.put(1L,"鼠标");
        hashMap.put(2L,"键盘");
        hashMap.put(3L,"耳机");
    }

    @RequestMapping("/info/{id}")
    public JsonResult<String> jcSql(@PathVariable("id") Long id){
        JsonResult<String> stringJsonResult = new JsonResult<>(200, "ServerPort:" + port + ":" + hashMap.get(id));
        return stringJsonResult;
    }

}
