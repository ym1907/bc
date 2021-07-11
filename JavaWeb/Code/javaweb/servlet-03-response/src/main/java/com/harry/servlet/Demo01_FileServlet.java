package com.harry.servlet;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.ArrayList;

public class Demo01_FileServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1. 要获取下载文件的路径
//        String realPath = "D:\\bc\\JavaWeb\\Code\\javaweb\\servlet-03-response\\src\\main\\resources\\图片2.jpg";
        String realPath = "/Users/wuhaizhu/Desktop/bc/JavaWeb/Code/javaweb/servlet-03-response/src/main/resources/图片2.jpg";
        System.out.println("下载文件的路径：" + realPath);
        //2. 下载的文件名是啥？
//        String fileName = realPath.substring(realPath.lastIndexOf("\\") + 1);
        String fileName = realPath.substring(realPath.lastIndexOf("/") + 1);
        //3. 设置让浏览器能支持(Content-Disposition)下载所需的东西，中文文件名使用 URLEncoder.encode 编码，否则可能乱码
        resp.setHeader("Content-Disposition","attachment;filename=" + URLEncoder.encode(fileName,"UTF-8"));
        //4. 获取下载文件的输入流
        FileInputStream in = new FileInputStream(realPath);
        //5. 创建缓冲区
        int len = 0;
        byte[] buffer = new byte[1024];
        //6. 获取OutputStream对象
        ServletOutputStream out = resp.getOutputStream();
        //7. 将FileOutputStream流写入到buffer缓冲区，使用OutputStream将缓冲区中的数据输出到客户端
        while((len = in.read(buffer)) > 0){
            out.write(buffer,0,len);
        }

        in.close();
        out.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }
}
