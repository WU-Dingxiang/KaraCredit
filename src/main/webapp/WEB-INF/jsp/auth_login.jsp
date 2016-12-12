<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>小额贷款 - 登录界面</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=8">
<meta http-equiv="Expires" content="0">
<meta http-equiv="Pragma" content="no-cache">
<meta http-equiv="Cache-control" content="no-cache">
<meta http-equiv="Cache" content="no-cache">
<link rel="stylesheet" type="text/css" href="css/main.css" />
<link rel="shortcut icon" type="image/x-icon" href="img/favicon.ico" />
</head>
<body id="homefirst">
	<div id="wrapper">
		<div id="header_index"></div>
		<div id="displayx">
			<form action="login" method="get">
				<table>
					<tr>
						<td><select placeholder="请输入手机号">
								<option value='' disabled selected style='display: none;'>请选择权限类型</option>
								<option value="admin">管理员</option>
								<option value="applicant">申请人</option>
						</select></td>
					</tr>
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
		</div>

		<!-- 2016-4-1 21:57:12 功能：修改文字 -->
		<div id="footer">
			<div id="copyright">©2016 重庆市小额贷款信息技术工程研究所 版权所有</div>
			<div id="contact">联系方式：microcredit@ciit.cn</div>
		</div>
		<!-- ************************* -->

	</div>
</body>
</html>

</body>
</html>