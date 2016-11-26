package com.gek.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by KAY on 2016/11/19.
 */
@Controller
public class HomeController {
    @RequestMapping(value = "/welcome")
    public String loginSuccess() {
        return "redirect:/home";
    }

    @RequestMapping(value = "/home")
    public String showHome() {
        return "/home/home";
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String showTestHome() {
        return "/home/test";
    }


}
