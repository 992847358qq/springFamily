package com.example.springgeek;

import com.example.bootFight.redis.service.impl.UserServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringGeekApplicationTests {

    @Test
    public  void content(){
        UserServiceImpl service = new UserServiceImpl();
        System.out.println(service.getString("hcc"));
    }

}
