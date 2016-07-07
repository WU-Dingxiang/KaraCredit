<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>测试</title>
</head>
<body>
	<form action="pay" method="get">
		<table>
			<tr>
				<td>商品描述</td>
				<td>${product.description}</td>
			</tr>
			<tr>
				<td>支付金额</td>
				<td><fmt:formatNumber value="${product.price/100}"
						pattern="￥#.00" type="number" /></td>
			</tr>
			<tr>
				<td>支付账号</td>
				<td><input name="payAccount" type="text" /></td>
			</tr>
			<tr>
				<td>支付密码</td>
				<td><input name="payPassword" type="password" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="确认支付" /></td>
				<td><input name="productId" type=hidden value="${product.id}" /></td>
				<td><input name="payMount" type=hidden value="${product.price}" /></td>
			</tr>
		</table>
	</form>
</body>
</html>