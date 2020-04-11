package com.example.bootFight;

import com.example.bootFight.redis.service.UserService;
import com.example.bootFight.redis.service.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author MR.Wang
 * @dept
 * @description TODO
 * @date 2020/3/2 23:54
 **/
@SpringBootTest
public class SpringBootFightTest {

    @Test
    public void contextLoads(){
        UserService userService = new UserServiceImpl();
        userService.getString("wgl");
    }

}
