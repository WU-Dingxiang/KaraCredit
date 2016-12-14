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
				<li>系统参数设置</li>
				<li>判别报表读取</li>
				<li id='selected'>贷款结果报表读取</li>
				<li>账号注销</li>
			</ul>
		</div>
		<div id="displayx">
			<h4>申请人贷款结果报表</h4>
			<table border='1'>
				<tr>
					<th>序号</th>
					<th>企业名称</th>
					<th>综合评分</th>
					<th>是否发放</th>
					<th>贷款额度</th>
				</tr>
				<tr>
					<td>1</td>
					<td>红河食品有限责任公司</td>
					<td>83.02</td>
					<td>是</td>
					<td>500,000.00</td>
					<td><input type='submit' value='详细信息' /></td>
				</tr>
				<tr>
					<td>2</td>
					<td>白洁塑料制品厂</td>
					<td>75.61</td>
					<td>是</td>
					<td>100,000.00</td>
					<td><input type='submit' value='详细信息' /></td>
				</tr>
				<tr>
					<td>3</td>
					<td>新塘交通科技有限公司</td>
					<td>92.13</td>
					<td>是</td>
					<td>1000,000.00</td>
					<td><input type='submit' value='详细信息' /></td>
				</tr>
				<tr>
					<td>4</td>
					<td>聚利时食品厂</td>
					<td>76.23</td>
					<td>是</td>
					<td>100,000.00</td>
					<td><input type='submit' value='详细信息' /></td>
				</tr>
				<tr>
					<td>5</td>
					<td>七叶物流有限责任公司</td>
					<td>85.78</td>
					<td>是</td>
					<td>500,000.00</td>
					<td><input type='submit' value='详细信息' /></td>
				</tr>
				<tr>
					<td>6</td>
					<td>高龙（集团）有限责任公司</td>
					<td>91.56</td>
					<td>是</td>
					<td>1000,000.00</td>
					<td><input type='submit' value='详细信息' /></td>
				</tr>
			</table>

		</div>

		<div id="navfirst">
			<ul id="menu">
				<li id='selected'>1</li>
				<li>2</li>
				<li>3</li>
				<li>4</li>
				<li>5</li>
				<li>6</li>
				<li>7</li>
				<li>8</li>
				<li>9</li>
				<li>10</li>
				<li>11</li>
				<li>···</li>
				<li>下一页</li>
				<li>尾页</li>
			</ul>
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