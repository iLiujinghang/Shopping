<%--
  Created by IntelliJ IDEA.
  User: liujinghang
  Date: 2018/12/24
  Time: 11:50 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>导入数据</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/uploadServlet" method="post" enctype="multipart/form-data">
        <input type="file" name="file">
        <input type="submit" value="上传">
    </form>
</body>
</html>
