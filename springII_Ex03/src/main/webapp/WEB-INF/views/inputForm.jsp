<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Input Form</title>
</head>
<body>
<div align="center">
<hr width="400" color="red"/>
<h2>개인 정보 입력</h2>
<hr width="500" color="red"/>

<!-- <form action="person" method="get"> -->
 <form action="person" method="post"> 
이름 : <input type="text" name="name"/><br/>
아이디 : <input type="text" name="id"/><br/>
<input type="submit" value="전송"/>
</form>
</div>
</body>
</html>