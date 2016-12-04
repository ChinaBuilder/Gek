package com.gek.mapper;

import com.gek.pojo.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashMap;
import java.util.List;

/**
 * spring
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:/spring/application*.xml")
public class UserMapperTestCase {

    @Autowired
    private UserMapper userMapper;

    public User getUser() {
        User user = new User();
        user.setId(1L);
        user.setRealname("吴云龙测试");
        user.setLevel(12);
        user.setEnabled(true);
        user.setGroupname("ROLE_ADMIN");
        user.setPassword("123");
        user.setUsername("wuyunlong");

        return user;
    }

    @Test
    public void addUserTestCase() {
        User user = getUser();
        userMapper.addUser(user);
    }

    @Test
    public void updateUser() {

        User user = getUser();
        user.setUsername("test");
        userMapper.updateUser(user);
    }

    @Test
    public void selectByPrimaryKey() {
        User user = userMapper.findByUsername("test");
        User user1 = userMapper.findByPrimaryKey(1L);
        Assert.assertNotNull(user);
        Assert.assertNotNull(user1);
    }

    @Test
    public void deleteUser() {
        userMapper.deleteByPrimaryId(1L);
    }

    @Test
    public void findByParamsTestCase() {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("keyword", "tom");
        hashMap.put("start", 0L);
        hashMap.put("length", 1L);
        List<User> users = userMapper.findByParams(hashMap);
        for (User u :
                users) {
            System.out.println(u.toString()+".。。。。。。。。。。。。。。。。。。。。。。。");
        }
        System.out.println(users.size());

    }
}
