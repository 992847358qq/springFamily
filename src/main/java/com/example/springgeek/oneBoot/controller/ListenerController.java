package com.example.springgeek.oneBoot.controller;

import com.example.springgeek.oneBoot.Bean.User;
import com.example.springgeek.oneBoot.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

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
}
