<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
	<h2>THIS IS DISPLAY PAGE</h2>
	<h3>Title: ${model.title}</h3>
	<hr>
	<h3>Extra added Info of another Employee given below:</h3>
	${model.employeeObject}
	<hr>
	<table border=1>
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Salary</th>
		</tr>
		<c:forEach items="${model.employeeList}" var="e">
		<tr>
			<td>${e.id}</td>
			<td>${e.name}</td>
			<td>${e.salary}</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>