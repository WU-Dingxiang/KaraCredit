<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>小额贷款 - 管理员批量录入界面</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="css/main.css" />
<link rel="shortcut icon" type="image/x-icon" href="img/favicon.ico" />
</head>
<body id="homefirst">
	<div id="wrapper">
		<div id="header_index"></div>
		<div id="navfirst">
			<ul id="menu">
				<li id="selected">客户信息录入</li>
				<li>系统参数设置</li>
				<li>判别报表读取</li>
				<li>账号注销</li>
			</ul>
		</div>
		<div id="displayx">
			<form action="batchInfo" method="post" enctype="multipart/form-data">
				<table>
					<tr>
						<td><input type="file" name="file" /></td>
					</tr>
					<tr>
						<td>张一航_450319196204305632_20161203.doc</td>
						<td><input type="button" name="delete1" value="删除" /></td>
					</tr>
					<tr>
						<td>李诗琪_321152194504674556_20161204.doc</td>
						<td><input type="button" name="delete2" value="删除" /></td>
					</tr>
					<tr>
						<td>赵欣坛_530512196707127841_20161205.doc</td>
						<td><input type="button" name="delete3" value="删除" /></td>
					</tr>
					<tr>
						<td>葛跃龙_640951199212014315_20161205.doc</td>
						<td><input type="button" name="delete4" value="删除" /></td>
					</tr>
					<tr>
						<td><input type="submit" value="确定录入" /></td>
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