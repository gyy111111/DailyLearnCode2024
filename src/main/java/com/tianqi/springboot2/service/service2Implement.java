package com.tianqi.springboot2.service;

import org.springframework.stereotype.Service;

/**
 * @author GYY
 * @date 2024/9/3 9:48
 * @description 接口二的实现类
 */
@Service
public class service2Implement  implements service2{
    @Override
    public String doTest2() {
        return "测试2成功了";
    }

    @Override
    public String gyyTest2() {
        return "gyy测试二也成功了";
    }
}
