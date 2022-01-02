package com.harry.test;

import java.sql.*;

public class TestJdbc {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //配置信息
        //解决中文乱码 useUnicode=true&characterEncoding=utf-8
        String url = "jdbc:mysql://localhost:3306/jdbc?useUnicode=true&characterEncoding=utf-8";
        String userName = "root";
        String password = "123123";

        //1.加载驱动
        //mysql 8.0之前使用com.mysql.jdbc，之后使用com.mysql.cj.jdbc
        Class.forName("com.mysql.cj.jdbc.Driver");
        //2.连接数据库,代表数据库
        Connection connection = DriverManager.getConnection(url, userName, password);

        //3.向数据库发送SQL的对象Statement,PreparedStatement : CRUD
        Statement statement = connection.createStatement();
        //connection.prepareStatement("sql");安全的，需要预编译

        //4.编写SQL
        String sql = "select * from people";

        //5.执行查询SQL，返回一个 ResultSet  ： 结果集
        ResultSet rs = statement.executeQuery(sql);
        //增删改，返回值为受到影响的行数
        int i = statement.executeUpdate("delete from people where user = '123';");

        while (rs.next()){
            System.out.println("id="+rs.getObject("id"));
            System.out.println("name="+rs.getObject("name"));
            System.out.println("password="+rs.getObject("password"));
            System.out.println("email="+rs.getObject("email"));
            System.out.println("birthday="+rs.getObject("birthday"));
        }

        //6.关闭连接，释放资源（一定要做） 先开后关
        rs.close();
        statement.close();
        connection.close();
    }
}
