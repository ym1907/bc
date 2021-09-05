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

<%--内置对象--%>

<%  pageContext.setAttribute("name1","H1号"); //保存的数据只在一个页面中有效
    request.setAttribute("name2","H2号"); //保存的数据只在一次请求中有效，请求转发会携带这个数据
    session.setAttribute("name3","H3号"); //保存的数据只在一次会话中有效，从打开浏览器到关闭浏览器
    application.setAttribute("name4","H4号");  //保存的数据只在服务器中有效，从打开服务器到关闭服务器
%>
<%--脚本片段中的代码，会被原封不动的生成到。JSP.java--%>

<%
    //从pageContext取出，通过寻求的方式来
    //从底层到高层（作用域）：page -> request -> session -> application
    String name1 = (String)pageContext.findAttribute("name1");
    String name2 = (String)pageContext.findAttribute("name2");
    String name3 = (String)pageContext.findAttribute("name3");
    String name4 = (String)pageContext.findAttribute("name4");
%>

<%--使用EL表达式输出  ${} --%>

<h1>取出的值为：</h1>
<h1>${name1}</h1>
<h1>${name2}</h1>
<h1>${name3}</h1>
<h1>${name4}</h1>
<h1>${name5}</h1><%-- <%=name5%> 没有的会报错或输出Null --%>


</body>
</html>
