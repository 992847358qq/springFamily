package com.example.springgeek.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * @author MR.Wang
 * @dept
 * @description TODO
 * @date 2020/3/2 23:10
 **/
public class Test {
    @Autowired
    private RedisTemplate<String,Object> redisTemplate;

    public static void main(String[] args) {
        String key = "111";
    }
}
