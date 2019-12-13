package com.example.bootFight.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: wgl
 * @Date: 2019/12/13 17:29
 * @Description:
 */
public class AnnotationMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(DemoConfig.class);
        DemoService bean = applicationContext.getBean(DemoService.class);
        bean.outputResult();
        applicationContext.close();
    }
}
