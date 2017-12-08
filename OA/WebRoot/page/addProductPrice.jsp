<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-1.8.0.min.js">
</script>
<script type="text/javascript">
$(function() {
	$("#productname").blur(function() {
		if(($(this).val()-$.session.get("proCost"))<0){
			alert("销售定价过低");
		}
	});
});
</script>
</head>
<body>
<div>
<s:form action="/addProducts.action" method="post">
	产品id:<s:textfield name="productid" id="productid"></s:textfield>
	产品单价:<s:textfield name="productname" id="productname"></s:textfield>
	<s:submit value="提交"></s:submit>
</s:form>
</div>
</body>
</html>