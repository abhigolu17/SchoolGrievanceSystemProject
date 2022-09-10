<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="css/stdQuery.css" rel="stylesheet" ></link>
<title>Insert title here</title>
</head>
<body>
<div align="center">
	<table border="1" style="width:80%">

		<tr>
		<th>Enrollment No.</th>
		<th>First Name</th>
		<th>Last Name</th>
		<th>Gender</th>
		<th>Address</th>
		<th>Pin code</th>
		<th>Password</th>
		<th>Delete<th>
		</tr>
		
		<c:forEach var="item" items="${list}">
			<tr>
				<td>${item.sid}</td>
				<td>${item.sfname}</td>
				<td>${item.slname}</td>
				<td>${item.sgender}</td>
				<td>${item.saddress}</td>
				<td>${item.spincode}</td>
				<td>${item.spassword}</td>
				<td><a href="${pageContext.request.contextPath }/deleteOne/${item.sid }" onclick="return confirm('Are you sure?')">Delete</a>
				</td>
			</tr>
		</c:forEach>
	</table>
</div>
</body>
</html>