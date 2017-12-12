<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
  	<%-- <c:forEach var="w" items="${requestScope.po}" > --%>
  			${requestScope.po.productname}
  			${requestScope.po.productprice}
  			${requestScope.po.unit}
  <%-- 	</c:forEach> --%>
      <br>
      <div class="divnode">
	    <div>11111111111</div>
	  </div>
	  <script src="${pageContext.request.contextPath }/js/jquery.js"></script>
	  <script type="text/javascript">
		$(function () {
			$(".divnode").append("<p style='width:12px; height:12px; color:red;'>text</p>");
		});
	  </script>
      123
  </body>
</html>
