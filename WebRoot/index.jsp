<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>图书管理系统</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="图书管理,书籍管理,管理">
	<meta http-equiv="description" content="图书管理系统">
    <meta http-equiv="content-type" content="text/html" charset="utf-8">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<%@ taglib prefix="s" uri="/struts-tags" %>
  </head>
  
  <body bgcolor="#999999" text="white">
  <s:form action="login">
    <table  width="800px" height="40px" border="0px" align="center"
    style="margin-bottom:-15px">
    <caption><h3>图书管理系统</h3></caption>
    <tr>
    <td align="right" width="400px">
  	作者的名字：<input type="text" name="name_tp">
    </td>
    <td align="center" width="200px">
    <input type="submit" value="查询">
    </td>
    <td width="200px" align="right">
   	<a href="insert.jsp" style="text-decoration:none;">添加新书</a>
    </td>
    </tr>
    </table>
    </s:form>

    <table width="800px"  border="1px" align="center">
    <tr align="center" height="40px">
      <td width="200px">ISBN</td>
      <td width="200px">书目</td>
      <td width="200px">作者序号</td>
      <td width="200px">管理</td>
    </tr>
    <s:iterator value="list" status="st">
    <tr align="center" height="30px">
      <td><s:property value="ISBN"/></td>
      <td><s:property value="title"/></td>
      <td><s:property value="authorID"/></td>
      <td>
      <div style="width:90px; float:left; height:30px">
      <s:form action="data">
      <input type="hidden" name="ISBN_tp" value="${ISBN }">
       <input type="hidden" name="authorID_tp" value="${authorID }">
      <input type="submit" value="详细">
      </s:form>
      </div>
      <div style="width:90px; float:right; height:30px">
      <s:form action="delect">
      <input type="hidden" name="ISBN_fw" value="${ISBN }">
      <input type="hidden" name="authorID_fw" value="${authorID }">
      <input type="submit" value="删除">
      </s:form>
      </div>
      </td>
      </tr>
    </s:iterator>
  </table>
  </body>
</html>



















