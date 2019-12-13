package com.example.bootFight.taskexecutor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.concurrent.LinkedBlockingQueue;

/**
 * @Author: wgl
 * @Date: 2019/12/13 14:34
 * @Description:
 */
public class Main {
    public static final LinkedBlockingQueue<Integer> UrlQuece1 = new LinkedBlockingQueue<>(100);
    static {
        UrlQuece1.add(1);
        UrlQuece1.add(2);
        UrlQuece1.add(3);
        UrlQuece1.add(4);
        UrlQuece1.add(5);
        UrlQuece1.add(6);
        UrlQuece1.add(7);
        UrlQuece1.add(8);
        UrlQuece1.add(9);
        UrlQuece1.add(10);
        UrlQuece1.add(11);
        UrlQuece1.add(12);
        UrlQuece1.add(13);
    }
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(TaskExecutorConfig.class);
        AsyncTaskService taskService = applicationContext.getBean(AsyncTaskService.class);
        while (!UrlQuece1.isEmpty()){
            Integer i = UrlQuece1.poll();
            taskService.executeAsyncTask(i);
            //taskService.executeAsyncTaskPlus(i);
        }
        applicationContext.close();
    }
}
