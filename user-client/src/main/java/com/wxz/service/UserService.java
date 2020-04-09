package com.wxz.service;

import com.wxz.entity.Goods;
import com.wxz.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient("user-server")
public interface UserService {
    @PostMapping("login")
    User login(@RequestBody User user);
    @GetMapping("list")
    List<Goods> list();
}
