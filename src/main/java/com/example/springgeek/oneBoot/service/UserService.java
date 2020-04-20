package com.example.springgeek.oneBoot.service;

import com.example.springgeek.oneBoot.Bean.User;

import java.util.List;

/**
 * @Author: wgl
 * @Date: 2020/04/20 15:44
 * @Description:
 */
public interface UserService {
    User getUser(Long id);

    List<User> getAll();

    User getUserByName(String name);

    User getUser();
}
