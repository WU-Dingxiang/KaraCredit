<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>测试</title>
</head>
<body>
	<form action="order" method="get">
		<table>
			<tr>
				<td>商品描述</td>
				<td>${product.description}</td>
			</tr>
			<tr>
				<td>支付金额：</td>
				<td><fmt:formatNumber value="${product.price/100}"
						pattern="Y#0.00" type="number" /></td>
			</tr>
			<tr>
				<td>收货地址：</td>
				<td><input type="text" name="address" /></td>
			</tr>
			<tr>
				<td>联系方式：</td>
				<td><input type="text" name="cellphone" /></td>
			</tr>
			<tr>
				<td>商品描述</td>
				<td><input type="submit" value="提交订单" /></td>
				<td><input type="hidden" name="id" value="${product.id}" /></td>
				<td><input type="hidden" name=payAmount value="${product.price}" /></td>
			</tr>
		</table>
	</form>
</body>
</html>