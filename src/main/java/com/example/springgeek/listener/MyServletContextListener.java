package com.example.springgeek.listener;

import com.example.springgeek.oneBoot.Bean.User;
import com.example.springgeek.oneBoot.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import javax.servlet.ServletContext;

/**
 * @Author: wgl
 * @Date: 2020/04/20 18:08
 * @Description: 使用ApplicationListener来初始化一些数据到application域中的监听器
 */
@Component
public class MyServletContextListener implements ApplicationListener<ContextRefreshedEvent> {
    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        //先获取application上下文
        ApplicationContext applicationContext = contextRefreshedEvent.getApplicationContext();
        //获取对应的service
        UserService userService = applicationContext.getBean(UserService.class);
        User user = userService.getUser();
        //获取application域对象，将查到的信息放入到application域中
        ServletContext servletContext = applicationContext.getBean(ServletContext.class);
        servletContext.setAttribute("user",user);
    }
}
