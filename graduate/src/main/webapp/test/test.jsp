<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="java.sql.*,com.hibtest1.entity.*,java.util.*"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>哎悲剧啊！</title>
</head>
<body>
	<logic:present scope="session" name="testlist">
		<table border="0">
			<s:iterator id="test" value="#session.testlist">
			<!--  	<s:property value="#test.tcontent" ></s:property> -->
			<s:property name="test.tcontent" value="%{test.tcontent}" />
			</s:iterator>
		</table>
	</logic:present>

</body>
</html>