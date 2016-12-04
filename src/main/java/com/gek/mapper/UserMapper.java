package com.gek.mapper;

import com.gek.pojo.User;

import java.util.List;
import java.util.Map;

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

	/**
	 * 通过参数来查询user集合
	 * @param params
     * params 应该含有
     * "keyword"
     * "start"
     * "length"
	 * @return
	 */
    List<User> findByParams(Map params);
}
