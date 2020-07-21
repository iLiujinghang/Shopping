<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="domain.user" %>
<%@ page import="java.util.List" %>
<%@ page import="domain.goods" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    user user = (user)request.getSession().getAttribute("user");
    String user_id = user.getUser_id();
    String user_name = user.getUser_name();
    List<goods> list = (List<goods>) request.getAttribute("list");
%>
<html>
<head>
    <title>小米note</title>
    <link rel="stylesheet" type="text/css" href="./css/goods.css">
    <link rel="icon" type="image/x-icon" href="./img/favicon.ico">
    <script src="./js/jquery-3.3.1.js"></script>
    <script src="./js/123.js"></script>
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
            <a class="link" href="./html/Login.html"><%=user_name%></a>
            <span class="sp">|</span>
            <a class="link" href="./html/registered.html">注册</a>
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
            <a href="./index.html">小米手机</a>
            <a href="./index.html">红米</a>
            <a href="./index.html">笔记本</a>
            <a href="./index.html">电视</a>
            <a href="./index.html">盒子</a>
            <a href="./index.html">新品</a>
            <a href="./index.html">路由器</a>
            <a href="./index.html">智能硬件</a>
            <a href="./index.html">服务</a>
            <a href="./index.html">社区</a>
        </div>
        <div class="head-search">
            <form>
                <input class="search-text" type="search" name="keword" autocomplete="off" data-search-config="{'defaultWords':[{'Key':'小米手机6','Rst':24},{'Key':'小米手机5X','Rst':6},{'Key':'红米note&nbsp;4X','Rst':13},{'Key':'红米手机4X','Rst':8},{'Key':'小米Max&nbsp;2','Rst':6},{'Key':'手环','Rst':9},{'Key':'耳机','Rst':25},{'Key':'充电宝','Rst':23},{'Key':'运动鞋','Rst':5},{'Key':'路由器','Rst':22},{'Key':'小米盒子','Rst':7},{'Key':'电视','Rst':20}]}"><input class="search-icon" type="submit" value="">
            </form>
        </div>
    </div>
