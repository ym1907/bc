<%@ page import="com.harry.pojo.people" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%
//    people p = new people();
//    p.setAddress("");
%>

<jsp:useBean id="people" class="com.harry.pojo.people" scope="page"/>

<jsp:setProperty name="people" property="id" value="008"/>
<jsp:setProperty name="people" property="name" value="Harry"/>
<jsp:setProperty name="people" property="age" value="23"/>
<jsp:setProperty name="people" property="address" value="China"/>


<%--<%p.getAddress();%>--%>
ID：<jsp:getProperty name="people" property="id"/>
姓名：<jsp:getProperty name="people" property="name"/>
年龄：<jsp:getProperty name="people" property="age"/>
地址：<jsp:getProperty name="people" property="address"/>

</body>
</html>
