<%--
  Created by IntelliJ IDEA.
  User: wuhaizhu
  Date: 2021/8/31
  Time: 下午9:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%@include file="common/Header.jsp"%>
<h2>网页主体</h2>
<%@include file="common/Footer.jsp"%>

<hr>

<%--jSP标签
    jsp:include：拼接页面，本质还是三个
    --%>
<jsp:include page="common/Header.jsp"/>
<h1>网页主体</h1>
<jsp:include page="common/Footer.jsp"/>
</body>
</html>
