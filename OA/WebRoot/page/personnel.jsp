<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="common/header.jsp" %>
<%@include file="common/js.jsp" %>
<script src="${pageContext.request.contextPath }/jst/personnel.js"></script>
	<section>
		<div id="content" class="row-fluid">
	        <div class="col-md-2 panel" style="background-color: #e7e7e7; height:0px; padding-bottom:50%">
	            <div class="container">
				    <div class="row">
				        <div class="span2">
				            <ul class="nav nav-pills nav-stacked">
				                <li class="active"><a id="mi" href="javascript:void(0)">账号信息</a></li>
				                <li><a id="fat" href="javascript:void(0)">查看出勤</a></li>
				                <li><a id="fan" href="javascript:void(0)">发布公告</a></li>
				                <li><a id="fc" href="javascript:void(0)">内部联络</a></li>
				                <li><a id="np" href="javascript:void(0)">新增员工</a></li>
				                <li><a id="mp" href="javascript:void(0)">管理员工</a></li>
				            </ul>
				        </div>
				    </div>
				</div>
	        </div>
	        
	        <div class="col-md-8 panel" style="background-color: #f8f8f8; height:0px; padding-bottom:50%">
	            <%@include file="common/public.jsp" %>
	            <div id="add" style="display: none;">
	            	<h2 class="text-center">增加员工</h2>
					<hr>
					<form action="">
						
					</form>
	            </div>
	            <div id="manage" style="display: none;">
	            	<h2 class="text-center">管理员工</h2>
					<hr>
	            </div>
	        </div>
	        
	        <div class="col-md-2 panel" style="background-color: #e7e7e7; height:0px; padding-bottom:50%">
	            <div>
	            	<h3>个人信息</h3>
	            	<ul class="list-unstyled">
	            		<li><label>姓名：</label>员工001</li>
	            		<li><label>所属公司：</label>台江分部</li>
	            		<li><label>部门：</label>人事部</li>
	            		<li><label>职位：</label>经理</li>
	            		<li><label>工龄：</label>2 年</li>
	            	</ul>
	            </div>
	        </div>
    	</div>
	</section>
<%@include file="common/footer.jsp" %>  