package com.example.bootFight.conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: wgl
 * @Date: 2019/12/13 16:49
 * @Description:
 */
@Configuration
public class ConditionConfig {

    @Bean
    @Conditional(WindowsContiditon.class)
    public TypeService windowsTypeService(){
        return  new WindowsService();
    }

}
