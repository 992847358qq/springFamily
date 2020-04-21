package com.example.springgeek.oneBoot.controller;

import com.example.springgeek.oneBoot.Bean.User;
import com.example.springgeek.oneBoot.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/**
 * @Author: wgl
 * @Date: 2020/04/20 18:34
 * @Description:
 */
@RestController
@RequestMapping("/listener")
public class ListenerController {
    @Resource
    private UserService userService;

    @GetMapping("/user")
    public User getUser(HttpServletRequest request) {
        ServletContext application = request.getServletContext();
        return (User) application.getAttribute("user");
    }
    @GetMapping("/userCount")
    public String getUserCount(HttpServletRequest request){
        Integer count = (Integer) request.getSession().getServletContext().getAttribute("count");
        return "当前在线人数:"+count;
    }
    @GetMapping("/userTotal")
    public String getUserCount1(HttpServletRequest request, HttpServletResponse response){
        Cookie cookie;
        // 把sessionId记录在浏览器中
        try {
            cookie = new Cookie("JSESSIONID", URLEncoder.encode(request.getSession().getId(), "utf-8"));
            cookie.setPath("/");
            //设置cookie有效期为2天，设置长一点
            cookie.setMaxAge( 48*60 * 60);
            response.addCookie(cookie);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        Integer count = (Integer) request.getSession().getServletContext().getAttribute("count");
        return "当前在线人数：" + count;
    }
    @GetMapping("/request")
    public String getRequestInfo(HttpServletRequest request) {
        System.out.println("requestListener中的初始化的name数据：" + request.getAttribute("name"));
        return "success";
    }

    @GetMapping("/publish")
    public User publishEvent() {
        return userService.getUserEvent();
    }
}
