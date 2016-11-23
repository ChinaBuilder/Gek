<%--
  Created by IntelliJ IDEA.
  User: KAY
  Date: 2016/11/19
  Time: 19:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>welcome home</title>
</head>
<body>
测试首页
<button id="logoutbtn">退出系统</button>
</body>
<script src="/statics/plugins/jQuery/jquery-2.2.3.min.js"></script>
<script>
    $(function () {
        $("#logoutbtn").click(function () {
            window.location.href = "/login?logout"
        })


    })
</script>
</html>
