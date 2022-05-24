package com.harry.dao.user;

import com.harry.pojo.User;

import java.sql.Connection;

public interface UserDao {
    public User getLoginUser(Connection connection, String userCode) throws Exception;
}
