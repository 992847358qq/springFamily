package com.example.bootFight.applicationEvent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @Author: wgl
 * @Date: 2019/12/12 20:04
 * @Description: 事件发布类
 */
@Component
public class DemoPublisher {
    @Autowired
    ApplicationContext applicationContext; //注入ApplicationContext用来发布事件
    //使用ApplicationContext的publishEvent方法来发布
    public void publish(String msg){
        applicationContext.publishEvent(new DemoEvent(this,msg));
    }
}
