package com.example.bootFight.threadPool;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * @Author: wgl
 * @Date: 2020/1/15 23:22
 * @Description:
 */
public class threadTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        /*ExecutorService executorService = Executors.newFixedThreadPool(10);
        List<Future> list = new ArrayList<>();
        for (int i = 1; i <100 ; i++) {
            Future<String> future = executorService.submit(new Callable<String>() {
                @Override
                public String call() throws Exception {
                    Thread.sleep(2000);
                    return Thread.currentThread().getName();
                }
            });
            list.add(future);
        }
       for (Future future : list){
            String str = (String) future.get();
            System.out.println(str);
        }
        executorService.shutdown();*/
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2,5,3,TimeUnit.SECONDS,new LinkedBlockingQueue<>(5));
        List<Future> list = new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
            Future<String> future = threadPoolExecutor.submit(new Callable<String>() {
                @Override
                public String call() throws Exception {
                    Thread.sleep(2000);
                    return Thread.currentThread().getName();
                }
            });
            list.add(future);
        }
        for (Future future : list){
            String str = (String) future.get();
            System.out.println(str);
        }
        threadPoolExecutor.shutdown();
    }
}
