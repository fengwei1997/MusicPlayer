package com.controller;

import com.model.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/doLogin",method = RequestMethod.POST)
    public String login(User user, ModelMap modelMap, HttpServletRequest request){
        User user1=userService.login(user);
        System.out.println(user1);
        if(user1!=null){
            HttpSession session=request.getSession();
            session.setAttribute("loginUser",user1);
            return "index";
        }
        modelMap.addAttribute("msg","用户名或密码错误，请重新登录！");
        return "login";
//        return user1!=null?"index":"login";
    }
}
