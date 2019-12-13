package com.example.bootFight.aware;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

/**
 * @Author: wgl
 * @Date: 2019/12/12 22:02
 * @Description:
 */
public class Main {
    public static void main(String[] args) throws IOException {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AwareConfig.class);
        AwareService bean = applicationContext.getBean(AwareService.class);
        bean.outputResult();
        applicationContext.close();
    }
}
