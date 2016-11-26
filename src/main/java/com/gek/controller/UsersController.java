package com.gek.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.gek.pojo.User;
import com.gek.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by KAY on 2016/11/5.
 */
@Controller
@RequestMapping(value = "/users")
public class UsersController {
    @Autowired
    private UserService userService;
    private ObjectMapper objectMapper = new ObjectMapper();

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String ShowUserList() {
        return "/users/list";
    }

    @RequestMapping(value = "/userlist_data", method = RequestMethod.GET)
    @ResponseBody
    public String userList() {
        List<User> userList = userService.findAll();
        try {
            String s = objectMapper.writeValueAsString(userList);
            return s;
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }

    @RequestMapping(value = "/{username}")
    @ResponseBody
    public User showUserByName(@PathVariable String username) {
        User user = userService.selectByUsername(username);
        return user;
    }
}
