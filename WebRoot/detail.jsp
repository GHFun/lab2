<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>图书详细信息</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="图书管理,详细信息">
	<meta http-equiv="description" content="图书详细信息">
    <meta http-equiv="content-type" charset="utf-8">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<%@ taglib prefix="s" uri="/struts-tags" %>
  </head>
  
  <body bgcolor="#999999" text="white">
    <table width="800px" height="50px" border="1px" align="center">
    <caption><h3>详细信息</h3></caption>
     <s:iterator value="list3" status="st">
    <tr align="left">
      <td width="200px">书目：<s:property value="title"/></td>
      <td width="200px">价格：<s:property value="price"/></td>
      <td width="200px">出版社：<s:property value="publisher"/></td>
      <td width="200px">日期：<s:property value="publishDate"/></td>
    </tr>
    </s:iterator>
    <s:iterator value="list4" status="st">
    <tr align="left">
      <td width="200px">序号：<s:property value="authorID"/></td>
      <td width="200px">名字：<s:property value="name"/></td>
      <td width="200px">年龄：<s:property value="age"/></td>
      <td width="200px">国家：<s:property value="country"/></td>
    </tr>
    </s:iterator>
    </table>
    <div style="width:800px" align="right">
    <a href="index.jsp" style="text-decoration:none"><h3>返回主页</h3></a>
    </div>
  </body>
</html>













