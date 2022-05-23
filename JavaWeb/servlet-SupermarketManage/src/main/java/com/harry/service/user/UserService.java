package com.harry.service.user;

import com.harry.pojo.User;

public interface UserService {
    //用户登录
    public User login(String userCode, String userPassword);
}
