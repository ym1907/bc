<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%--@include会将两个页面合二为一--%>
<%--<%@include file="common/Header.jsp"%>--%>
<h2>网页主体</h2>
<%
    //int A = 10; //合二为一会导致重名变量报错
%>
<%@include file="common/Footer.jsp"%>

<hr>

<%--jsp:include：拼接页面，本质还是三个--%>
<jsp:include page="common/Header.jsp"/>
<h1>网页主体</h1>
<%
    int A = 10;
%>
<jsp:include page="/common/Footer.jsp"/>
</body>
</html>
