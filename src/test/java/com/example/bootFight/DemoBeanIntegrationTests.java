package com.example.bootFight;

import com.example.bootFight.fortest.TestBean;
import com.example.bootFight.fortest.TestConfig;
import com.example.bootFight.redis.service.impl.UserServiceImpl;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author: wgl
 * @Date: 2019/12/14 15:06
 * @Description:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {TestConfig.class})
@ActiveProfiles("prod")
public class DemoBeanIntegrationTests {
    @Autowired
    TestBean testBean;
    @Test
    public void prodBeanShouldInject(){
        String expected = "from production profile";
        String actual = testBean.getContent();
        System.out.println("------------------------------------------------");
        Assert.assertEquals(expected,actual);
    }
}
