<%@ page language="java" contentType="text/html; charset=GB18030"
	pageEncoding="GB18030"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>register</title>
</head>
<body>
	<form action="user/addUser" method="post">
		<table id="advSearch" width="380" height="66">
			<tr>
				<td><s:textfield name="users.loginName" label="�û���" /></td>
			</tr>
			<tr>
				<td><s:textfield name="users.loginPwd" label="����" /></td>
			</tr>
			<tr>
				<td><s:textfield name="users.email" label="����" /></td>
			</tr>
			<tr>
				<td><s:textfield name="users.age" label="����" /></td>
			</tr>
			<tr>
				<td><input type="radio" name="users.sex" value="0" checked /> �� <input
					type="radio" name="users.sex" value="1" checked /> Ů</td>
			</tr>
			<tr>
				<td><s:submit align="left" value="ȷ��" /></td>
			</tr>
		</table>
	</form>
</body>
</html>