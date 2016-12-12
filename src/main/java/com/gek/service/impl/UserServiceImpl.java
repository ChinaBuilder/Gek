package com.gek.service.impl;

import com.gek.dto.DatatablesResult;
import com.gek.mapper.UserMapper;
import com.gek.pojo.User;
import com.gek.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by KAY on 2016/11/26.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private  UserMapper userMapper;

    /**
     *
     * @param params
     * String keyword
     * Long   start
     * Long   length
     * @return DatatablesResult
     * List<T>  data
     * Long     recordTotals
     * Long     recordFiltered
     * 通过传递过来的map类型参数 封装resulttable返回
     */
    @Override
    public DatatablesResult findByParams(Map params) {
        List<User> users = userMapper.findAll();
        List<User> userList = userMapper.findByParams(params);
        //获取查询出来的结果值 待验证
        Long total = Long.valueOf(users.size());
        Long filteredTotal = Long.valueOf(userList.size());

        DatatablesResult<User> userDatatablesResult = new DatatablesResult<>();
        userDatatablesResult.setData(userList);
        userDatatablesResult.setRecordsTotal(total);
        userDatatablesResult.setRecordsFiltered(filteredTotal);

        HashMap<String, Boolean> hashMap = new HashMap<>();
        //设置数据库状态
        if(total != 0L){
            hashMap.put("数据查询结果正常！",true);

        }if(total == 0L){
            hashMap.put("当前数据库没有数据！",true);
            userDatatablesResult.setStatus(hashMap);
        }
        else{
            hashMap.put("数据库查询异常！",false);
        }

        return userDatatablesResult;
    }

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }

    @Override
    public User selectByUsername(String username) {
        return userMapper.findByUsername(username);
    }
}
