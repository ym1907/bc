package com.harry.servlet;


import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

//保存用户上一次访问的时间
public class Demo01_Cookie extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //服务器告诉你来的时间，把该时间封装成一个对象，下次访问带来就知道了

        //解决中文乱码问题
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");

        PrintWriter out = resp.getWriter();

        //Cookie，服务器从客户端获取的
        Cookie[] cookies = req.getCookies();//说明数组会存在多个

        //判断Cookie是否存在
        if(cookies != null){
            //如果存在
            out.write("上次访问的时间：");

            for (int i = 0; i < cookies.length; i++) {
                Cookie cookie = cookies[i];
                if(cookie.getName().equals("lastLoginTime")){
                    long lastLoginTime = Long.parseLong(cookie.getValue());
                    Date date = new Date(lastLoginTime);
                    out.write(date.toLocaleString());
                }
            }

        }else{
            out.write("第一次访问");
        }

        Cookie cookie = new Cookie("lastLoginTime",System.currentTimeMillis()+"");
        cookie.setMaxAge(24*60*60);//设置cookie的有效期

        resp.addCookie(cookie);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }
}