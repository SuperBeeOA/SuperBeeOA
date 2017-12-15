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
		<td>产品编号</td>
		<td>产品名称</td>
		<td>产品数量</td>
		<td>产品型号</td>
		<td>产品规格</td>
	</tr>
	<tr>
		<td>${ requestScope.order.product.productnumber }</td>
		<td>${ requestScope.order.product.productname }</td>
		<td>${ requestScope.order.quantity }${ requestScope.order.product.unit }</td>
		<td>${ requestScope.order.product.productmodel }</td>
		<td>${ requestScope.order.product.productno }</td>
	</tr>
</table>
<input class="yes" class="btn btn-primary" type="button" value="通过">
<input class="no" class="btn btn-primary" type="button" value="驳回">
<input id="bteo" class="btn btn-primary pull-right" type="button" value="返回">