package com.example.springgeek.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author MR.Wang
 * @dept
 * @description TODO
 * @date 2020/4/16 0:23
 **/
@Configuration
@ComponentScan("com.example.springgeek.aop")
@EnableAspectJAutoProxy
public class AopConfig {
}
