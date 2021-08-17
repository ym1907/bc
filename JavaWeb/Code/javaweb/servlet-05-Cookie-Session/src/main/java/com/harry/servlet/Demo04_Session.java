package com.harry.servlet;

import com.harry.pojo.Person;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class Demo04_Session extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //解决中文乱码问题
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");

        //得到Session
        HttpSession session = req.getSession();

        //给Session存储东西
        session.setAttribute("name","小朱");
        session.setAttribute("person",new Person("叽叽叽叽",18));

        //获取Session的ID
        String id = session.getId();

        //判断Session是否是新创建的
        if(session.isNew() == true){
            resp.getWriter().println("session创建成功，ID："+id);
        }else {
            resp.getWriter().println("Session已存在，ID："+id);
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
