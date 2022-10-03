package com.example.cloudalibabasentinelservice8401.common;

import com.alibaba.csp.sentinel.slots.block.BlockException;

/**
 * @ClassName BlockHandler
 * @Description TODO
 * @Author jincheng
 * @Date 2022/10/3 8:13
 * @Version 1.0
 **/
public class BlockHandler {
    public static String handlerException1(BlockException e){
        return "handlerException1. System is busy";
    }

    public static String handlerException2(BlockException e) {
        return "handlerException2. System is busy";
    }
}
