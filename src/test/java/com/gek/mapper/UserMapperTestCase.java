package com.gek.mapper;

import com.gek.pojo.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *spring 测试
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:/spring/application*.xml")
public class UserMapperTestCase {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testselectByUsername() {
        User tom = userMapper.selectByUsername("tom");
        Assert.assertNotNull(tom);
    }
}
