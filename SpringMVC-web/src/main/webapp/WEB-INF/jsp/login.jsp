<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>WELCOME TO LOGIN PAGE</h1>
	<form:form method="POST" action="LoginSubmit.do" modelAttribute="list">
		<table>
			<tr>
					<td>Email:</td>
					<td>
		            <form:input path="emailId"  id="emailId" /> 
		            </td>
			</tr>
			
			<tr>
					<td>Password:</td>
					<td>
		            <form:password path="password"  id="password" /> 
		            </td>
			</tr>
			
			<tr>
					<td>
		            <input type="submit" value="Submit" /> 
		            </td>
			</tr>
			
		</table>
	</form:form>
	
	<a href="registration.do">SignUp Here</a>
</body>
</html>
