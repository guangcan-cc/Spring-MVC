<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>注册页面</title>
</head>
<body>
    <form action="<c:url value="/user/register.do"/>" method="post">
        用户名：<input type="text" value="${user.username}" name="username"/><br>
        密  码：<input type="password" value="${user.password}" name="password"/><br>
        地  址：<input type="text" value="${user.address}" name="address"/><br>
        <input type="reset" value="重置"/>
        <input type="button" value="注册"/>
    </form>
</body>
<script>
    function ajaxSubmit(){
        $.ajax
    }

</script>
</html>
