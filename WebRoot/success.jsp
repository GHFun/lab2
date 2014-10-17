<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>新图书插入成功</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="图书管理,插入新书成功">
	<meta http-equiv="description" content="新书插入成功">
    <meta http-equiv="content-type" charset="utf-8">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body  bgcolor="#999999" text="white">
    <h1 align="center">插入成功！</h1>
    <div style="width:800px" align="right">
    <a href="index.jsp" style="text-decoration:none"><h3>返回主页</h3></a>
    </div>
  </body>
</html>
