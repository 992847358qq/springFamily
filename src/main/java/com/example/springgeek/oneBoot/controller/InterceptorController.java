package com.example.springgeek.oneBoot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/interceptor")
public class InterceptorController {

    @RequestMapping("/test")
    public String test(){
        return "hello.html";
    }
}
