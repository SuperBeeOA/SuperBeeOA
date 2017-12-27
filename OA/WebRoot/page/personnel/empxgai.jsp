<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 
<script src="${pageContext.request.contextPath }/jst/personnel.js"></script>
	<form action="" method="post">
		<table class="table table-hover">
							<tr>
								<td><label>职工号：</label></td>
								<td><input name="employee.workid" type="text" value="${ requestScope.empxg.workid }" ></td>		            			
							</tr>
							<tr>
								<td><label>姓名：</label></td>
								<td><input name="employee.name" type="text" value="${ requestScope.empxg.name }" > </td>		            			
							</tr>
							<tr>
								<td><label>性别：</label></td>
								<td><input name="employee.sex" type="text" value="${ requestScope.empxg.sex }"> </td>
							</tr>
							<tr>
								<td><label>民族：</label></td>
								<td><input name="employee.nation" type="text" value="${ requestScope.empxg.nation }"> </td>
		            			
							</tr>
							<tr>
								<td><label>生日：</label></td>
								<td>
									<input name="employee.birthday" type="date" value="${ requestScope.empxg.birthday }">
								
								</td>
								
		            			<td></td>
							</tr>
							<tr>
								<td><label>所属部门：</label></td>
								<td><input name="employee.department.departmentname" type="text" value="${ requestScope.empxg.department.departmentname } "></td>								
							</tr>
							<tr>
								<td><label>入职时间：</label></td>
								<td><input name="employee.entrytime" type="text" value="${ requestScope.empxg.entrytime }">
								<fmt:formatDate value="" pattern="yyyy-MM-dd"/></td>
		            			<td></td>
							</tr>
							<tr>
								<td><label>职务：</label></td>
								<td><input name="employee.workid" type="text" value="${ requestScope.empxg.workid }">${ requestScope.empxg.post.postname } </td>								
							</tr>
							<tr>
								<td><label>学历：</label></td>
								<td><input name="employee.workid" type="text" value="${ requestScope.empxg.workid }">${ requestScope.empxg.education } </td>								
							</tr>
							<tr>
								<td><label>电话：</label></td>
								<td><input name="employee.workid" type="text" value="${ requestScope.empxg.workid }">${ requestScope.empxg.phone } </td>								
							</tr>
							<tr>
								<td><label>地址：</label></td>
								<td><input name="employee.workid" type="text" value="${ requestScope.empxg.workid }">${ requestScope.empxg.address } </td>							
							</tr>
							<tr>
								<td><label>调休时数：</label></td>
								<td><input name="employee.workid" type="text" value="${ requestScope.empxg.workid }">${ requestScope.empxg.resttime } </td>
							</tr>
							<tr>
								<td><label>车间</label></td>
								<td><input name="employee.workid" type="text" value="${ requestScope.empxg.workid }">${ requestScope.empxg.workshop.workshopname } </td>							
							</tr>
						</table>
						<input type="submit" value="修改">
	</form>						
						<input id="bcs" class="btn btn-primary pull-right" type="button" value="返回">