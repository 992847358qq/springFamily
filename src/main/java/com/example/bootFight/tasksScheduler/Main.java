package com.example.bootFight.tasksScheduler;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: wgl
 * @Date: 2019/12/13 16:36
 * @Description:
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(TaskSchedulerConfig.class);
        ScheduledTaskService bean = applicationContext.getBean(ScheduledTaskService.class);

    }
}
