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
				<td>订单ID</td>
				<td>${orderId}</td>
			</tr>
			<tr>
				<td>支付金额</td>
				<td><fmt:formatNumber value="${payAmount/100}"
						pattern="Y#0.00" type="number" /></td>
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
				<td><input name="orderId" type=hidden value="${orderId}" /></td>
			</tr>
		</table>
	</form>
</body>
</html>