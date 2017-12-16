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
	<h3>Welcome product!</h3>
	<table>
	<form:form method="POST" action="product.do" modelAttribute="list" >
          <tr>
          			<td>Product Id:</td>
            <td>
            	  <form:input path="prodId" id="prodId" /> 
            </td>
          </tr>
          <tr>
          			<td>Product Name:</td>
            <td>
            	  <form:input path="prodName" id="prodName" />
            </td>
          </tr>
          <tr>
          			<td>Procuct Code:</td>
            <td>
            	  <form:input path="prodCode" id="prodCode" />
            </td>
          </tr>
           <tr>
           			<td>Price:</td>
            <td>
           		  <form:input path="prodPrice" id="prodPrice" />
            </td>
          </tr>         
          <tr>
            <td>
            	<input type="submit" value="ADD" />
            </td>
          </tr>
          
           </table> 
           
            <table>
          	<tr>
          		<td>
          			Product Id 
          		</td>
          		<td>
          			Product Name
          		</td>
          		<td>
          			Product Code
          		</td>
          		<td>
          			Price
          		</td>
          	</tr>

          
          
          <c:forEach items="${lostOfProd}" var="prodList">
          <tr>
          	<td>
          		<c:out value="${ prodList.prodId}"></c:out>
          	</td>
          	<td>
          		<c:out value="${ prodList.prodName}"></c:out>
          	</td>
          	<td>
          		<c:out value="${ prodList.prodCode}"></c:out>
          	</td>
          	<td>
          		<c:out value="${ prodList.prodPrice}"></c:out>
          	</td>
          
          </tr>
         
          </c:forEach>
          </table>
	</form:form>
	
</body>
</html>