# HTML

HTML：Hyper Text Markup Language（超文本标记语言）

HTML 5 + CSS 3

W3C：World Wide Web Consortium（万维网联盟）

W3C标准包括：结构化标准语言（HTML、XML配置文件）、表现语言标准（CSS）、行为标准（DOM文档对象模型、ECMAScript）

### 标签

##### 基础标签

```html
<!--告诉浏览器，要使用什么规范-->
<!DOCTYPE html>
<html lang="en">

<!--网页头部-->
<head>
    <!--描述标签，用来描述网站的一些信息。一般用来做SEO-->
    <meta charset="UTF-8">
    <meta name="keywords" content="关键词">
    <meta name="description" content="内容描述">
    <!--网页标签-->
    <title>Title</title>
</head>

<!--网页主体-->
<body>

    <!--标题标签-->
    <h1>一级标签</h1>
    <h2>二级标签</h2>
    <h3>三级标签</h3>
    <h4>四级标签</h4>
    <h5>五级标签</h5>
    <h6>六级标签</h6>

    <!--段落标签-->
    <p>1. 负责公司MES系统开发，系统维护等工作；</p>
    <p>2. 负责与业务部门沟通，讨论业务需求，编写设计文档；</p>

    <!--水平线标签-->
    <hr/>

    <!--换行标签-->
    1. 负责公司MES系统开发，系统维护等工作；<br/>
    2. 负责与业务部门沟通，讨论业务需求，编写设计文档；<br/>

    <!--粗体、斜体-->
    粗体：<strong>i love *</strong><br/>
    斜体：<em>i love *</em>

    <!--特殊符号（&+首字母 / 百度转义字符）-->
    空        格
    空&nbsp;&nbsp;&nbsp;格<br/>
    大于号&gt;<br/>
    小于号&lt;<br/>
    版权符号&copy;<br/>

</body>
</html>
```



##### 图片标签

常见图片格式：JPG、GIF、PNG、BMP...

```html
<body>
    <!--
    src：图片地址（相对路径、绝对路径）（../  --上一级目录）
    alt:图片未加载出显示的文字（必填）
    width 和 height 会等比缩放
    -->
    <img src="../resource/image/1.jpg" alt="图片" title="鼠标悬停显示文字" width="300" height="200">
</body>
```



##### 链接标签

页面间链接

```html
<body>
    <!--a标签
    herf：跳转到的页面（必填）
    target：表示窗口在哪里打开
        _blank：在新页面打开
        _self：在自己页面打开
    -->
    <a href="1.第一个html.html" target="_blank">第一个页面</a>
    <a href="https://baidu.com" target="_self">百度</a>
    <br/>

    <a href="https://baidu.com" title="图像超链接">
        <img src="../resource/image/1.jpg" alt="图片" width="200" height="200">
    </a>
</body>
```

锚链接

```html
<!--2.图像链接.html-->
<body>
    <a href="3.链接标签.html#down">跳转到3.链接标签.html页面底部</a>
</body>

<!--3.链接标签.html-->
<body>
    <!--使用name作为标记，实现锚链接（name：弃用的HTML属性）-->
    <a name="top">顶部</a>

    <p><a href="https://baidu.com" title="图像超链接">
        <img src="../resource/image/1.jpg" alt="图片">
    </a></p>
    <p><a href="https://baidu.com" title="图像超链接">
        <img src="../resource/image/1.jpg" alt="图片">
    </a></p>

    <!--锚链接
    1、需要一个锚标记
    2、跳转到标记
    -->
    <a href="#top">回到顶部</a>
    <a name="down">底部</a>
</body>
```

功能性链接

```html
<a href="mailto:1093876434@qq.com">邮箱链接：malito</a>
```



##### 块元素和行内元素

块元素：无论内容多少，独占一行（p、h1-h6 ...）

行内元素：内容撑开宽度，左右都是行内元素可以排在一行（a、strong、em ...）



##### 列表标签

```html
<!--有序列表-->
<ol>
    <li>java</li>
    <li>qw</li>
    <li>qwea</li>
</ol><hr>
<!--无序列表，用于导航、侧边栏等-->
<ul>
    <li>xzc</li>
    <li>dasd</li>
    <li>asd</li>
</ul>
<!--自定义列表，用于网页底部等-->
<dl><!--标签-->
    <dt>数字</dt><!--列表名称-->
        <dd>1</dd><!--列表内容-->
        <dd>2</dd>
    <dt>字母</dt>
        <dd>a</dd>
        <dd>b</dd>
</dl>
```



##### 表格标签

```html
<table border="20px"><!--表格标签-->
    <tr><!--行-->
        <!--colspan 跨列-->
        <td colspan="2">1-1</td><!--列-->
        <td rowspan="2">1-2</td>
    </tr>
    <tr>
        <td rowspan="2">2-1</td>
        <td>2-2</td>
    </tr>
    <tr>
        <td colspan="2">3-1</td>
    </tr>
</table>
```

![1618977009943](D:\bc\JavaWeb\笔记\HTML.assets\1618977009943.png)

##### 媒体元素

