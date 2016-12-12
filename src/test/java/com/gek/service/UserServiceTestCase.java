package com.gek.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.gek.dto.DatatablesResult;
import com.gek.mapper.UserMapper;
import com.gek.pojo.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by KAY on 2016/11/26.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:/spring/applicationContext*.xml")
public class UserServiceTestCase {
    @Autowired
    private UserService userService;
    @Autowired
    private UserMapper userMapper;

    @Test
    public void FindAllTest() {
        List<User> userList = userService.findAll();
        ObjectMapper mapper = new ObjectMapper();
        try {
            String s = mapper.writeValueAsString(userList);
            System.out.println(s);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void findByParamsTestCase() {
        HashMap<String, Object> params = new HashMap<>();
        params.put("start", 0L);
        params.put("length", 2L);
        params.put("keyword", "tom");
        DatatablesResult datatablesResult = userService.findByParams(params);
        Assert.assertNotNull(datatablesResult.getData().get(0));
    }

}
