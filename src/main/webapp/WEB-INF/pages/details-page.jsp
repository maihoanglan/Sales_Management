
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<link rel="stylesheet"
	href='<c:url value = "/resources/bootstrap-4.5.0-dist/bootstrap-4.5.0-dist/css/bootstrap.min.css"/>' />
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Page</title>
</head>
<body>
	<div class="container">
		<div class="row">
			<h1 style="text-align: center">Details Of The Order</h1>
			<table class="table">
				<thead>
					<tr>
						<td>OrderDetailsId</td>
						<td>OrderId</td>
						<td>OrderDate</td>
						<td>Product Name</td>
						<td>Quantity</td>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="value" items="${listOrderDetail}">
						<tr>
							<td>${value.getOrderDetailsId()}</td>
							<td>${value.getOrder().getOrderId()}</td>
							<td>${value.getOrder().getOrderDate()}</td>
							<td>${value.getProduct().getProName()}</td>
							<td>${value.getQuantity()}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>

	</div>

</body>
</html>
