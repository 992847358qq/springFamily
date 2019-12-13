package com.example.bootFight.applicationEvent;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: wgl
 * @Date: 2019/12/12 20:23
 * @Description:
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(EventConfig.class);
        DemoPublisher demoPublisher = applicationContext.getBean(DemoPublisher.class);
        demoPublisher.publish("hello application event");
        applicationContext.close();
    }
}
