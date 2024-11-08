<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/request/submit" method="post">
    <label>Software Name:</label>
    <input type="text" name="softwareName"/>
    
    <label>Access Type:</label>
    <select name="accessType">
        <option value="Read">Read</option>
        <option value="Write">Write</option>
        <option value="Admin">Admin</option>
    </select>
    
    <label>Reason for Request:</label>
    <textarea name="reason"></textarea>
    
    <input type="submit" value="Submit Request"/>
</form>
</body>
</html>