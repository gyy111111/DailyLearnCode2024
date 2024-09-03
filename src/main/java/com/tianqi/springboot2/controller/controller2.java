package com.tianqi.springboot2.controller;

import com.tianqi.springboot2.bean.User;
import com.tianqi.springboot2.service.service2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author GYY
 * @date 2024/9/3 9:49
 * @description 控制器类2
 */
@RestController
//注意:@RestController注解相当于@Controller+@ResponseBody,
public class controller2 {
    private final service2 service2;
    private final User user;
    @Autowired
    public controller2(service2 service, User user) {
        this.service2 = service;
        this.user = user;
    }



    @GetMapping("/doTest2")
    public String doSomething() {
        return service2.doTest2()+" " + user.getName();
    }

}
