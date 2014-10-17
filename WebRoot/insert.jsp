<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>插入新图书</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="图书管理,插入新书">
	<meta http-equiv="description" content="插入新图书">
    <meta http-equiv="content-type" charset="utf-8">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<%@ taglib prefix="s" uri="/struts-tags" %>
  </head>
  
  <body bgcolor="#999999" text="white">
   <s:form action="insert">
    <table align="center" width="900px" border="1px">
    <caption>
   <h3> 插入图书信息</h3>
    </caption>
    <tr>
    <td width="300px">I S B N:<input type="text" name="ISBN1"></td>
    <td width="300px">书目：<input type="text" name="title1"></td>
    <td width="300px">序号：<input type="text" name="authorID1"></td>
    </tr>
    <tr>
    <td width="300px">出版社:<input type="text" name="publisher1"></td>
    <td width="300px">日期：<input type="text" name="publishDate1"></td>
    <td width="300px">价格：<input type="text" name="price1"></td>
    </tr>
    </table>
    <table align="center" width="900px" border="1px">
    <tr>
    <td width="225px">序号:<input type="text" name="authorID2"></td>
    <td width="225px">名字:<input type="text" name="name2"></td>
    <td width="225px">年龄:<input type="text" name="age2"></td>
    <td width="225px">国家:<input type="text" name="country2"></td>
    </tr>
    </table>
    <div style="width:800px; float:left; margin-top:10px" align="right">
    <input type="submit" value="提交">
    </div>
   </s:form>
  </body>
</html>













