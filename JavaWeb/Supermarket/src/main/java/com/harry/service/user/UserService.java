package com.harry.service.user;

import com.harry.pojo.User;

import java.sql.SQLException;

public interface UserService {
    //用户登录
    public User login(String userCode, String userPassword);

    public boolean updatePwd(int id,int password)throws SQLException, Exception;
}
