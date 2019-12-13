package com.example.bootFight.conditional;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: wgl
 * @Date: 2019/12/13 16:52
 * @Description:
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConditionConfig.class);
        TypeService service = applicationContext.getBean(TypeService.class);
        System.out.println(applicationContext.getEnvironment().getProperty("os.name")+"系统下的列表命令为"+service.showOperationCmd());
    }
}