</div>
<div class="main-page">
    <div class="nav-bar">
        <div class="container">
            <div class="title">
                <h2>小米Note<small><span class="sep">|</span><a href="">小米Note 女神版</a></small>
                </h2>
            </div>
            <form class="nav3" action="${pageContext.request.contextPath}/buyServlet">
				    <span class="nav-switch">
				        <a class="tab-active" href="./html/mipro.html">概述</a>
				        <span class="separator">|</span>
				        <a class="tab" href="">相册</a>
				        <span class="separator">|</span>
				        <a class="tab" href="">设计</a>
				        <span class="separator">|</span>
				        <a class="tab" href="">相机</a>
				        <span class="separator">|</span>
				        <a class="tab" href="">HiFi</a>
				        <span class="separator">|</span>
				        <a class="tab" href="">MIUI</a>
				        <span class="separator">|</span>
				        <a class="tab" href="./html/picture.html">图集</a>
				        <span class="separator">|</span>
				        <a class="tab" href="">参数</a>
				        <span class="separator">|</span>
				        <a class="link" href="/service/safe/" target="_blank">意外保</a>
				        <span class="separator">|</span>
				        <a class="link J_discuzz" href="" target="_blank">讨论区</a>
				        <span class="separator J_discuzz">|</span>
				        <a class="link J_linkFcode" href="">F码通道</a>
                        <input hidden name="user_id" value="<%=user_id%>">
                        <input hidden name="goods_name" value="小米note女神版">
				    </span>
                <button type="submit" name="goods_id" value="1">点击购买</button>
            </form>
        </div>
    </div>
    <div class="bd">
        <div class="content">
            <h1 class="webfont1">小米<span>Note</span></h1>
            <h2 class="webfont2">大屏旗舰，HiFi 双卡双待</h2>
            <p class="price">
                <span class="number">双网通/全网通 直降300元</span>
                <span class="number">1499元起</span>
            </p>
            <a href="./video.jsp"><span>观看介绍视频</span></a>
        </div>
    </div>
    <div class="phone-list"><img class="mipro1" src="./img/mipro1.jpg">
    </div>
    <div class="phone-list2">
        <div><p>双卡双待 双4G</p></div>
        <div><p>高通骁龙801/810处理器</p></div>
        <div><p>5.7英寸 1080p/2K阳光屏</p></div>
        <div><p>索尼1300万像素光学防抖相机</p></div>
        <div><p>独立HiFi音乐系统</p></div>
        <div><p>6.95mm纤薄机身</p></div>
        <div><p>前后双曲面玻璃</p></div>
        <div><p>3000mAh/3090mAh大容量电池</p></div>
    </div>
    <img class="mipro2" src="./img/mipro2.jpg">
    <div class="content-design">
        <h1 class="title-webfont">为玻璃赋予生命<br>工艺与手感，更进一步</h1>
        <h2 class="subtitle-webfont">前后曲面玻璃&nbsp;&nbsp;/&nbsp;&nbsp;铝合金金属边框<br>6.95mm 纤薄机身</h2>
        <p class="text">为了奉上代表我们科技与工艺水准的杰出之作，工程师经历了复杂而苛刻的设计与研发过程。不仅将每一个高性能元器件浓缩在仅有 6.95 毫米的纤薄机身内，更选择了加工难度大且昂贵，但更具生命力的曲面玻璃作为机身主要材质，并选用铝合金塑造金属边框。经过层层工艺，最终赋予小米Note 明玉般的光芒与良好的润泽手感。</p>
        <a class="link" href="//www.mi.com/minote/design/">标准版设计 &gt;</a>
        <a class="link" href="http://hd.mi.com/f/zt/hd/2015031601/index.html">天然竹特别版 &gt;</a>
        <a class="link" href="//www.mi.com/minote/ns/">女神版 &gt;</a>
        <a class="link" href="//www.mi.com/minote/pro/">顶配版 &gt;</a>
    </div>
    <div class="content-performance">
        <h2 class="title-webfont">强大性能<br>集先进科技于一身</h2>
        <p class="text">小米Note 的迷人之处不仅在于更大更薄的优雅外观，内部更蕴含了与使用体验息息相关的强劲性能。选用性能强大的旗舰级高通骁龙801 四核 2.5GHz 处理器，配备 3GB LPDDR3 高速内存，只为了不断响应你对手机的需求，更痛快地玩大型 3D 游戏，看高清电影，在同时处理多项任务时快速切换。</p>
        <ul class="feature-list clearfix">
            <li class="item-std">
                <dl class="clearfix">
                    <dt>标准版</dt>
                    <dd class="left">骁龙801<br>处理器</dd>
                    <dd>3GB<br>LPDDR3</dd>
                </dl>
            </li>
            <li class="item-pro">
                <dl class="clearfix">
                    <dt>顶配版</dt>
                    <dd class="left">骁龙810<br>处理器</dd>
                    <dd>4GB<br>LPDDR4</dd>
                </dl>
            </li>
        </ul>
        <a class="link" href="//www.mi.com/minote/features/">了解性能 &gt;</a>
    </div>

</div>
<img class="bg1" src="./img/bg1.png">
<div class="mipro3">
    <div class="content">
        <h2 class="title  webfont">5.7英寸 2K 高清大屏</h2>
            <div class="subtitle-webfont2">与液晶屏厂商 夏普 / JDI 深度定制，36项屏幕专利</div>
            <p class="text">小米Note 顶配版采用 2K 超高清屏幕，分辨率为 2560x1440，这已经媲美一般 24 英寸电脑显示器的分辨率，是 1080p 分辨率的 1.7 倍之多。为了给顶配版选择一块名副其实的出色屏幕，我们与夏普 / JDI 深度研发定制了这块屏幕，并且就连背光、膜材、液晶等原材料全部采用优质供应商，同时还研发了先进的阳光屏技术、负液晶技术及高色饱技术，配备这些出色的技术，让顶配版这块屏幕几乎成为 5.7 英寸手机屏幕中的旗舰规格。<a class="link" href="//www.mi.com/minote/features/">了解屏幕 &gt;</a></p>
    </div>
    <div class="figure product product-pro"></div>
    <img src="./img/mipro3.jpg" width="1910px">
</div>
<img src="./img/mipro4.jpg" width="1910px">
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
            <dd><a href="">了解小米</a></dd>
            <dd><a href="">加入小米</a></dd>
            <dd><a href="">联系我们</a></dd>
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
            <p class="text3">
                <a href="./index.html">小米商城</a><span class="sep">|</span>
                <a href="./html/miui.html">MIUI</a><span class="sep">|</span>
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
                <a href="">mi.com</a>京ICP证110207号
                <a href="">京ICP备10046444号</a>
                <a href="">京公网安备11010802020134号</a>
                <a href="">京网文[2014]0059-0009</a>
            </p>
        </div>
    </div>
    <div class="footer-end">探索黑科技，小米为发烧而生！</div>
</div>
</body>
</html>
