<%--
  Created by IntelliJ IDEA.
  User: 33126
  Date: 2022/1/17
  Time: 22:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/quick12" method="post" enctype="multipart/form-data">
        姓名：<input type="text" name="username"/><br>
        图片：<input type="file" name="upload"/><br>
        <input type="submit" value="确定上传">
    </form>
</body>
</html>
