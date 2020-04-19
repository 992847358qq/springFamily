package com.example.springgeek.oneBoot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author MR.Wang
 * @dept
 * @description TODO
 * @date 2020/4/19 13:23
 **/
@RestController
@RequestMapping(value = "slf")
public class LogController {
    private final static Logger logger = LoggerFactory.getLogger(LogController.class);

    @RequestMapping("/log")
    public String testLog() {
        logger.debug("=====测试日志debug级别打印====");
        logger.info("======测试日志info级别打印=====");
        logger.error("=====测试日志error级别打印====");
        logger.warn("======测试日志warn级别打印=====");

        // 可以使用占位符打印出一些参数信息
        String str1 = "www.baidu.com";
        String str2 = "www.leetcode.com";
        logger.info("网站链接：{}",str1);
        logger.info("做题链接：{}",str2);
        return "success";
    }
}
