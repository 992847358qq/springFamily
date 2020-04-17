package com.example.springgeek.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author MR.Wang
 * @dept
 * @description TODO
 * @date 2020/4/16 0:25
 **/
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AopConfig.class);
        DemoAnnotationService demoAnnotationService = context.getBean(DemoAnnotationService.class);
        DemoMethodService demoMethodService = context.getBean(DemoMethodService.class);
        demoAnnotationService.add();
        demoMethodService.add();
        context.close();
    }
}
