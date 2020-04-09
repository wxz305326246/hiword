package com.wxz.mapper;

import com.wxz.entity.Goods;
import com.wxz.entity.User;

import java.util.List;

public interface UserMapper {
    User login(User user);

    List<Goods> list();

    void insert(User user);
}
