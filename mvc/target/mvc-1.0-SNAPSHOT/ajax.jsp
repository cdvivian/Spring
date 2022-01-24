<%--
  Created by IntelliJ IDEA.
  User: 33126
  Date: 2022/1/17
  Time: 12:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="${pageContext.request.contextPath}/js/jquery-3.4.1.js"></script>
    <script>//模拟数据
     var userList = new Array();
     userList.push({username: "张三",age: "20"});
     userList.push({username: "李四",age: "20"});
     $.ajax({
         type: "POST",
         url: "${pageContext.request.contextPath}/quick7",
         data: JSON.stringify(userList),
         contentType : 'application/json;charset=utf-8'});
    </script>
</head>
<body>

</body>
</html>
