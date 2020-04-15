package com.example.springgeek.redis;

import com.example.springgeek.redis.po.User;
import com.example.springgeek.redis.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author MR.Wang
 * @dept
 * @description TODO
 * @date 2020/3/3 22:50
 **/
@RequestMapping(value = "/redis")
@RestController
public class UserController {

    /*@Autowired
    private UserServiceImpl userService;

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String redisTest(){
        String wgl = userService.getString("wgl");
        return wgl;
    }
    @RequestMapping(value = "/test1",method = RequestMethod.GET)
    public User userGet(){
        User wangyi = userService.getObject("wangyi");
        return wangyi;
    }*/
}
