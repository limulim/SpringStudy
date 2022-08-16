<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<h2>${msg}</h2>
<hr />

<table border="1" cellpadding="2" cellspacing="0">
<tr>
<td>이름</td>
<td>${userVO.userName}</td>
</tr>
</table>
</div>
</body>
</html>