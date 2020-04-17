package com.example.springgeek.config;

import org.springframework.boot.autoconfigure.data.rest.RepositoryRestMvcAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author MR.Wang
 * @dept
 * @description TODO
 * @date 2020/4/15 23:06
 **/
@Configuration
@Import(RepositoryRestMvcAutoConfiguration.class)
public class AppConfig {

}
