<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>小额贷款 - 管理员主界面</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="css/main.css" />
<link rel="shortcut icon" type="image/x-icon" href="img/favicon.ico" />
</head>
<body id="homefirst">
	<div id="wrapper">
		<div id="header_index"></div>
		<div id="navfirst">
			<ul id="menu">
				<li>客户信息录入</li>
				<li id='selected'>系统参数设置</li>
				<li>判别报表读取</li>
				<li>账号注销</li>
			</ul>
		</div>
		<div id="displayx">
			<table border='0'>
				<tr>
					<td>企业名称</td>
					<td>_________</td>
					<td>性质
					</th>
					<td>_________</td>
					<td>测定日期</td>
					<td>_________</td>
				</tr>
			</table>
			<table border='1'>
				<tr>
					<th>序号</th>
					<th>总分</th>
					<th>策略</th>
				</tr>
				<tr>
					<td rowspan="2">1</td>
					<td rowspan="2">90分以上</td>
					<td>贷款结果</td>
					<td>通过</td>
					<th><input type="button" value='修改' /></th>
				</tr>
				<tr>
					<td>贷款额度</td>
					<td>[人民币]1000,000(壹佰万元整)</td>
					<th><input type="button" value='修改' /></th>
				</tr>
				<tr>
					<td rowspan="2">2</td>
					<td rowspan="2">80分至90分</td>
					<td>贷款结果</td>
					<td>通过</td>
					<th><input type="button" value='修改' /></th>
				</tr>
				<tr>
					<td>贷款额度</td>
					<td>[人民币]500,000(伍拾万元整)</td>
					<th><input type="button" value='修改' /></th>
				</tr>
				<tr>
					<td rowspan="2">3</td>
					<td rowspan="2">60分至80分</td>
					<td>贷款结果</td>
					<td>通过</td>
					<th><input type="button" value='修改' /></th>
				</tr>
				<tr>
					<td>贷款额度</td>
					<td>[人民币]100,000(拾万元整)</td>
					<th><input type="button" value='修改' /></th>
				</tr>
				<tr>
					<td rowspan="2">4</td>
					<td rowspan="2">60分以下</td>
					<td>贷款结果</td>
					<td>不通过</td>
					<th><input type="button" value='修改' /></th>
				</tr>
				<tr>
					<td>贷款额度</td>
					<td>——</td>
					<th><input type="button" value='修改' /></th>
				</tr>
			</table>
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