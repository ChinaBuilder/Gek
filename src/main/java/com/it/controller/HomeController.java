package com.it.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by KAY on 2016/11/19.
 */
@Controller
public class HomeController {
    @RequestMapping(value = "/welcome", method = RequestMethod.GET)
    public String showWelcomeHome() {
        return "/home/welcome";
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String showTestHome() {
        return "/home/test";
    }

}