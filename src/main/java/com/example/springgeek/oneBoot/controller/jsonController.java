package com.example.springgeek.oneBoot.controller;

import com.example.springgeek.oneBoot.Bean.User;
import com.example.springgeek.result.JsonResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author MR.Wang
 * @dept
 * @description TODO
 * @date 2020/4/19 0:07
 **/
@RequestMapping(value = "json")
@RestController
public class jsonController {
    private static final Logger logger = LoggerFactory.getLogger(jsonController.class);
    @RequestMapping("/user")
    public JsonResult<User> getUser() {
        User user = new User(1, "王先生", "123456");
        return new JsonResult<>(user);
    }

    @RequestMapping("/list")
    public JsonResult<List> getUserList() {
        List<User> userList = new ArrayList<>();
        User user1 = new User(1, "王先生", "123456");
        User user2 = new User(2, "张女士", "123456");
        userList.add(user1);
        userList.add(user2);
        return new JsonResult<>(userList,"获取用户列表成功");
    }
    @RequestMapping("/map")
    public JsonResult<Map> getMap() {
        Map<String, Object> map = new HashMap<>(3);
        User user = new User(1, "王先生", "123456");
        map.put("用户信息", user);
        map.put("家庭住址", "北京昌平");
        map.put("公司地址", null);
        map.put("员工数量", 30);
        return new JsonResult<>(map);
    }
}
