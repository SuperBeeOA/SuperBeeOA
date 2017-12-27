<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 
<script src="${pageContext.request.contextPath }/jst/personnel.js"></script>
<table class="table table-hover table-bordered">
	<tr>
		<td>职工号</td>
		<td>姓名</td>
		<td>部门</td>
		<td>性别</td>
		<td>操作</td>
	</tr>
	<c:forEach items="${ sessionScope.loademp }" var="emp">
		<tr>
			<td>${emp.workid }</td>
			<td>${emp.name }</td>
			<td>${emp.department.departmentname }</td>
			<td>${emp.sex }</td>
			<td>
				<input class="workid" type="hidden" value="${emp.workid }">
				<input class="xg" type="button" value="修改">
				<input class="sc" type="button" value="删除">
			</td>
		</tr>
	</c:forEach>
</table>