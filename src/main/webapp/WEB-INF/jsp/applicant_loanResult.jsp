<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<html>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<head>
<title>小额贷款 - 贷款结果界面</title>
<script src="js/Chart-1.0.1-beta.4.js"></script>
<script>
	var data = {
		labels : [ "偿债能力", "获利能力", "经营管理", "诚信状况", "资产利用", "发展潜力" ],
		datasets : [ {
			fillColor : "rgba(151,187,205,0.5)",
			strokeColor : "rgba(151,187,205,1)",
			pointColor : "rgba(151,187,205,1)",
			pointStrokeColor : "#fff",
			data : [ 91, 89, 90, 81, 86, 95 ]
		} ]
	};

	window.onload = function() {
		var ctx = document.getElementById("myChart").getContext("2d");
		new Chart(ctx).Radar(data);
	}
</script>
</head>

<body>
	<canvas id="myChart" width="400" height="400"></canvas>
	<li>综合评分：93.4</li>
	<li>信用评价：极好</li>
	<li>贷款结果：通过</li>
	<li>贷款额度：1000,000.00[壹佰万元整]</li>
</body>
</html>