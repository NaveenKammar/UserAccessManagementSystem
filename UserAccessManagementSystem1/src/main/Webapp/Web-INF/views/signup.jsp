<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/user/signup" method="post">
    <label>Username:</label>
    <input type="text" name="username"/>
    
    <label>Password:</label>
    <input type="password" name="password"/>
    
    <input type="submit" value="Sign Up"/>
</form>

</body>
</html>