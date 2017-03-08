<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>图书管理</title>
  </head>
  
  <body>
  	<h1>添加图书</h1>
  	<s:form method="post" action="book_add"  namespace="/" theme="simple">
  		图书名称:<s:textfield name="name"/><br>
  		图书价格:<s:textfield name="price"/> <br>
  		<s:submit value="添加图书"/>
  	</s:form>
  </body>
</html>
