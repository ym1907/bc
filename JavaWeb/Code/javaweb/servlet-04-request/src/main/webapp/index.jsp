<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>

<h1>登录</h1>

<div style="text-align: center">
    <%--以post的方式提交表单，提交到login请求--%>
    <%--${pageContext.request.contextPath} 代表当前的项目，需要导入JSP包--%>
    <form action="${pageContext.request.contextPath}/login" method="post">
        用户名：<input type="text" name="name"><br>
        密码：<input type="password" name="password"><br>
        爱好：
        <input type="checkbox" name="hobbies" value="女孩">女孩
        <input type="checkbox" name="hobbies" value="代码">代码
        <input type="checkbox" name="hobbies" value="吃">吃
        <input type="checkbox" name="hobbies" value="喝">喝
        <br>
        <input type="submit">
    </form>
</div>

</body>
</html>
