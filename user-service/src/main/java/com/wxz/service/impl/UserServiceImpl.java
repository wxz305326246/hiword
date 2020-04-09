package com.wxz.service.impl;

import com.wxz.entity.Goods;
import com.wxz.entity.User;
import com.wxz.mapper.UserMapper;
import com.wxz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User login(User user) {
        User user1=userMapper.login(user);
        return user1;
    }

    @Override
    public List<Goods> list() {
        return userMapper.list();
    }

    @Override
    public void insert(User user) {
       userMapper.insert(user);
    }
}
