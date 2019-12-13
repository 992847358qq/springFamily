package com.example.bootFight.tasksScheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: wgl
 * @Date: 2019/12/13 16:31
 * @Description:
 */
@Service
public class ScheduledTaskService {
    private static final SimpleDateFormat dataFormat= new SimpleDateFormat("HH:mm:ss");
    @Scheduled(fixedRate =  5000)
    public void reportTime(){
        System.out.println("每隔五秒执行一次"+dataFormat.format(new Date()));
    }
    @Scheduled(cron = "00 39 16 ? * *")
    public void fixTimeExecution(){
        System.out.println("在指定时间"+dataFormat.format(new Date())+"执行");
    }
}
