<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>小额贷款 - 申请人贷款结果界面</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="css/main.css" />
<link rel="shortcut icon" type="image/x-icon" href="img/favicon.ico" />
<script src="js/Chart-1.0.1-beta.4.js"></script>
<script>
	var data = {
		labels : [ "偿债能力", "获利能力", "经营管理", "信用记录", "资产利用", "发展潜力" ],
		datasets : [ {
			fillColor : "rgba(151,187,205,0.5)",
			strokeColor : "rgba(151,187,205,1)",
			pointColor : "rgba(151,187,205,1)",
			pointStrokeColor : "#fff",
			data : [ 76.54, 85.00, 82.35, 91.48, 71.48, 81.48 ]
		} ]
	};

	window.onload = function() {
		var ctx = document.getElementById("myChart").getContext("2d");
		new Chart(ctx).Radar(data);
	}
</script>
</head>
</body>
<body id="homefirst">
	<div id="wrapper">
		<div id="header_index"></div>
		<div id="navfirst">
			<ul id="menu">
				<li>信息录入</li>
				<li>贷款申请</li>
				<li id='selected'>判别结果查询</li>
				<li>账号注销</li>
			</ul>
		</div>
		<div id="displayx">
			<table border='0'>
				<tr>
					<th>企业名称</th>
					<td style='text-decoration: underline'>红河食品有限责任公司</td>
					<th>性质</th>
					<td style='text-decoration: underline'>三资企业</td>
					<th>测定日期</th>
					<td style='text-decoration: underline'>2016.10.14</td>
				</tr>
			</table>
			<table>
				<tr>
					<td><canvas id="myChart" width="400" height="400"></canvas></td>
					<td style='width: 100px'></td>
					<td>
						<li>综合评分：83.02</li>
						<li>信用评价：良好</li>
						<li>贷款结果：通过</li>
						<li>贷款额度：[人民币]500,0000.00[伍拾万元整]</li>
					</td>
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