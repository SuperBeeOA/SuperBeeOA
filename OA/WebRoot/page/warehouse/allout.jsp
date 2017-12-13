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
			            				<td><input type="button" value="查看" id="gout"></td>
			            			</tr>
		            			</c:forEach>
		            	</table>

