package com.example.springgeek.oneBoot.controller;

import com.example.springgeek.annotation.UnInterception;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/interceptor")
public class InterceptorController {

    @RequestMapping("/test")
    public String test(){
        return "hello.html";
    }

    @UnInterception
    @RequestMapping("/test2")
    @ResponseBody
    public String test2() {
        return "我没有被拦截";
    }
}
