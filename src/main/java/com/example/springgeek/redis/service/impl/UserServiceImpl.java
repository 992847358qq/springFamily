package com.example.springgeek.redis.service.impl;

import com.example.springgeek.redis.po.User;
import com.example.springgeek.redis.service.UserService;
import lombok.extern.java.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

/**
 * @author MR.Wang
 * @dept
 * @description TODO
 * @date 2020/3/2 23:21
 **/
@Service
@Log
public class UserServiceImpl implements UserService {
/*    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private RedisTemplate<String,Object> redisTemplate;

    @Override
    public String getString(String key) {
        if (redisTemplate.hasKey(key)){
            logger.info("从redis中取值");
            return  (String) redisTemplate.opsForValue().get(key);
        }else {
            String val = "加载redisTemplate";
            logger.info("从数据库中查取key值");
            redisTemplate.opsForValue().set(key,val);
            logger.info("从数据库中取的key值为："+val);
            return val;
        }
    }

    @Override
    public User getObject(String key) {

        if (redisTemplate.opsForHash().hasKey("user",key)){
            return (User) redisTemplate.opsForHash().get(key,key);
        }else {
            User user = new User();
            user.setId(1);
            user.setName("王一");
            user.setAge(12);
            redisTemplate.opsForHash().put("user",key,user);
            return user;
        }
    }*/
}
