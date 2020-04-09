package com.wxz.service;

import com.wxz.entity.Goods;
import com.wxz.entity.User;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface UserService {
    User login(User user);

    List<Goods> list();

    void insert(User user);
}
