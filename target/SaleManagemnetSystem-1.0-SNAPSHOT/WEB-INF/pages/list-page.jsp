<%-- 
    Document   : list-page
    Created on : Aug 20, 2020, 8:27:09 PM
    Author     : Huy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<link rel="stylesheet"
	href='<c:url value = "/resources/bootstrap-4.5.0-dist/bootstrap-4.5.0-dist/css/bootstrap.min.css"/>' />
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>List Page</title>
</head>
<body>
<body>
	<div class="container">
		<div class="row">
			<form method="get" action="/">
				<input type="text" id="text"/>
				<input type="submit" value="Search"/> 
			</form>
			<h1 style="text-align: center">List All Orders</h1>
			<table class="table">
				<thead>
					<tr>
						<td>OrderId</td>
						<td>OrderDate</td>
						<td>Customer Name</td>
						<td>View Details</td>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="value" items="${listOrders}">
						<tr>
							<td>${value.getOrderId()}</td>
							<td>${value.getOrderDate()}</td>
							<td>${value.getCustomerName()}</td>
							<td><a href='<c:url value="/${value.getOrderId()}"/>'>View
									Details</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>

	</div>


</body>
</html>
