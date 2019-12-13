package com.example.bootFight.tasksScheduler;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @Author: wgl
 * @Date: 2019/12/13 16:35
 * @Description:
 */
@Configuration
@ComponentScan("com.example.bootFight.tasksScheduler")
@EnableScheduling
public class TaskSchedulerConfig {
}
