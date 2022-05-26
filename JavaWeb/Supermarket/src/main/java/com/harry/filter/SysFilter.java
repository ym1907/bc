package com.harry.filter;

import com.harry.pojo.User;
import com.harry.util.Constants;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * @author Harry
 * @Date 2022/5/26 14:20
 */
public class SysFilter implements Filter{
    public void init(FilterConfig filterConfig) throws ServletException{
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
            throws IOException, ServletException {
        // TODO 自动生成的方法存根
        HttpServletRequest request =  (HttpServletRequest)req;
        HttpServletResponse response = (HttpServletResponse)resp;

        //过滤器，从session中获取用户
        User user = (User)request.getSession().getAttribute(Constants.USER_SESSION);
        if(user == null){//已经被移除或者注销了，或者未登录
            response.sendRedirect("/smbms/error.jsp");
        }else {
            chain.doFilter(req, resp);
        }
    }

    @Override
    public void destroy() {
        // TODO 自动生成的方法存根
    }
}