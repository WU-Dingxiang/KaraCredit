<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>小额贷款 - 申请人主界面</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=8">
<meta http-equiv="Expires" content="0">
<meta http-equiv="Pragma" content="no-cache">
<meta http-equiv="Cache-control" content="no-cache">
<meta http-equiv="Cache" content="no-cache">
<link rel="stylesheet" type="text/css" href="css/main.css" />
<link rel="shortcut icon" type="image/x-icon" href="img/favicon.ico" />
</head>
</body>
<body id="homefirst">
	<div id="wrapper">
		<div id="header_index"></div>
		<div id="navfirst">
			<ul id="menu">
				<li id='selected'>信息录入</li>
				<li>贷款申请</li>
				<li>判别结果查询</li>
				<li>账号注销</li>
			</ul>
		</div>
		<div id="displayx">
			<table style='margin-left: 200px;margin-bottom: 500px'>
				<tr>
					<th>企业信息</th>
				</tr>
				<tr>
					<td>名称</td>
					<td><input type="text" style="width: 300px"
						placeholder="必须与营业执照中的名称一致" /></td>
				</tr>
				<tr>
					<td>类型</td>
					<td><input type="text" style="width: 300px"
						placeholder="必须与营业执照中的类型一致" /></td>
				</tr>
				<tr>
					<td>住所</td>
					<td><input type="text" style="width: 300px"
						placeholder="必须与营业执照中的住所一致" /></td>
				</tr>
				<tr>
					<td>法定代表人</td>
					<td><input type="text" style="width: 300px"
						placeholder="必须与营业执照中的法定代表人一致" /></td>
				</tr>
				<tr>
					<td>注册资本</td>
					<td><input type="text" style="width: 300px"
						placeholder="必须与营业执照中的注册资本一致" /></td>
				</tr>
				<tr>
					<td>营业期限</td>
					<td><input type="text" style="width: 300px"
						placeholder="必须与营业执照中的营业期限一致" /></td>
				</tr>
				<tr>
					<td>经营范围</td>
					<td><input type="text" style="width: 300px"
						placeholder="必须与营业执照中的经营范围一致" /></td>
				</tr>
				<tr>
					<td>营业执照</td>
					<td><input type="file" name="file" /></td>
				</tr>
			</table>
			<table>
				<tr>
					<th>营业信息</th>
				</tr>
				<tr>
					<td>年毛利润</td>
					<td><input type="text" style="width: 300px"
						placeholder="必须与财务报表中的年毛利润一致" /></td>
				</tr>
				<tr>
					<td>年净利润</td>
					<td><input type="text" style="width: 300px"
						placeholder="必须与财务报表中的年净利润一致" /></td>
				</tr>
				<tr>
					<td>净资产</td>
					<td><input type="text" style="width: 300px"
						placeholder="必须与财务报表中的净资产一致" /></td>
				</tr>
				<tr>
					<td>负债率</td>
					<td><input type="text" style="width: 300px"
						placeholder="必须与财务报表中的负债率一致" /></td>
				</tr>
				<tr>
					<td>销售变现天数</td>
					<td><input type="text" style="width: 300px"
						placeholder="必须与财务报表中的销售变现天数一致" /></td>
				</tr>
				<tr>
					<td>账款催收记录</td>
					<td>无<input type="radio" checked="checked" />
				</tr>
				<tr>
					<td></td>
					<td>有<input type="radio" /></td>
					<td><input type="file" name="file" /></td>
				</tr>
				<tr>
					<td>年财务报表</td>
					<td><input type="file" name="file" /></td>
				</tr>
			</table>
		</div>

		<!-- 2016-4-1 21:57:12 功能：修改文字 -->
		<!--<div id="footer">
			<div id="copyright">©2016 重庆市小额贷款信息技术工程研究所 版权所有</div>
			<div id="contact">联系方式：microcredit@ciit.cn</div>
		</div>-->
		<!-- ************************* -->

	</div>
</body>
</html>








