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
		labels : [ "偿债能力", "获利能力", "经营管理", "诚信状况", "资产利用", "发展潜力" ],
		datasets : [ {
			fillColor : "rgba(151,187,205,0.5)",
			strokeColor : "rgba(151,187,205,1)",
			pointColor : "rgba(151,187,205,1)",
			pointStrokeColor : "#fff",
			data : [ 100, 100, 100, 100, 100, 100 ]
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
			<table>
				<tr>
					<td><canvas id="myChart" width="400" height="400"></canvas></td>
					<td style='width: 100px'></td>
					<td>
						<li>综合评分：0.00</li>
						<li>信用评价：[null]</li>
						<li>贷款结果：[null]</li>
						<li>贷款额度：[人民币]0.00[null]</li>
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