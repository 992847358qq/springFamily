package com.example.springgeek.aop;

import org.springframework.stereotype.Service;

/**
 * @author MR.Wang
 * @dept  使用注解被拦截类
 * @description TODO
 * @date 2020/4/16 0:08
 **/
@Service
public class DemoAnnotationService {
    @Action(name = "注解式拦截的add操作")
    public void add(){};
}
