<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
欢迎首页
<br/>
你好<c:out value="${pageContext.request.remoteUser}"/>
<br/>
<button id="logoutbtn">退出系统</button>
<br>
下面是spring官方提供的退出
<div class="container">
    <h1>This is secured!</h1>
    <p>
        获取当前登陆者信息：<b><c:out value="${pageContext.request.remoteUser}"/></b>
    </p>
    <c:url var="logoutUrl" value="/logout"/>
    <form class="form-inline" action="${logoutUrl}" method="post">
        <input type="submit" value="携带csrf参数的退出"/>
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
    </form>
</div>
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
