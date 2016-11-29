package com.gek.jacksonUtil;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.gek.mapper.UserMapper;
import com.gek.mapper.UserMapperTestCase;
import com.gek.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by KAY on 2016/11/29.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:/spring/applicationContext*.xml")
public class jacksonFormat {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void ArrayListFormat() throws JsonProcessingException {
        UserMapperTestCase userMapperTestCase = new UserMapperTestCase();
        User user = userMapperTestCase.getUser();
        ArrayList<User> users = new ArrayList<>();
        users.add(0, user);
        users.add(1, user);
        users.add(2, user);
        users.add(3, user);
        ObjectMapper objectMapper = new ObjectMapper();
        /*JavaType javaType = objectMapper.getTypeFactory().constructParametricType(ArrayList.class, User.class);
        String s = objectMapper.writeValueAsString(javaType);*/
        String s = objectMapper.writeValueAsString(users);
        System.out.println("11111111111111111111111111111" + s);
    }

    @Test
    public void testList() {
        List<User> userList = userMapper.findAll();
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            String s = objectMapper.writeValueAsString(userList);
            System.out.println(s);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

    }
}
