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
<script type="text/javascript">
	$(function () {
		function pageNo() {
			var nowpageno = $("#allteout-nowpageno").text();
			var maxpageno = $("#allteout-maxpageno").text();
			if(nowpageno == 1){
				$("#allteout-first").attr({"disabled":"disabled"});
				$("#allteout-up").attr({"disabled":"disabled"});
			}
			if(nowpageno == maxpageno){
				$("#allteout-down").attr({"disabled":"disabled"});
				$("#allteout-last").attr({"disabled":"disabled"});
			}
		}
		pageNo();
	});
</script>
<table class="table table-hover table-bordered">
	<tr>
		<td>订单编号</td>
		<td>发起人</td>
		<td>时间</td>
		<td>操作</td>
	</tr>
	<c:forEach var="allteout" items="${ requestScope.allteout }">
		<tr>
			<td>${ allteout.ordernumber }</td>
			<td>${ allteout.employeeByOriginator.name }</td>
			<td>
				<fmt:formatDate value="${ allteout.datetime }" pattern="yyyy-MM-dd"/>
			</td>
			<td>
				<input type="hidden" value="${ allteout.ordernumber }">
			    <input type="button" value="查看详情" class="gteout">
			</td>
		</tr>
	</c:forEach>
</table>
<div class="text-center">
	<input id="allteout-first" class="btn btn-default" type="button" value="首页">
	<input id="allteout-up" class="btn btn-default" type="button" value="上一页">
	<span>第<span id="allteout-nowpageno">${ requestScope.nowpageno }</span>/<span id="allteout-maxpageno">${ requestScope.countNo }</span>页</span>
	<input id="allteout-down" class="btn btn-default" type="button" value="下一页">
	<input id="allteout-last" class="btn btn-default" type="button" value="末页">
</div>