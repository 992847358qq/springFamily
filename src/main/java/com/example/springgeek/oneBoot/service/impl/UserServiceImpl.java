package com.example.springgeek.oneBoot.service.impl;

import com.example.springgeek.listener.MyEvent;
import com.example.springgeek.oneBoot.Bean.User;
import com.example.springgeek.oneBoot.dao.UserMapper;
import com.example.springgeek.oneBoot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Set;

/**
 * @Author: wgl
 * @Date: 2020/04/20 15:44
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    @Resource private
    ApplicationContext applicationContext;
    @Override
    public User getUser(Long id) {
        return userMapper.getUser(id);
    }

    @Override
    public List<User> getAll() {
        return userMapper.getAll();
    }

    @Override
    public User getUserByName(String name) {
        return userMapper.getByUsername(name);
    }

    @Override
    public User getUser() {
        return new User(1,"王先生","123456");
    }

    @Override
    public User getUserEvent() {
        User user = new User(1, "王先生", "123456");
        // 发布事件
        MyEvent event = new MyEvent(this, user);
        applicationContext.publishEvent(event);
        return user;
    }

    @Override
    public Set<String> getRoles(String username) {
        return userMapper.getRoles(username);
    }

    @Override
    public Set<String> getPermissions(String username) {
        return userMapper.getPermissions(username);
    }
}
