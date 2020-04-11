package com.example.springgeek.redis.service;

import com.example.springgeek.redis.po.User;

public interface UserService {
    String getString(String key);

    User getObject(String key);
}
