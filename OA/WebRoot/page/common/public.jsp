<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<script src="${pageContext.request.contextPath }/jst/public.js"></script>
<div id="info">
	<h2 class="text-center">账号信息</h2>
	<hr>
	<div class=" col-md-offset-2"  style="width: 550px;">
		<table class="table table-hover">
			<tr>
				<td style="width: 50%;"><label>职工号：</label></td>
				<td> </td>
			</tr>
			<tr>
				<td><label>姓名：</label></td>
				<td> </td>
			</tr>
			<tr>
				<td><label>性别：</label></td>
				<td> </td>
			</tr>
			<tr>
				<td><label>民族：</label></td>
				<td> </td>
			</tr>
			<tr>
				<td><label>生日：</label></td>
				<td> </td>
			</tr>
			<tr>
				<td><label>所属部门：</label></td>
				<td> </td>
			</tr>
			<tr>
				<td><label>入职时间：</label></td>
				<td> </td>
			</tr>
			<tr>
				<td><label>职务：</label></td>
				<td> </td>
			</tr>
			<tr>
				<td><label>学历：</label></td>
				<td> </td>
			</tr>
			<tr>
				<td><label>电话：</label></td>
				<td> </td>
			</tr>
			<tr>
				<td><label>地址：</label></td>
				<td> </td>
			</tr>
			<tr>
				<td><label>剩余调休时数：</label></td>
				<td> </td>
			</tr>
		</table>
		<a id="cp" href="javascript:void(0)">修改密码</a>
	</div>
	<div id="cpf" class="vertical-center" style="display: none; height: 330px; width: 200px; background-color: white; padding: 20px;">
		<form action="">
			请输入旧密码：<br><br>
			<input type="text" name="oldp"><br><br>
			请输入新密码：<br><br>
			<input type="text" name="newp"><br><br>
			请确认新密码：<br><br>
			<input type="text" name="newps"><br><br>
			<input type="submit" value="确认" class="btn btn-primary">
			<a href="javascript:void(0)" id="close">关闭</a>
		</form>
	</div>
</div>

<div id="attendance" style="display: none;">
	<h2 class="text-center">出勤情况</h2>
	<hr>
	
</div>

<div id="announcement" style="display: none;">
	<h2 class="text-center">发布公告</h2>
	<hr>
	<form action="addAnnouncement.action" method="post">
		发布范围：
		<select name="typrs.typeid">
			<option value="15">本部门</option>
			<option value="8">本公司</option>
		</select>
		<br>
		<input type="hidden" name="employeeBySender.employeeid" value="${sessionScope.employee.employeeid}"/>
		<input type="hidden" name="employeeBySender.department.departmentid" value="${sessionScope.employee.department.departmentid}"/>
		<input type="hidden" name="state.stateid" value="1"/>
		公告标题：
		<br>
		<input type="text" name="announcement.title"/>
		<br>
		公告内容：
		<br>
		<textarea name="announcement.context" rows="20" cols="100" id="com" class="col-md-offset-1"></textarea>
		<br>
		上传图片：
		<br>
		<!-- <input type="file" name="announcement.image"> -->
		<br>
		<input class="btn btn-primary" type="submit" value="发布公告" style="position: relative; left: 45%;">
	</form>
</div>

<div id="contact" style="display: none;">
	<div id="out">
		<h2 class="text-center">发送消息<small><a id="if" href="javascript:void(0)">收到的消息</a></small></h2>
		<hr>
		<form action="addContact.action" method="post">
			收件人：<br>
		<!-- 	所属公司：
			<select name="company">
				<option value="8">本公司</option>
				<option value="15">本部门</option> -->
			</select>
			所属部门：

			<select name="department.departmentname" id="departmentname">
				<option value="业务">业务部</option>
				<option value="人事">人事部</option>
				<option value="财务">财务部</option>
				<option value="生产">生产部</option>
				<option value="仓库">仓库部</option>
				<option value="质检">质检部</option>
			</select>
			姓名：
			<select name="contact.employeeByRecipient.name" id="empname">
				
			</select>
			<input type="hidden" name="contact.employeeBySender.name" value="${sessionScope.employee.name }">
			<br>
			信息内容：
			<br>

			<textarea name="contact.content" rows="20" cols="100" name="com" id="com" class="col-md-offset-1"></textarea>

			<br>
			<input class="btn btn-primary" type="submit" value="发送消息" style="position: relative; left: 45%;">
		</form>
	</div>
	<div id="in" style="display: none;">
		<h2 class="text-center">收到的消息<small><a id="of" href="javascript:void(0)">发送消息</a></small></h2>
		<hr>
		<table class="table table-hover">
			<tr>
				<td>职工号</td>
				<td>发送人</td>
				<td>内容</td>
				<td>发送时间</td>
			</tr>
		</table>
	</div>
</div>