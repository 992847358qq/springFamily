package com.example.springgeek.redis.po;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Bean;

/**
 * @author MR.Wang
 * @dept
 * @description TODO
 * @date 2020/3/3 23:41
 **/
@Getter
@Setter
public class User {
    private Integer id;
    private String name;
    private Integer age;
}
