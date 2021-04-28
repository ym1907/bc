package com.harry.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");//处理接收到内容的编码格式
        resp.setCharacterEncoding("utf-8");

        String name = req.getParameter("name");
        String password = req.getParameter("password");
        String[] hobbies = req.getParameterValues("hobbies");

        System.out.println("=============================");
        System.out.println(name+" : "+password);
        System.out.println(Arrays.toString(hobbies));
        System.out.println("=============================");

        System.out.println(req.getContextPath());
        //通过请求转发
        //这里的'/'代表的是当前的Web应用
        req.getRequestDispatcher("/success.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
