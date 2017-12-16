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
	<h1>WELCOME TO REGISTRATION PAGE</h1>
	<form:form method="POST" action="registrationsubmit.do" modelAttribute="list">
		<table>
			<tr>
					<td>
						<form:errors path="firstname" class ="error.fn" style="color: red;"></form:errors>
		                 FirstName  <form:input path="firstname"  id="firstname" /> 
		            </td>
			</tr>
			
			<tr>
					<td>
						<form:errors path="lastname" class ="error.ln" style="color: red;"></form:errors>
		                 LastName  	<form:password path="lastname"  id="lastname" /> 
		            </td>
			</tr>
			
			<tr>
					<td>
						<form:errors path="email" class ="error.mail" style="color: red;"></form:errors>
		                 Email  	<form:input path="email"  id="email" /> 
		            </td>
			</tr>
			
			<tr>
					<td>
						<form:errors path="password" class ="error.pwd" style="color: red;"></form:errors>
		                 Password  	<form:input path="password"  id="password" /> 
		            </td>
			</tr>
			
			
			<tr>
					<td>
						<form:errors path="mobilenumber" class ="error.mob" style="color: red;"></form:errors>
		               MobileNumber	<form:input path="mobilenumber"  id="mobilenumber" /> 
		            </td>
			</tr>
			
			<tr>
					<td>
						<form:errors path="address" class ="error.ads" style="color: red;"></form:errors>
		                 Address  	<form:input path="address"  id="address" /> 
		            </td>
			</tr>
			
			<tr>
					<td>
		                  <input type="submit" value="Submit" /> 
		            </td>
			</tr>
			
		</table>
	</form:form>
	
</body>
</html>