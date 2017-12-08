<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="common/header.jsp" %>
<%@include file="common/js.jsp" %>
<script src="${pageContext.request.contextPath }/jst/personnel.js"></script>
	<section>
		<div id="content" class="row-fluid">
	        <div class="col-md-2 panel" style="background-color: #e7e7e7; height:100%; padding-bottom:50%">
	            <div class="container">
				    <div class="row">
				        <div class="span2">
				            <ul class="nav nav-pills nav-stacked">
				                <li id="mi" class="active"><a href="javascript:void(0)">账号信息</a></li>
				                <li id="fat"><a href="javascript:void(0)">查看出勤</a></li>
				                <li id="fan"><a href="javascript:void(0)">发布公告</a></li>
				                <li id="fc"><a id="fc" href="javascript:void(0)">内部联络</a></li>
				                <li id="np"><a id="np" href="javascript:void(0)">新增员工</a></li>
				                <li id="mp"><a href="javascript:void(0)">管理员工</a></li>
				            </ul>
				        </div>
				    </div>
				</div>
	        </div>
	        
	        <div class="col-md-8 panel" style="background-color: #f8f8f8; height:100%; padding-bottom:50%">
	            <%@include file="common/public.jsp" %>
	            <div id="add" style="display: none;">
	            	<h2 class="text-center">增加员工</h2>
					<hr>
					<form action="">
						姓名：<input type="text" name="name"><br>
						性别：<input type="checkbox" name="sex" value="男">男
						<input type="checkbox" name="sex" value="女">女
						<br>
						民族：<input type="text" name="nation"><br>
						生日：<input type="datetime-local" name="birthday"><br>
						部门：
						<select name="departmentid">
							<option value="1">生产</option>
							<option value="2">仓库</option>
							<option value="3">人事</option>
							<option value="4">财务</option>
							<option value="5">质检</option>
							<option value="6">业务</option>
						</select>
						<br>
						职务：
						<select name="postid">
							<option value="1">员工</option>
							<option value="2">主任</option>
						</select>
						<br>
						学历：
						<select name="education">
							<option value="1">专科</option>
							<option value="2">本科</option>
						</select>
						<br>
						电话：<input type="text" name="phone"><br>
						地址：<input type="text" name="address"><br>
						基础工资：<input type="text" name="money"><br>
						密码：<input type="text" name="password"><br>
						调休时数：<input type="text" name="resttime"><br>
						车间：
						<select name="workshopid">
							<option value="1">一号</option>
							<option value="2">二号</option>
						</select>
						<br>
						班组：
						<select name="teamid">
							<option value="1">一组</option>
							<option value="2">二组</option>
						</select>
						<br>
						<input type="submit" value="录入" class="btn btn-primary">
					</form>
	            </div>
	            <div id="manage" style="display: none;">
	            	<h2 class="text-center">管理员工</h2>
					<hr>
	            </div>
	        </div>
	        
	        <div class="col-md-2 panel" style="background-color: #e7e7e7; height:100%; padding-bottom:50%">
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