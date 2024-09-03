package com.tianqi.springboot2.service;

import org.springframework.stereotype.Service;

/**
 * @author GYY
 * @date 2024/9/3 9:29
 * @description 接口的实现类
 */
@Service
public class service1Implement implements service1 {
    @Override
    public String doTest() {
        return "service1Implement{}";
    }
}
