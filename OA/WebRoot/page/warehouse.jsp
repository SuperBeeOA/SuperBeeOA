<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="common/header.jsp" %>
<%@include file="common/js.jsp" %>
<script src="${pageContext.request.contextPath }/jst/warehouse.js"></script>
	<section>
		<div id="content" class="row-fluid" style="overflow:hidden;">
	         <div class="col-md-2 panel" style="background-color: #e7e7e7; height:0px; padding-bottom:50%">
	            <div class="container">
				    <div class="row">
				        <div class="span2">
				            <ul class="nav nav-pills nav-stacked">
				                <li id="mi" class="active"><a href="javascript:void(0)">账号信息</a></li>
				                <li id="fat"><a href="javascript:void(0)">查看出勤</a></li>
				                <li id="fan"><a href="javascript:void(0)">发布公告</a></li>
				                <li id="fc"><a href="javascript:void(0)">内部联络</a></li>
				                <li id="fs"><a href="javascript:void(0)">查看库存</a></li>
				                <li id="ms"><a href="javascript:void(0)">管理库存</a></li>
				                <li id="ti"><a href="javascript:void(0)">审核入库申请</a></li>
				                <li id="to"><a href="javascript:void(0)">审核出库申请</a></li>
				            </ul>
				        </div>
				    </div>
				</div>
	        </div>
	        
	        <div class="col-md-8 panel" style="background-color: #f8f8f8; height: auto; padding-bottom:3000px; margin-bottom:-3000px;">
	            <%@include file="common/public.jsp" %>
	            <div id="fstock" style="display: none;">
	            	<h2 class="text-center">查看库存</h2>
	            	<hr>
	            </div>
	            <div id="mstock" style="display: none;">
	            	<h2 class="text-center">管理库存</h2>
	            	<hr>
	            </div>
	            <div id="tin" style="display: none;">
	            	<h2 class="text-center">审核入库申请</h2>
	            	<hr>
	            </div>
	            <div id="tout" style="display: none;">
	            	<h2 class="text-center">审核出库申请</h2>
	            	<hr>
	            </div>
	        </div>
	        
	        <div class="col-md-2 panel" style="background-color: #e7e7e7; height: auto; padding-bottom:3000px; margin-bottom:-3000px;">
	            <div>
	            	<h3>个人信息</h3>
	            	<ul class="list-unstyled">
	            		<li><label>姓名：</label>员工001</li>
	            		<li><label>所属公司：</label>台江分部</li>
	            		<li><label>部门：</label>质检部</li>
	            		<li><label>职位：</label>经理</li>
	            		<li><label>工龄：</label>2 年</li>
	            	</ul>
	            </div>
	        </div>
    	</div>
	</section>
<%@include file="common/footer.jsp" %>  