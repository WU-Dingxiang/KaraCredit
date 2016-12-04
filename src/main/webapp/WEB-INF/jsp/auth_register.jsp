<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE>
<html>
<head>
<title>小额贷款 - 注册</title>
</head>
<body>
	<form action="register" method="get">
		<table>
			<tr>
				<td><input type="text" name="name" placeholder="请输入您的真实姓名" /></td>
			</tr>
			<tr>
				<td><input type="text" name="idcard" placeholder="请输入您的真实身份证号码" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="注册" /></td>
			</tr>
		</table>
	</form>
</body>
</html>