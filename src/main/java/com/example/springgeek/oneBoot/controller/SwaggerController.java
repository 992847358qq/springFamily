package com.example.springgeek.oneBoot.controller;

import com.example.springgeek.oneBoot.Bean.User;
import com.example.springgeek.result.JsonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

/**
 * @author MR.Wang
 * @dept
 * @description TODO
 * @date 2020/4/19 15:43
 **/
@RestController
@RequestMapping("/swagger")
@Api(value ="swagger2 在线接口文档")
public class SwaggerController {

    @GetMapping("/get/{id}")
    @ApiOperation(value = "根据用户唯一标识获取用户信息")
    public JsonResult<User> getUserInfo(@PathVariable @ApiParam(value = "用户唯一标识") int id) {
        // 模拟数据库中根据id获取User信息
        User user = new User(id, "王先生", "123456");
        return new JsonResult(user);
    }

    @PostMapping("/insert")
    @ApiOperation(value = "添加用户信息")
    public JsonResult<Void> insertUser(@RequestBody @ApiParam(value = "用户信息") User user) {
        // 处理添加逻辑
        return new JsonResult<>();
    }

}
