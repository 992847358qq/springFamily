package com.example.bootFight.taskexecutor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @Author: wgl
 * @Date: 2019/12/13 14:23
 * @Description:
 */
@Service
public class AsyncTaskService {
    //通过@Async注解表明该方法是个异步方法，如果注明在类级别，则表明该类所有的方法都是异步方法
    //而这里的方法自动被注入使用ThreadPoolTaskExector作为TaskExector
    @Async
    public void executeAsyncTask(Integer i){
        System.out.println("执行异步任务："+i);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Async
    public void executeAsyncTaskPlus(Integer i){
        System.out.println("执行异步任务+1："+(i+1));
    }

}
