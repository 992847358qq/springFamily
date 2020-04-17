package com.example.springgeek.volatile1;


import java.util.concurrent.TimeUnit;

/**
 * @author MR.Wang
 * @dept
 * @description TODO
 * @date 2020/3/5 22:23
 **/
public class TestV {
/*        //volatile Integer index = 1;
           boolean bool = true;
           volatile User user = new User();
    public static void main(String[] args) {
        TestV testV = new TestV();
        testV.user.setAge(10);
        *//*new Thread(testV.m(testV.index),"t1").start();
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*//*
        System.out.println(testV.user.getAge());
       new Thread(()->{
           System.out.println(Thread.currentThread().getName());
           testV.n(testV.user);
       },"AAA").start();
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        testV.m(testV.user);
        System.out.println(testV.user.getAge());
       //testV.bool = false;
    }
    void m(User user ){
        System.out.println("开启线程 m");
        user.setAge(5);
        System.out.println(user);
        System.out.println("结束线程 m");
    }
    void n(User user){
        System.out.println("开启线程 n");
        System.out.println(user);
        while (user.getAge()>6){
        }
        System.out.println("结束线程 n");
    }*/
}
