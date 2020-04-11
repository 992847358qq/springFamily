package com.example.springgeek.redis.config;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

/**
 * @author MR.Wang
 * @dept
 * @description TODO
 * @date 2020/3/2 23:10
 **/
@Configuration
public class RedisConfig {
    /*@Bean
    public LettuceConnectionFactory jedisConnectionFactory(){
        LettuceConnectionFactory jedisConnectionFactory = new LettuceConnectionFactory();
        return jedisConnectionFactory;
    }*/
    /*@Bean
    public CacheManager cacheManager(LettuceConnectionFactory factory){
        RedisCacheWriter redisCacheWriter = RedisCacheWriter.lockingRedisCacheWriter(factory);
        RedisCacheConfiguration configuration = RedisCacheConfiguration.defaultCacheConfig();
        RedisCacheManager cacheManager = new RedisCacheManager(redisCacheWriter,configuration);
        return cacheManager;
    }*/
    @Bean
    public RedisTemplate<String,Object> redisTemplate(RedisConnectionFactory factory){
        RedisTemplate<String,Object> template = new RedisTemplate<>();
        template.setConnectionFactory(factory);
        Jackson2JsonRedisSerializer jackson2JsonRedisSerializer = new Jackson2JsonRedisSerializer(Object.class);
        ObjectMapper om = new ObjectMapper();
        om.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);
        om.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);
        jackson2JsonRedisSerializer.setObjectMapper(om);
        StringRedisSerializer stringRedisSerializer = new StringRedisSerializer();
        //在使用注解@Bean返回RedisTemplate的时候，同时配置hashKey与hashValue的序列化方式
        //key采用Sring的序列化方式
        template.setKeySerializer(stringRedisSerializer);
        //value采用jackson
        template.setValueSerializer(jackson2JsonRedisSerializer);
        //hash的key也采用string序列化
        template.setHashKeySerializer(stringRedisSerializer);
        template.setHashValueSerializer(jackson2JsonRedisSerializer);
        template.afterPropertiesSet();
        return template;
    }
}
