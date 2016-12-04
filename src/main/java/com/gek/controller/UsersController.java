package com.gek.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.gek.dto.DatatablesResult;
import com.gek.pojo.User;
import com.gek.service.UserService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;


/**
 * Created by KAY on 2016/11/5.
 */
@Controller
@RequestMapping(value = "/users")
public class UsersController {
    Logger logger = LoggerFactory.getLogger(UsersController.class);
    @Autowired
    private UserService userService;


    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String ShowUserList() {
        return "/users/list";
    }

    /**
     *
     * @param request
     * draw   是否允许datatables重新绘制前端table
     * @return
     */

    @RequestMapping(value = "/userlist_data", method = RequestMethod.GET)
    @ResponseBody
    public DatatablesResult<User> userList(HttpServletRequest request) {
        List<User> userList = userService.findAll();
        //获取参数数值
        String draw = request.getParameter("draw");
        String start = request.getParameter("start");
        String length = request.getParameter("length");
        String keyword = request.getParameter("search[value]");     //注意 request的参数由windows系统输入 默认为iso8859-1如果没有编码过滤器，请手动转码。
        //打印信息测试
        logger.debug("start",start);
        logger.debug("length",length);
        logger.debug("keyword",keyword);
        //给参数赋值
        HashMap<String, Object> params = new HashMap<>();
        params.put("keyword", keyword);
        params.put("start", start);
        params.put("length", length);
        //
        DatatablesResult<User> result = userService.findByParams(params);
        return result;
    }

    @RequestMapping(value = "/{username}")
    @ResponseBody
    public User showUserByName(@PathVariable String username) {
        User user = userService.selectByUsername(username);
        return user;
    }
}
