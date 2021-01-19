<%-- 
    Document   : details-page
    Created on : Aug 20, 2020, 8:42:01 PM
    Author     : Huy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Details Of The Order</h1>
        <table>
            <thead>
                <th>
                    <td>OrderDetailsId</td>
                    <td>OrderId</td>
                    <td>OrderDate</td>
                    <td>Product Name</td>
                    <td>Quantity</td>
                </th>
            </thead>
            <tbody>
                <c:forEach var="value" items="${listOrderDetail}" >
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
    </body>
</html>
