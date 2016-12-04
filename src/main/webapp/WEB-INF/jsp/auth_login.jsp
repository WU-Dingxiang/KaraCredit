<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE>
<html>
<head>
<title>小额贷款 - 登录</title>
</head>
<body>
	<form action="login" method="get">
		<table>
			<tr>
				<td><input type="text" name="phone" placeholder="请输入手机号" /></td>
			</tr>
			<tr>
				<td><input type="text" name="captcha" placeholder="动态密码" /></td>
				<td><input type="button" value="发送动态密码" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="登录" /></td>
			</tr>
		</table>
	</form>
</body>
</html>