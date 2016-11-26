package com.gek.controller;

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

    /**
     * /login登录页面
     *
     * @return
     */
    @RequestMapping()
    public String ShowLoginPage() {
        return "/home/login";
    }

    /**
     * 检查页面
     *
     * @return
     */
    @RequestMapping(value = "/check", method = RequestMethod.POST)
    public String checkAuthor() {
        return "/check";
    }

    /**
     * 登陆成功默认跳转页面
     *
     * @return
     */
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String defaultPage() {
        return "/home/home";
    }
}
