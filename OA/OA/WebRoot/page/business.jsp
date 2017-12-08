<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="common/header.jsp" %>
<%@include file="common/js.jsp" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<script src="${pageContext.request.contextPath }/jst/business.js"></script>
	<section>
		<div id="content" class="row-fluid">
	        <div class="col-md-2 panel" style="background-color: #e7e7e7; height:0px; padding-bottom:50%">
	            <div class="container">
				    <div class="row">
				        <div class="span2">
				            <ul class="nav nav-pills nav-stacked">
				                <li id="mi" class="active"><a href="javascript:void(0)">账号信息</a></li>
				                <li id="fat"><a href="javascript:void(0)">查看出勤</a></li>
				                <li id="fan"><a href="javascript:void(0)">发布公告</a></li>
				                <li id="fc"><a id="fc" href="javascript:void(0)">内部联络</a></li>
				                <li id="fo"><a href="javascript:void(0)">查看订单</a></li>
				                <li id="ao"><a href="javascript:void(0)">生成订单</a></li>
				                <li id="mc"><a href="javascript:void(0)">管理客户</a></li>
	            				<li id="ms"><a href="javascript:void(0)">管理供应商</a></li>
				            </ul>
				        </div>
				    </div>
				</div>
	        </div>
	        
	        <div class="col-md-8 panel" style="background-color: #f8f8f8; height:0px; padding-bottom:50%">
	            <%@include file="common/public.jsp" %>
	            <div id="forder" style="display: none;">
	            	<h2 class="text-center">查看订单</h2>
	            	<hr>
	            	<table class="table table-hover table-bordered">
	            		<tr>
	            			<td>订单编号</td>
	            			<td>客户编号</td>
	            			<td>成交金额</td>
	            			<td>生成日期</td>
	            			<td>操作</td>
	            		</tr>
	            	</table>
	            </div>
	            <div id="aorder" style="display: none;">
	            	<h2 class="text-center">生成订单</h2>
	            	<hr>
	            	<form action="">
	            		<table class="table">
	            			<tr>
	            				<td>订单号：</td>
	            				<td> <input type="text" name="orders.orderid" class="orderno"> </td>
	            				<td>客户编号：</td>
	            				<td>
								<select style="width:150px" class="cutomerNo" name="orders.customer">	
	            				</select></td>
	            				<td>发起时间：</td>
	            				<td><input name="orders.datetime" type="date">    </td>
	            			</tr>
	            			<tr><td></td><td></td><td></td><td></td><td></td><td></td></tr>
	            			<tr>
	            				<td>序号</td>
	            				<td>产品编号</td>
	            				<td>单位</td>
	            				<td>数量</td>
	            				<td>单价</td>
	            				<td>合计</td>
	            			</tr>
	            			<tr>
	            				<td>1</td>
	            				<td>
	            				<select style="width:150px" class="productid" name="product.productid">	
	            				</select>
	            				</td>			
	            				<td class="unit"></td>
	            				<td><input type="text" name="orders.quantity"></td>
	            				<td class="productprice"></td>
	            				<td><input type="text" name="orders.price"></td>
	            			</tr>
	            		
	            		</table>
	            		<input class="btn btn-primary" type="submit" value="提交订单" style="position: relative; left: 45%;">
	            	</form>
	            </div>
	            <div id="customer" style="display: none;">
	            	<h2 class="text-center">管理客户</h2>
	            	<hr>
	            
	            </div>
	            <div id="supplier" style="display: none;">
	            	<h2 class="text-center">管理供应商</h2>
	            	<hr>
	            
	            </div>
	        </div>
	        
	        <div class="col-md-2 panel" style="background-color: #e7e7e7; height:0px; padding-bottom:50%">
	            <div>
	            	<h3 class="text-center">个人信息</h3>
	            	<ul class="list-unstyled">
	            		<li><label>姓名：</label>员工001</li>
	            		<li><label>所属公司：</label>台江分部</li>
	            		<li><label>部门：</label>业务部</li>
	            		<li><label>职位：</label>经理</li>
	            		<li><label>工龄：</label>2 年</li>
	            	</ul>
	            </div>
	        </div>
    	</div>
	</section>
<%@include file="common/footer.jsp" %>  