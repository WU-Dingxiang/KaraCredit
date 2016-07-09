<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>测试</title>
</head>
<body>
	<table>
		<c:forEach items="${productList}" var="product">
			<tr>
				<td>${product.id}</td>
				<td>${product.description}</td>
				<td><fmt:formatNumber value="${product.price/100}"
						pattern="Y#0.00" type="number" /></td>
				<td><a href="preOrder?id=${product.id}">立即购买</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>