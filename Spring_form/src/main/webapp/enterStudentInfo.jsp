<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>




<form:form action="/abcd" modelAttribute="student">
First Name:
<form:input path="firstName" />
		<br>
		<br>
		
lastName:

<form:input path="lastName" />
		<br>
		<br>
		<input type="submit" value="submit">
	</form:form>

</body>
</html>