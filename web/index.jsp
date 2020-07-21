<%--
  Created by IntelliJ IDEA.
  User: liujinghang
  Date: 2018/12/22
  Time: 8:57 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
    <link rel="stylesheet" type="text/css" href="./css/index.css">
    <link rel="icon" type="image/x-icon" href="./img/favicon.ico">
    <script src="./js/jquery-3.3.1.js">
        $(document).ready(function(){
            $("button").click(function(){
                $("#div1").load("/try/ajax/demo_test.txt",function(responseTxt,statusTxt,xhr){
                    if(statusTxt=="success")
                        alert("外部内容加载成功!");
                    if(statusTxt=="error")
                        alert("Error: "+xhr.status+": "+xhr.statusText);
                });
            });
        });
    </script>
</head>
<body>
<div class="main-page">
    <div class="layout">
        <div class="logo">
            <a href="./index.html"><img src="./img/milogo.png"></a>
        </div>
        <p class="title">登录账号</p>
        <form class="form" name="form" action="${pageContext.request.contextPath}/indexServlet" method="GET">
            <p class="field">输入编号</p>
            <input class="field-text" type="text" name="ID"><!-- <input class="field-icon" type="submit" value="确定"> -->
            <p class="phone">输入密码</p>
            <input class="phone-number" type="text" name="pwd">
            <button type="submit" onclick="loginDeal()">登录</button>
        </form>
    </div>
</div>
</body>
</html>
