<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<s:debug></s:debug>
<%-- <s:property value="#request.qualifiedrate"/>
<s:property value="#request.reasons"/> --%>
<%-- <s:iterator value="#request.checkList">  
    <s:property value="checkid"/><br>
    <s:property value="reasons"/><br>
</s:iterator> --%>
<%-- 
XXXXXXXXXXXXXXXXXXXXXXXXXX
<s:iterator value="#request.checkList" id="emp">  
    <s:property value="#emp.checkid"/><br>
    <s:property value="#emp.employee.name"/><br>
    <s:property value="#emp.employee.employeeid"/><br>
</s:iterator> 
XXXXXXXXXXXXXXXXXXXXXXXXXX
--%>
<%-- <c:forEach var="arr" items="${requestScope.checkList}">
	<c:out value="${arr[0].checkid}"/>
	<c:out value="${arr[1].name}"/>
</c:forEach> --%>
<%-- <c:forEach var="arr" items="${requestScope.checkList}">
	<c:out value="${arr[0].checkid}"/>
	<c:out value="${arr[1].proorderid}"/>
</c:forEach> --%>
</body>
</html>