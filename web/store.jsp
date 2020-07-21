<%@ page import="domain.user" %><%--
  Created by IntelliJ IDEA.
  User: liujinghang
  Date: 2018/12/22
  Time: 2:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    user user = (user) request.getSession().getAttribute("user");
    String id = user.getUser_id();
    String name = user.getUser_name();
%>
<html>
<head>
    <meta name="viewport" content="width=1226"/>
    <title>商城</title>
    <link rel="icon" type="image/x-icon" href="./img/favicon.ico">
    <link rel="stylesheet" type="text/css" href="./css/store.css">
</head>
<body>
<div class="gui-one">
    <div class="gui-div">
        <div class="nav">
            <a class="store" href="./index.html">小米商城</a>
            <span class="sp">|</span>
            <a class="miui" href="./html/miui.html">MIUI</a>
            <span class="sp">|</span>
            <a class="yunServie" href="./yunServie.html">云服务</a>
            <span class="sp">|</span>
            <a class="miBank" href="./html/miBank.html">小米金融</a>
            <span class="sp">|</span>
            <a class="youPin" href="./html/aboutcompany.html">关于小米</a>
        </div>
        <div class="topcar">
            <a href="www.baidu.com">
                <i class="iconfont"></i>购物车<span>(0)</span></a>
        </div>
        <div class="topLogin">
            <p hidden><%=id%></p>
            <a class="link" href="./index.jsp"><%=name%></a>
            <span class="sp">|</span>
            <a class="link" href="./registered.jsp">注册</a>
            <span class="sp">|</span>
            <a class="link" href="Caffeine">消息通知</a>
        </div>
    </div>
</div>
<div class="gui-two">
    <div class="gui-two-div">
        <div class="logo">
            <img id="milogo" src="./img/milogo.png">
        </div>
        <div class="nav2">
            <a href="">小米手机</a>
            <a href="">红米</a>
            <a href="">笔记本</a>
            <a href="">电视</a>
            <a href="">盒子</a>
            <a href="">新品</a>
            <a href="">路由器</a>
            <a href="">智能硬件</a>
            <a href="">服务</a>
            <a href="">社区</a>
        </div>
        <div class="head-search">
            <form>
                <input class="search-text" type="search" name="keword" autocomplete="off" data-search-config="{'defaultWords':[{'Key':'小米手机6','Rst':24},{'Key':'小米手机5X','Rst':6},{'Key':'红米note&nbsp;4X','Rst':13},{'Key':'红米手机4X','Rst':8},{'Key':'小米Max&nbsp;2','Rst':6},{'Key':'手环','Rst':9},{'Key':'耳机','Rst':25},{'Key':'充电宝','Rst':23},{'Key':'运动鞋','Rst':5},{'Key':'路由器','Rst':22},{'Key':'小米盒子','Rst':7},{'Key':'电视','Rst':20}]}"><input class="search-icon" type="submit" value="  "><div class="search-logo"><img src="img/search.png" width="20px"></div>
            </form>
        </div>
    </div>
</div>
<div class="gui-page">
    <div class="side-gui">
        <ul>
            <li><a href="">手机 电话卡</a></li>
            <li><a href="">笔记本</a></li>
            <li><a href="">电视 盒子</a></li>
            <li><a href="">路由器 智能硬件</a></li>
            <li><a href="">移动电源 电池 插线板</a></li>
            <li><a href="">耳机音响</a></li>
            <li><a href="">保护套 贴膜</a></li>
            <li><a href="">线材 支架 储存卡</a></li>
            <li><a href="">箱包 服饰 鞋 眼镜</a></li>
            <li><a href="">米兔 生活周边</a></li>
        </ul>
    </div>
    <div class="page">
        <img src="./img/gui.jpg">
    </div>
</div>
<form class="gui-other" >
    <div class="gui-some">
        <div class="xuangou"><a href=""><img src=""><p>选购手机</p></a></div>
        <div class="xuangou"><a href=""><img src=""><p>企业团购</p></a></div>
        <div class="xuangou"><a href=""><img src=""><p>F码通道</p></a></div>
        <div class="xuangou"><a href=""><img src=""><p>米粉卡</p></a></div>
        <div class="xuangou"><a href=""><img src=""><p>以旧换新</p></a></div>
        <div class="xuangou"><a href=""><img src=""><p>话费充值</p></a></div>
    </div>
    <div class="mi"><a href="javascript:lll();"><img src="./img/mi5x.jpg"></a></div>
    <div class="mi"><a href=""><img src="./img/redmi5a.jpg"></a></div>
    <div class="mi"><a href=""><img src="./img/70mai.jpg"></a></div>
