<%--
  Created by IntelliJ IDEA.
  User: wuhaizhu
  Date: 2021/8/31
  Time: 下午9:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%--@include会将两个页面合二为一--%>
<%@include file="/common/Header.jsp"%>
<h1>网页主体</h1>
<%@include file="/common/Footer.jsp"%>

<%--JSP标签
    jsp:include	拼接页面，本质还是三个--%>
<jsp:include page="/common/Header.jsp"/>
<h1>网页主体</h1>
<jsp:include page="/common/Footer.jsp"/>

</body>
</html>
