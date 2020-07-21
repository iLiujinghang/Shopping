<%--
  Created by IntelliJ IDEA.
  User: liujinghang
  Date: 2018/12/22
  Time: 7:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
    <link rel="stylesheet" type="text/css" href="./css/registered.css">
    <link rel="icon" type="image/x-icon" href="./img/favicon.ico">
</head>
<body>
<!DOCTYPE html>
<body>
<div class="main-page">
    <img class="bg" src="./img/Login-bg.jpg" width="1920" height="720">
    <div class="header">
        <div class="logo">
            <img id="milogo" src="./img/milogo.png">
        </div>
        <span>
				<a style="color: red" href="">严打违规文件和盗版侵权传播</a>
				<a href="./index.html">小米商城</a>
				<a href="./html/MIUI.html">MIUI</a>
				<a href="./html/aboutcompany.html">关于小米</a>
				<a href="./html/team.html">团队介绍</a>
				<a href="">官方微博</a>
				<a class="user-center" href="./html/registered.html">会员中心</a>
			</span>
    </div>
    <div class="main">
        <div class="text">
            <p>"安全购物，就选小米"</p>
        </div>
        <form class="Login" action="${pageContext.request.contextPath}/registeredServlet" method="get">
            <p class="title-name">购物账号注册</p>
            <div class="input">
                <div class="onevalue">
                    <p>编号</p>
                    <input type="text" name="id">
                </div>
                <div class="onevalue">
                    <p>昵称</p>
                    <input type="text" name="name">
                </div>
                <div class="onevalue">
                    <p>密码</p>
                    <input type="text" name="pwd">
                </div>
                <div class="onevalue">
                    <p>电话</p>
                    <input type="text" name="phone">
                </div>
                <div class="onevalue">
                    <p>地址</p>
                    <input type="text" name="add">
                </div>
                <div class="onevalue">
                    <button>立即注册</button>
                </div>
            </div>
        </form>
    </div>
</div>
<div class="footer">
    <div class="download">
			<span>
				<a href="">Windows</a>
				<a href="">Android</a>
				<a href="">iPhone</a>
				<a href="">iPad</a>
				<a href="">Mac</a>
			</span>
    </div>
    <div class="links">
			<span>
				<a href="">@2018小米移动开放平台</a><span>|</span>
				<a href="">服务协议</a><span>|</span>
				<a href="">权力声明</a><span>|</span>
				<a href="">版本更新</a><span>|</span>
				<a href="">帮助中心</a><span>|</span>
				<a href="">版权投诉</a>
			</span>
    </div>
</div>
</body>
</html>
</body>
</html>
