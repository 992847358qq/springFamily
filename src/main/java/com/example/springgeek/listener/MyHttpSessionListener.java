package com.example.springgeek.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpSessionListener;

/**
 * @Author: wgl
 * @Date: 2020/04/20 18:38
 * @Description:
 */
@Component
public class MyHttpSessionListener implements HttpSessionListener {
    private static final Logger logger = LoggerFactory.getLogger(MyHttpSessionListener.class);

}
