package com.gek.mapper;

import com.gek.pojo.User;

import java.util.List;

/**
 * Created by KAY on 2016/11/5.
 */

public interface UserMapper {
	void addUser(User user);

	void deleteByPrimaryId(Long id);

	void updateUser(User user);

	User findByUsername(String username);

	User findByPrimaryKey(Long id);

    List<User> findAll();
}
