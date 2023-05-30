<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@include file="../header.html" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ログイン画面</title>
</head>
<body>
<form action ="/Login/jp.co.aforce/login" method="post">
<p>ログインID:<input type="text" name="login"></p>
<p>パスワード:<input type="password" name="pass"></p>
<p><input type="submit" value="ログイン"></p>
</form>
<%@include file="../footer.html" %>
</body>
</html>