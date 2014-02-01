<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
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
        <td><S:textfield name="user.userName" label="用户名" /></td>
     </tr>
     <tr>
        <td><S:textfield name="user.password" label="密码" /></td>
     </tr>
     <tr>
        <td><S:textfield name="user.email" label="邮箱" /></td>
     </tr>
      <tr>
        <td><S:textfield name="user.age" label="年龄" /></td>
     </tr>
     <tr>
        <td><input type="radio" name="sex" value="0" checked/> 男
        <input type="radio" name="sex" value="1" checked/> 女</td>
     </tr>
     </table> 
   </form>
</body>
</html>