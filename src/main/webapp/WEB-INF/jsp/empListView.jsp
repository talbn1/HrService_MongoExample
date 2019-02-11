<%@ page language="java" contentType="text/html; charset=windows-1255"
	pageEncoding="windows-1255"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1255">
<title>Employee List</title>
</head>
<body>
	<h1 align="center">Employee List</h1>
	<table border="1" cellpadding="10">
<!-- 		<tr>
			<th>Name</th>
			<th>Position</th>
			<th>Email</th>
		</tr> -->
		<c:forEach items="${empList}" var="eployee">
			<tr>
				<td>${eployee.name}</td>
				<td>${eployee.age}</td>
				<td><button type="button">View</button></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>