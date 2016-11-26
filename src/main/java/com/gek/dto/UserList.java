package com.gek.dto;

import com.gek.pojo.User;

import java.util.List;

/**
 * Created by KAY on 2016/11/26.
 */

public class UserList {

    private List<User> userList;

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }
}
