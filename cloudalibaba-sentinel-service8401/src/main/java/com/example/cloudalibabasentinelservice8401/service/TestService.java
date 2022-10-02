package com.example.cloudalibabasentinelservice8401.service;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.stereotype.Service;

/**
 * @ClassName TestService
 * @Description TODO
 * @Author jincheng
 * @Date 2022/10/2 8:00
 * @Version 1.0
 **/
@Service
public class TestService {
    @SentinelResource("common")
    public String common(){
        return "common";
    }
}
