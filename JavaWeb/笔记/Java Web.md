### Java Web

#### 创建部署

课件笔记地址：https://blog.csdn.net/qq_32145097/article/details/108449583

- 一个web应用由多部分组成 （静态web，动态web）

B/S：浏览和服务器

C/S: 客户端和服务器

可以配置启动的端口号

1. tomcat的默认端口号为：8080
2. mysql：3306
3. http：80
4. https：443

 DNS服务器：存放全世界域名的地方

 HTTP（超文本传输协议）是一个简单的请求-响应协议，它通常运行在TCP之上。 

-  HTTP/1.0：客户端可以与web服务器连接后，只能获得一个web资源，断开连接
-  HTTP/1.1：客户端可以与web服务器连接后，可以获得多个web资源。

IDEA中的Artifact，属于一种工具包

Java默认编码：ISO-8859-1

GBK		UTF-8		GB2312



Maven：项目架构管理工具

核心思想：约定大于配置

web.xml中配置URL地址时，首位“/”必须加，否则会启动组件失败

IEDA项目 Project Structre 配置：https://www.cnblogs.com/deng-cc/p/6416332.html

servlet：请求+响应，是一个服务

Session、Cookie：会话和缓存机制

JSP：html+java



#### Servlet

开发两步骤： 编写一个类，实现Servlet接口，把开发好的Java类部署到web服务器中。 

把实现了Servlet接口的Java程序叫做，Servlet 

Maven环境优化：① 修改web.xml为最新的；② 将maven的结构搭建完整

Servlet 类 -->  GenericServlet 类 -->  HttpServlet 类 --> 自己实现的类



#### Mapping

```xml
<!--一个映射路径-->
<servlet>
    <servlet-name>error</servlet-name>
    <servlet-class>com.harry.servlet.ErrorServlet</servlet-class>
</servlet>
<servlet-mapping>
    <servlet-name>error</servlet-name>
    <url-pattern>/error</url-pattern>
</servlet-mapping>

<!--指定多个映射路径-->
	<url-pattern>/hello1</url-pattern>
	<url-pattern>/hello2</url-pattern>
	<url-pattern>/hello3</url-pattern>
<!--指定通用映射路径-->
	<url-pattern>/hello/*</url-pattern>
<!--默认请求路径-->
<!--优先级问题 指定了固有的映射路径优先级最高，如果找不到就会走默认的处理请求-->
	<url-pattern>/*</url-pattern>
<!--可以自定义映射后缀实现请求映射，但 * 前面不能加项目映射的路径(/hello/*.harry)-->
	<url-pattern>*.harry</url-pattern>
```





#### ServletContext

web容器启动的时候，它会为每个web程序都创建一个对应的ServletContext对象，它代表了 当前的web应用，整个服务中，ServletContext有且仅有一个，相当于单例模式

```java
//	      this.getInitParameter(0)      初始化参数
//        this.getServletConfig()       Servlet配置
//        this.getServletContext()      Servlet上下文
```

在servlet 1中保存的数据，可以在servlet 2中取到。（先运行servlet 2 取到的值为null）

```java
//Servlet 1
ServletContext context = this.getServletContext();
String userName = "Harry";
context.setAttribute("userName",userName);//将一个数据保存在ServletContext中

//Servlet 2 
ServletContext context = this.getServletContext();
String name = (String)context.getAttribute("userName");
```

