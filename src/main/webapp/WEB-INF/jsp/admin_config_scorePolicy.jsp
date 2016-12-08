<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>小额贷款 - 配置管理界面</title>
</head>
<body>
	<h1>小额贷款设置得分策略</h1>
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
			<th>指标</th>
			<th>等级</th>
			<th>分值</th>
		</tr>
		<tr>
			<td rowspan="4">1</td>
			<td rowspan="4">名称地址规范</td>
			<td>非常规范</td>
			<td>90</td>
			<th><input type="button" value='修改' /></th>
		</tr>
		<tr>
			<td>规范</td>
			<td>75</td>
			<th><input type="button" value='修改' /></th>
		</tr>
		<tr>
			<td>不规范</td>
			<td>50</td>
			<th><input type="button" value='修改' /></th>
		</tr>
		<tr>
			<td>非常不规范</td>
			<td>30</td>
			<th><input type="button" value='修改' /></th>
		</tr>
		<tr>
			<td rowspan="5">2</td>
			<td rowspan="5">注册资本</td>
			<td>10亿元以上</td>
			<td>95</td>
			<th><input type="button" value='修改' /></th>
		</tr>
		<tr>
			<td>1亿元~10亿元</td>
			<td>90</td>
			<th><input type="button" value='修改' /></th>
		</tr>
		<tr>
			<td>1千万元~1亿元</td>
			<td>75</td>
			<th><input type="button" value='修改' /></th>
		</tr>
		<tr>
			<td>1千万元~5千万元</td>
			<td>60</td>
			<th><input type="button" value='修改' /></th>
		</tr>
		<tr>
			<td>1千万元以下</td>
			<td>40</td>
			<th><input type="button" value='修改' /></th>
		</tr>
		<tr>
			<td rowspan="4">3</td>
			<td rowspan="4">行业景气</td>
			<td>非常景气</td>
			<td>90</td>
			<th><input type="button" value='修改' /></th>
		</tr>
		<tr>
			<td>景气</td>
			<td>70</td>
			<th><input type="button" value='修改' /></th>
		</tr>
		<tr>
			<td>不景气</td>
			<td>70</td>
			<th><input type="button" value='修改' /></th>
		</tr>
		<tr>
			<td>非常不景气</td>
			<td>30</td>
			<th><input type="button" value='修改' /></th>
		</tr>
		<tr>
			<td rowspan="4">4</td>
			<td rowspan="4">组织/所有权结构</td>
			<td>非常规范</td>
			<td>95</td>
			<th><input type="button" value='修改' /></th>
		</tr>
		<tr>
			<td>规范</td>
			<td>75</td>
			<th><input type="button" value='修改' /></th>
		</tr>
		<tr>
			<td>不规范</td>
			<td>55</td>
			<th><input type="button" value='修改' /></th>
		</tr>
		<tr>
			<td>非常不规范</td>
			<td>45</td>
			<th><input type="button" value='修改' /></th>
		</tr>
		<tr>
			<td rowspan="4">5</td>
			<td rowspan="4">有效经营年限</td>
			<td>三十年以上</td>
			<td>90</td>
			<th><input type="button" value='修改' /></th>
		</tr>
		<tr>
			<td>十年至三十年</td>
			<td>90</td>
			<th><input type="button" value='修改' /></th>
		</tr>
		<tr>
			<td>五年至十年</td>
			<td>75</td>
			<th><input type="button" value='修改' /></th>
		</tr>
		<tr>
			<td>五年以下</td>
			<td>40</td>
			<th><input type="button" value='修改' /></th>
		</tr>
		<tr>
			<td>6</td>
			<td>三月内财务报表</td>
			<td>0.0000</td>
			<th><input type="button" value='修改' /></th>
		</tr>
		<tr>
			<td>7</td>
			<td>其他关键财务</td>
			<td>0.0000</td>
			<th><input type="button" value='修改' /></th>
		</tr>
		<tr>
			<td>8</td>
			<td>产品生产特征</td>
			<td>0.0000</td>
			<th><input type="button" value='修改' /></th>
		</tr>
		<tr>
			<td>9</td>
			<td>产品品质特征</td>
			<td>0.0000</td>
			<th><input type="button" value='修改' /></th>
		</tr>
		<tr>
			<td>10</td>
			<td>产品市场需求</td>
			<td>0.0000</td>
			<th><input type="button" value='修改' /></th>
		</tr>
		<tr>
			<td>11</td>
			<td>产品竞争特征</td>
			<td>0.0000</td>
			<th><input type="button" value='修改' /></th>
		</tr>
		<tr>
			<td>12</td>
			<td>产品用户特征</td>
			<td>0.0000</td>
			<th><input type="button" value='修改' /></th>
		</tr>
		<tr>
			<td>13</td>
			<td>账款催收记录</td>
			<td>0.0000</td>
			<th><input type="button" value='修改' /></th>
		</tr>
		<tr>
			<td>14</td>
			<td>销售变现天数</td>
			<td>0.0000</td>
			<th><input type="button" value='修改' /></th>
		</tr>
		<tr>
			<td>15</td>
			<td>付款异常</td>
			<td>0.0000</td>
			<th><input type="button" value='修改' /></th>
		</tr>
		<tr>
			<td>16</td>
			<td>同行信用记录</td>
			<td>0.0000</td>
			<th><input type="button" value='修改' /></th>
		</tr>
		<tr>
			<td>17</td>
			<td>主管个人信用</td>
			<td>0.0000</td>
			<th><input type="button" value='修改' /></th>
		</tr>
	</table>
</body>



</html>