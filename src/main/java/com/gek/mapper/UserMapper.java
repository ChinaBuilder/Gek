package com.gek.mapper;

import com.gek.pojo.User;

/**
 * Created by KAY on 2016/11/5.
 */

public interface UserMapper {
	void deleteByPrimaryId(Long id);
	User selectByUsername(String username);
}
