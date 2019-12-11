package com.example.bootFight;

import com.example.bootFight.service.DemoPrototypeService;
import com.example.bootFight.service.DemoSingletonService;
import com.example.bootFight.service.ScopeConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: wgl
 * @Date: 2019/12/11 09:35
 * @Description:
 */
@SpringBootApplication
public class SpringFightApplication {
    /*public static void main(String[] args) {
        SpringApplication.run(SpringFightApplication.class,args);

    }*/
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScopeConfig.class);
        //单例
        DemoSingletonService s1 = context.getBean(DemoSingletonService.class);
        DemoSingletonService s2 = context.getBean(DemoSingletonService.class);
        //多例
        DemoPrototypeService p2 = context.getBean(DemoPrototypeService.class);
        DemoPrototypeService p1 = context.getBean(DemoPrototypeService.class);

        System.out.println("s1与s2是否相等: "+s1.equals(s2));
        System.out.println("p1与p2是否相等: "+p1.equals(p2));

        context.close();
    }
}
