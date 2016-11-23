package com.it.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by KAY on 2016/11/19.
 */
@RequestMapping(value = "/login")
@Controller
public class LoginController {
    //此处制定get方法会让 登录失败重定向出错 出现post method not support
    @RequestMapping()
    public String ShowLoginPage() {
        return "/home/index";
    }

    @RequestMapping(value = "/check", method = RequestMethod.POST)
    public String checkAuth() {
        return "/check";
    }
}
