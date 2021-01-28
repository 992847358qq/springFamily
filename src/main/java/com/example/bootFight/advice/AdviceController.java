package com.example.bootFight.advice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: wgl
 * @Date: 2019/12/16 16:40
 * @Description:
 */
@Controller
public class AdviceController {
    @RequestMapping("/advice")
    @ResponseBody
    public String gerSomething(@ModelAttribute("msg")String msg){
        throw new IllegalArgumentException("非常抱歉，参数有误"+"来自@ModelAttribute"+msg);
    }
}
