<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div>
<s:form action="/addChecks.action" method="post">
	生产订单id:<s:textfield name="proorderId"></s:textfield>
	产品名称:<s:textfield name="name"></s:textfield>
	抽检数量:<s:textfield name="quantity"></s:textfield>
	合格率（%）:<s:textfield name="qualifiedrate"></s:textfield>
	不合格原因:<s:textfield name="reasons"></s:textfield>
	操作人:<s:textfield name="employeeId"></s:textfield>
	备注:<s:textfield name="remarks"></s:textfield>
	<s:submit value="提交"></s:submit>
</s:form>
</div>
</body>
</html>