<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 
<%@include file="common/header.jsp" %>
<%@include file="common/js.jsp" %>
<script src="${pageContext.request.contextPath }/jst/warehouse.js"></script>
	<section>
		<div id="content" class="row-fluid" style="overflow:hidden;">
	        <div class="col-md-2 panel" style="background-color: #e7e7e7; height: auto; padding-bottom:3000px; margin-bottom:-3000px;">
	            <div class="container">
				    <div class="row">
				        <div class="span2">
				            <ul class="nav nav-pills nav-stacked">
				                <li id="mi" class="active"><a href="javascript:void(0)">账号信息</a></li>
				                <li id="fat"><a href="javascript:void(0)">查看出勤</a></li>
				                <li id="fan"><a href="javascript:void(0)">发布公告</a></li>
				                <li id="fc"><a href="javascript:void(0)">内部联络</a></li>
				                <li id="teout"><a href="javascript:void(0)">审核产品出库申请</a></li>
				                <li id="tem"><a href="javascript:void(0)">审核原材料出库申请</a></li>
				                <li id="fo"><a href="javascript:void(0)">查看出库单</a></li>
				                <li id="mwh"><a href="javascript:void(0)">查看库存</a></li>
				            </ul>
				        </div>
				    </div>
				</div>
	        </div>
	        
	        <div class="col-md-8 panel" style="background-color: #f8f8f8; height: auto; padding-bottom:3000px; margin-bottom:-3000px;">
	            <%@include file="common/public.jsp" %>
	            <div id="fteout" style="display: none;">
	            	<h2 class="text-center">审核产品出库申请</h2>
	            	<hr>
	            	<div id="allteout">
	            	</div>
	            	<div id="teouts" style="display: none;">
	            	</div>
	            </div>
	            <div id="fout" style="display: none;">
	            	<h2 class="text-center">查看出库单</h2>
	            	<hr>
	            	<div id="allout">
	            	</div>
	            	<div id="faout" style="display: none;">
	            	</div>
	            </div>
	            <div id="tematerial" style="display: none;">
	            	<h2 class="text-center">审核原材料申请</h2>
	            	<hr>
	            	<div id="alltematerial">
	            	</div>
	            </div>
	            <div id="mwarehouse" style="display: none;">
	            	<h2 class="text-center">库存管理</h2>
	            	<hr>
	            </div>
	        </div>
	        
	        <div class="col-md-2 panel" style="background-color: #e7e7e7; height: auto; padding-bottom:3000px; margin-bottom:-3000px;">
	            <div>
	            	<h3>个人信息</h3>
	            	<ul class="list-unstyled">
	            		<li><label>姓名：</label>${ sessionScope.employee.name }</li>
	            		<li><label>部门：</label>${ sessionScope.employee.department.departmentname }</li>
	            		<li><label>职位：</label>${ sessionScope.employee.post.postname }</li>
	            		<li><label>入职时间：</label><fmt:formatDate value="${ sessionScope.employee.entrytime }" pattern="yyyy-MM-dd"/></li>
	            	</ul>
	            </div>
	        </div>
    	</div>
	</section>
<%@include file="common/footer.jsp" %>  