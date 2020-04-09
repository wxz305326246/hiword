package com.wxz.controller;

import com.wxz.entity.Goods;
import com.wxz.entity.User;
import com.wxz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("index")
    public String index(){
        return "login";
    }
    @PostMapping("login")
    public String login(User user){
        System.out.println();
        System.out.println(user==null);
        User user1=userService.login(user);
        if (user1==null){
            System.out.println(StringUtils.isEmpty(user1));
            return "error";
        }else{
            return "redirect:list";
        }
    }
    @GetMapping("list")
    public String list(HttpServletRequest request){
        List<Goods> goodsList= userService.list();
        request.setAttribute("glist",goodsList);
        return "list";
    }
}
