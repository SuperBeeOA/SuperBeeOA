<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@include file="../common/js.jsp" %>
<script src="${pageContext.request.contextPath }/jst/warehouse.js"></script>

<table class="table table-hover table-bordered">
	<tr>
		<td>订单编号</td>
		<td>发起人</td>
		<td>时间</td>
		<td>操作</td>
	</tr>
	<c:forEach var="allout" items="${ requestScope.allOut }">
		<tr>
			<td>${ allout.ordernumber }</td>
			<td>${ allout.employeeByOriginator.name }</td>
			<td>${ allout.datetime }</td>
			<td>
				<input type="hidden" value="${ allout.ordernumber }">
			    <input type="button" value="查看" class="gout">
			</td>
		</tr>
	</c:forEach>
</table>
<div class="text-center">
	<a href="javascript:void(0)">首页</a>
	<a href="javascript:void(0)">上一页</a>
	<span>第<span>1</span>/${ requestScope.countNo }页</span>
	<a href="javascript:void(0)">下一页</a>
	<a href="javascript:void(0)">末页</a>
</div>
		            	

