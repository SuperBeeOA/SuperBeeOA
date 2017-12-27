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
<s:form action="addProducts.action" method="post">
	产品类型id:<s:textfield name="typeid"></s:textfield>
	产品名称:<s:textfield name="productname"></s:textfield>
	产品规格:<s:textfield name="productno"></s:textfield>
	原料成分:<s:textfield name="component"></s:textfield>
	保质期:<s:textfield name="shelflife"></s:textfield>
	型号:<s:textfield name="productmodel"></s:textfield>
	生产成本价格:<s:textfield name="productioncost"></s:textfield>
	搬运费:<s:textfield name="truckage"></s:textfield>
	产品备注:<s:textfield name="productremarks"></s:textfield>
	产品单位:<s:textfield name="unit"></s:textfield>
	<s:submit value="提交"></s:submit>
</s:form>
</div>
</body>
</html>