<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>登陆</title>
    <meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link href="/ssh/login/css/login.css" type="text/css" rel="stylesheet" />
	<script src="/ssh/common/js/jquery-1.8.2.min.js"></script>
	<script src="/ssh/login/js/login.js"></script>
  </head>
  
  <body>
    <form class="loginBox" action="login.action" method="post" name="loginForm">
		<p>登录</p>
		<ul>
			<li class="nameLi">
				<span>用户名：</span>
				<input name="accountName"></input>
			</li>
			<li class="pwdLi">
				<span>密码：</span>
				<input type="password" name="accountPwd"></input>
			</li>
			<li class="btnLi">
				<a href="regist.html">注册</a>
				<a id="loginSub">登陆</a>
			</li>
		</ul>
	</form>
  </body>
</html>
