<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@include file="../common/js.jsp" %>
<script src="${pageContext.request.contextPath }/jst/financial.js"></script>
			<form action="javascript:void(0)" id="productOrder">
	            		<table class="table">
		            		<tr>	            				
	            				<td>订单号：</td>
	            				<td><input type="text" value="${requestScope.waitpass.ordernumber}"> 
	            					<input type="hidden" name="orders.orderid" value="${requestScope.waitpass.orderid}">
	            				</td>
	            				<td>客户名称：</td>
	            				<td><input type="text" value="${requestScope.waitpass.customer.customername}"></td>
	            				<td>生产批号：</td>
	            				<td><input type="text" name="proorder.productno"></td>
	            				<td>发起时间：</td>
	            				<td><input type="date" name="proorder.datetime"></td>
	            			</tr>       		
	            			<tr>
	            				<td>产品名称</td>
	            				<td>产品规格</td>
	            				<td>单位</td>
	            				<td>数量</td>
	            				<td>包装方式</td>  
	            				<td>任务单负责人</td>
	            				<td>备注</td>
	            			</tr>
	            			<tr>
	            				<td><input type="text" value="${requestScope.waitpass.product.productname}"></td>
	            				<td><input type="text" value="${requestScope.waitpass.product.productno}"></td>
	            				<td><input type="text" value="${requestScope.waitpass.product.unit}"></td>
	            				<td><input type="text" value="${requestScope.waitpass.quantity}"></td>	   
	            				<td><input type="text" name="proorder.packing">   </td>        				
	            				<td><input type="text" name="employee.employeeid" value="${sessionScope.employee.employeeid}"></td>
	            				<td><input type="text" name="proorder.remarks">   </td>
	            			</tr>
		            	</table>
		            	<input class="btn btn-primary" id="downorder" type="button" value="下单" style="position: relative; left: 45%;">
	            	</form>