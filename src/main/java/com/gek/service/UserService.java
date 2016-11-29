package com.gek.service;

import com.gek.mapper.UserMapper;
import com.gek.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by KAY on 2016/11/26.
 */
public interface UserService {

    List<User> findAll();
    User selectByUsername(String username);
}
