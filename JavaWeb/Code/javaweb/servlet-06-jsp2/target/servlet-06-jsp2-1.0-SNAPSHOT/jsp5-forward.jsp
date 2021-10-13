<%--
  Created by IntelliJ IDEA.
  User: wuhaizhu
  Date: 2021/9/5
  Time: 下午6:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
//  重定向的两种写法
    pageContext.forward("/index.jsp");
    //request.getRequestDispatcher("/index.jsp").forward(request,response);
%>
</body>
</html>
