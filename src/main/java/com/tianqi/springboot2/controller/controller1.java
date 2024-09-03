package com.tianqi.springboot2.controller;

import com.tianqi.springboot2.service.service1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author GYY
 * @date 2024/9/3 9:30
 * @description 控制器类
 */
@RestController
@RequestMapping("/api")
public class controller1 {
    private final service1 service;
    @Autowired
    public controller1(service1 service){
        this.service = service;
    }
    @GetMapping("/doTest1")
    public ResponseEntity<String> doSomething() {
        // 调用Service方法
        String result = service.doTest();
        return ResponseEntity.ok(result);
    }
}