</form>
<div class="star">
    <div class="startitle">
        <div class="tapbutten"></div>
    </div>
    <div class="starpage">
        <div class="things-cheng">
            <div class="white"><a href=""><img src="./img/mimax2.png"><p>小米 Max2</p></a></div>
        </div>
        <div class="things-green">
            <div class="white"><a href=""><img src="./img/mimix2.png"><p>小米 Mix</p></a></div>
        </div>
        <div class="things-blue">
            <div class="white"><a href=""><img src="./img/mi5x.png"><p>小米 5X</p></a></div>
        </div>
        <div class="things-red">
            <div class="white"><a href=""><img src="./img/mitv.png"><p>小米电视</p></a></div>
        </div>
        <div class="things-green">
            <div class="white"><a href=""><img src="./img/miband.png"><p>小米手环</p></a></div>
        </div>
    </div>
</div>
<div class="mainpage">
    <div class="appliance">
        <div class="applititle"></div>
        <div class="applipage">
            <div class="applicard-side"><a href=""><img src="./img/applicard-side.jpg" width="234" height="615"></a></div>
            <div class="applicard"><a href=""><img src="./img/tv1.png"><p>小米电视1</p></a></div>
            <div class="applicard"><a href=""><img src="./img/tv2.png"><p>小米电视2</p></a></div>
            <div class="applicard"><a href=""><img src="./img/tv3.png"><p>小米电视3</p></a></div>
            <div class="applicard"><a href=""><img src="./img/tv4.png"><p>小米电视4</p></a></div>
            <div class="applicard"><a href=""><img src="./img/tv4.png"><p>小米电视5</p></a></div>
            <div class="applicard"><a href=""><img src="./img/tv4.png"><p>小米电视6</p></a></div>
            <div class="applicard"><a href=""><img src="./img/tv4.png"><p>小米电视7</p></a></div>
            <div class="applicard-end"><a href=""><img src="./img/camera.jpg" width="82px" height="82px"><p>小蚁摄像机</p></a></div>
            <div class="applicard-end"><a href=""><img src="./img/next.png" width="100px" height="140px"></a></div>
        </div>
    </div>
</div>

<div class="site-footer">
    <div class="footer">
        <dl class="links">
            <dt>帮助中心</dt>
            <dd><a href="">账户管理</a></dd>
            <dd><a href="">购物指南</a></dd>
            <dd><a href="">订单操作</a></dd>
        </dl>
        <dl class="links">
            <dt>服务支持</dt>
            <dd><a href="">售后政策</a></dd>
            <dd><a href="">自助服务</a></dd>
            <dd><a href="">相关下载</a></dd>
        </dl>
        <dl class="links">
            <dt>线下门店</dt>
            <dd><a href="">小米之家</a></dd>
            <dd><a href="">服务网点</a></dd>
            <dd><a href="">零售网点</a></dd>
        </dl>
        <dl class="links">
            <dt>关于小米</dt>
            <dd><a href="html/aboutcompany.html">了解小米</a></dd>
            <dd><a href="html/aboutcompany.html">加入小米</a></dd>
            <dd><a href="html/aboutcompany.html">联系我们</a></dd>
        </dl>
        <dl class="links">
            <dt>关注我们</dt>
            <dd><a href="">新浪微博</a></dd>
            <dd><a href="">小米部落</a></dd>
            <dd><a href="">官方微信</a></dd>
        </dl>
        <dl class="links">
            <dt>特色服务</dt>
            <dd><a href="">F码通道</a></dd>
            <dd><a href="">礼物码</a></dd>
            <dd><a href="">防伪查询</a></dd>
        </dl>
    </div>
</div>
<div class="site-info">
    <div class="info">
        <div class="foot-logo"><img src="./img/milogo.png"></div>
        <div class="foot-text">
            <p class="text">
                <a href="index.html">小米商城</a><span class="sep">|</span>
                <a href="html/MIUI.html">MIUI</a><span class="sep">|</span>
                <a href="">米家</a><span class="sep">|</span>
                <a href="">米聊</a><span class="sep">|</span>
                <a href="">多看</a><span class="sep">|</span>
                <a href="">路由器</a><span class="sep">|</span>
                <a href="">米粉卡</a><span class="sep">|</span>
                <a href="">小米天猫店</a><span class="sep">|</span>
                <a href="">隐私政策</a><span class="sep">|</span>
                <a href="">问题反馈</a><span class="sep">|</span>
                <a href="">Select Region</a>
            </p>
            <p class="foot-links">@
                <a href="index.html">mi.com</a>京ICP证110207号
                <a href="">京ICP备10046444号</a>
                <a href="">京公网安备11010802020134号</a>
                <a href="">京网文[2014]0059-0009</a>
            </p>
        </div>
    </div>
    <div class="footer-end">探索黑科技，小米为发烧而生！</div>
</div>
<script type="text/javascript">
    function lll() {
        var url = "/Shopping/storeServlet";
        location.href = url;
    }
</script>
</body>
</html>