```html
<!--视频
src：资源路径
controls：控制条
autoplay：自动播放（Chrome浏览器取消了自动播放）
-->
<video src="../resource/video/视频1.mp4" controls autoplay></video>

<!--音频-->
<audio src="../resource/audio/猴叫.mp3" controls></audio>
```

### 其他内容

##### 页面结构

header：标题头部区域的内容(用于页面或页面中的一块区域)

footer：标记脚部区域的内容(用于整个页面或页面的一块区域)

section：Web页面中的一块独立区域

article：独立的文章内容

aside：相关内容或应用（常用于侧边栏)

nav：导航类辅助内容

##### 内联框架

```html
<!--iframe 内联框架
src：地址
frameborder：帧边缘
w-h：宽度高度
-->
<iframe src="https://baidu.com" frameborder="0" height="500" width="700"></iframe>

<iframe src="" name="hello" height="500" width="700"></iframe>
<a href="4.列表.html" target="hello">内联框架</a>
```

##### 表单post、get提交

```html
<h1>注册</h1>
<!--form标签
action：表单提交位置，可以是网站，也可以是一个请求处理地址
method：提交方式（get/post）
    get中可在url地址中看到提交的信息，不安全，但高效
    post比较安全，可传输大文件
-->
<form action="1.第一个html.html" method="post">
    <!--文本输入框：input type="text"-->
    <p>名字：<input type="text" name="username"></p>
    <!--密码框：input type="password"-->
    <p>密码：<input type="password" name="password"></p>

    <input type="submit">
    <input type="reset">
</form>
```

##### 表单

```html
<h1>注册</h1>
<!--form标签
action：表单提交位置，可以是网站，也可以是一个请求处理地址
method：提交方式（get/post）
    get中可在url地址中看到提交的信息，不安全，但高效
    post比较安全，可传输大文件get
-->
<form action="1.第一个html.html" method="get">
    <!--文本输入框（input中的name属性必须要加，提交起到键值对的键的作用）
    value="默认值"       默认值
    maxlength="8"       做多输入的字符
    size="30"           文本框长度
    -->
    <p>名字：<input type="text" name="username" value="admin" maxlength="8" size="30" readonly disable></p>
    <!--密码框：input type="password"-->
    <p>密码：<input type="password" name="password"/></p>

    <!--单选框标签
    value：单选框的值
    name：表示组-->
    <p>性别：
        <input type="radio" value="boy" name="sex"/>男
        <input type="radio" value="girl" name="sex"/>女
    </p>

    <!--多选框
    checked：默认勾选内容-->
    <p>爱好：
        <input type="checkbox" value="sleep" name="hobby">睡觉
        <input type="checkbox" value="code" name="hobby">代码
        <input type="checkbox" value="chat" name="hobby" checked>聊天
        <input type="checkbox" value="game" name="hobby">游戏
    </p>

    <!--按钮
    input type="button"     普通按钮
    input type="image"      图像按钮
    input type="submit"     提交按钮
    input type="reset"      重置-->
    <p>按钮：
        <input type="button" name="btn1" value="普通按钮">
        <input type="image" src="../resource/image/2.jpg">
    </p>
    <input type="submit">
    <input type="reset">

    <!--下拉框、列表框-->
    <p>下拉框：
        <select name="列表名称" id="city">
            <option value="sh">上海</option>
            <option value="sz">苏州</option>
            <option value="tj">天津</option>
            <option value="gz" selected>广州</option>
            <option value="zh">珠海</option>
            <option value="bj">北京</option>
        </select>
    </p>
    
    <!--文本框
    cols：初始列
    rows：初始行-->
    <p>文本框：
        <textarea name="textarea" cols="30" rows="10">默认文本内容</textarea><!--文本框的大小可通过右下角的标记拖拽-->
    </p>

    <!--文件域-->
    <p>文件提交：
        <input type="file" name="files">
    </p>

    <!--邮箱验证-->
    <p>邮箱：
        <input type="email" name="email"><!--有简单的验证，xxx@xx格式即可提交-->
    </p>

    <!--URL-->
    <p>URL：
        <input type="url" name="url">
    </p>

    <!--数字
    step：加减步长-->
    <p>商品数量：
        <input type="number" name="num" max="100" min="0" step="1">
    </p>

    <!--滑块-->
    <p>滑块：
        <input type="range" name="range" max="100" min="0" step="10">
    </p>

    <!--搜索-->
    <p>搜索：
        <input type="search" name="search">
    </p>

    <!--增强鼠标可用性-->
    <p>
        <label for="mark">点击文字选中搜索框</label>
        <input type="text" id="mark">
    </p>

</form>
```

##### 表单应用

```html
<!--hidden：隐藏-->
<p>密码：<input type="password" name="password" value="123456" hidden/></p>

<!--readonly：只读-->
    <p>名字：<input type="text" name="username" value="admin" readonly></p>

<!--disabled：不可用-->
    <p>名字：<input type="text" name="username" disable></p>
```

##### 表单初级验证

```html
<!--placeholder：用户提示
	required：非空判断-->
    <p>提示消息：<input type="text" name="reminder" placeholder="请输入姓名" required></p>

<!--pattern：正则验证-->
<p>邮箱2：
    <input type="email" name="email" pattern="^\w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*$">
</p>
```













