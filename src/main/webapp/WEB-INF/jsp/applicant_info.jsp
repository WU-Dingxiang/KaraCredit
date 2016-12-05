<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>小额贷款 - 申请人信息录入界面</title>
</head>
<body>
	<form action="info" method="post" enctype="multipart/form-data">
		<table>
			<tr>
				<td><input type="file" name="file" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="确定录入" /></td>
			</tr>
		</table>
	</form>
</body>
</html>