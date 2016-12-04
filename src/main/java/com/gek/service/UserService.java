package com.gek.service;

import com.gek.dto.DatatablesResult;
import com.gek.mapper.UserMapper;
import com.gek.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

/**
 * Created by KAY on 2016/11/26.
 */
public interface UserService<T> {
    /**
     *
     * @param params
     * @return datatable封装的数据结构 具有Long draw/List<T> data/Long total/Long filteredtotal
     */
    DatatablesResult<T> findByParams(Map params);

    List<User> findAll();

    User selectByUsername(String username);
}
