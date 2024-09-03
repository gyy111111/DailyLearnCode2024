package com.tianqi.springboot2.config;

import com.tianqi.springboot2.bean.Cat;
import com.tianqi.springboot2.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author GYY
 * @date 2024/9/3 9:12
 * @description 作为springboot的配置文件进行使用
 */
@Configuration
public class appConfig1 {
    @Bean("User")
    public User getUser(){
        User user = new User();
        user.setId(1L);
        user.setName("张三");
        return user;
    }
    @Bean("Cat")
    public Cat getCat(){
        return new Cat();
    }
}
