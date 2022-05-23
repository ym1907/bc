package com.harry.service.user;

import com.harry.dao.BaseDao;
import com.harry.dao.user.UserDao;
import com.harry.dao.user.UserDaoImpl;
import com.harry.pojo.User;

import java.sql.Connection;

public class UserServiceImpl implements UserService {
    //业务层都会调用dao层.所以我们要引入Dao层（重点）
    //只处理对应业务

    private UserDao userDao;
    public UserServiceImpl(){
        userDao = new UserDaoImpl();
    }

    public User login(String userCode,String userPassword) {
        // TODO Auto-generated method stub
        Connection connection = null;
        //通过业务层调用对应的具体数据库操作
        User user = null;
        try {
            connection = BaseDao.getConnection();
            user = userDao.getLoginUser(connection, userCode);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally{
            BaseDao.closeResource(connection, null, null);
        }
        return user;
    }

	/*@Test
	public void test() {
		UserServiceImpl userService = new UserServiceImpl();
		String userCode = "admin";
		String userPassword = "12345678";
		User admin = userService.login(userCode, userPassword);
		System.out.println(admin.getUserPassword());

	}
	*/
}
