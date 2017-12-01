<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>SuperBeeOA</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	
  	<%@include file="js.jsp" %>
  </head>
  
  <body>
    <header>

	    <!-- Fixed navbar -->
	    <nav class="navbar navbar-default navbar-fixed-top">
	      <div class="container">
	        <div class="navbar-header">
	          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
	            <span class="sr-only">Toggle navigation</span>
	            <span class="icon-bar"></span>
	            <span class="icon-bar"></span>
	            <span class="icon-bar"></span>
	          </button>
	          <a class="navbar-brand" href="#">LOGO</a>
	        </div>
	        <div id="navbar" class="navbar-collapse collapse">
	          <ul class="nav navbar-nav">
	            <li class="active"><a href="${pageContext.request.contextPath }/index.jsp">首页</a></li>
	            <li><a href="${pageContext.request.contextPath }/page/business.jsp">业务</a></li>
	            <li><a href="${pageContext.request.contextPath }/page/production.jsp">生产</a></li>
	            <li><a href="${pageContext.request.contextPath }/page/financial.jsp">财务</a></li>
	            <li><a href="${pageContext.request.contextPath }/page/personnel.jsp">人事</a></li>
	            <li><a href="${pageContext.request.contextPath }/page/quality.jsp">质检</a></li>
	            <li><a href="${pageContext.request.contextPath }/page/warehouse.jsp">仓库</a></li>
	          </ul>
	          <ul class="nav navbar-nav navbar-right">
	            <li><a href="#">员工</a></li>
	            <li><a href="#">签到</a></li>
	            <li><a href="#">补签</a></li>
	            <li class="active"><a href="#">退出<span class="sr-only">(current)</span></a></li>
	          </ul>
	        </div><!--/.nav-collapse -->
	      </div>
	    </nav>
	</header>

