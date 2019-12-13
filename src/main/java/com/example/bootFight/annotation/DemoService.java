package com.example.bootFight.annotation;

import org.springframework.stereotype.Service;

/**
 * @Author: wgl
 * @Date: 2019/12/13 17:23
 * @Description:
 */
@Service
public class DemoService {
    public void outputResult(){
        System.out.println("从组合注解配置照样获得的bean");
    }
}
