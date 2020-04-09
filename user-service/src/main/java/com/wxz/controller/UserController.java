package com.wxz.controller;

import com.wxz.entity.Goods;
import com.wxz.entity.User;
import com.wxz.resp.Resp;
import com.wxz.service.UserService;
import com.wxz.service.impl.UserServiceImpl;
import com.wxz.util.EmptyUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("login")
    public User login(@RequestBody User user){
        User user1=userService.login(user);
        return user1;
    }
    @GetMapping("list")
    public List<Goods> list(){
        return userService.list();
    }
    @PostMapping("insert")
    public Resp<Object> insert(@RequestBody User user ){
//        System.out.println(StringUtils.isEmpty(null));
//        System.out.println(StringUtils.isEmpty(user));
//        System.out.println(StringUtils.isEmpty(user.getUsername()));
//        System.out.println(ObjectUtils.isEmpty(user));
//        System.out.println(StringUtils.isEmpty(user));
//        System.out.println(EmptyUtil.isEmpty(user));
//        System.out.println(user==null);
//        if (1==1){
//            System.out.println("666");
//            return Resp.fail();
//        }else{
//            userService.insert(user);
//            return Resp.ok(null);
//        }
        if (user==null){
            return Resp.fail();
        }
        userService.insert(user);
        return Resp.ok(null);
    }
    @GetMapping("findOne")
    public void findOne(@RequestParam(name = "qwe",defaultValue = "") String qwe){
        System.out.println(qwe);
        System.out.println(StringUtils.isEmpty(qwe));
        String ss="";
        System.out.println(ss);
        System.out.println(StringUtils.isEmpty(ss));
    }

}
