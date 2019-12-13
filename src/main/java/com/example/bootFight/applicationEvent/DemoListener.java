package com.example.bootFight.applicationEvent;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @Author: wgl
 * @Date: 2019/12/12 19:59
 * @Description: 事件监听器
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent> { //实现ApplicationListener接口，并指定监听的事件类型
    @Override
    public void onApplicationEvent(DemoEvent demoEvent) {//使用onApplicationEvent方法对消息进行接受处理
        String msg = demoEvent.getMsg();
        System.out.println("我（bean-demoListener）接收到了bean-demoPublisher发布的信息："+msg);
    }
}
