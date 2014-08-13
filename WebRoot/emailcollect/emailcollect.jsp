<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>好律师</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link rel="stylesheet" type="text/css" href="/ssh/emailcollect/css/emailcollect.css">
	<script src="/ssh/common/js/jquery-1.8.2.min.js"></script>
	<script src="/ssh/emailcollect/js/emailcollect.js"></script>

  </head>
  
  <body>
    <div class="container">
		<div class="top">
			<div class="tip">
				<p class="logo">好律师</p>
				<p>即将上线...</p>
			</div>
			<div class="subbox">
				<input name="email" value="输入您的电子邮箱"/>
				<a href="javascript:void(0);" id="savebtn">上线通知我</a>
			</div>
		</div>
		<div class="blockdiv">
			<p class="topic">律师服务</p>
			<ul>
				<li>
					<p class="ltopic">建立专业品牌</p>
					<p class="lcontent">好律师网将为您建立一个推广专业服务、拓展同行业人脉和连接海量新客户的最佳免费营销平台。让您在特定从业领域内轻松建立专业品牌！</p>
				</li>
				<li>
					<p class="ltopic">获得更多案源</p>
					<p class="lcontent">好律师网将为客户和律师之间搭建一个服务与实施的平台，旨在协助律师为客户提供专业、优质、及时、便捷的法律服务。让您轻松获得更多案源！</p>
				</li>
				<li>
					<p class="ltopic">提高知名度</p>
					<p class="lcontent">好律师网将吸引众多优秀律师加入，并在开发多项智能推广工具。让您在法律服务业轻松提高知名度！</p>
				</li>
			</ul>
		</div>
		<div class="blockdiv">
			<p class="topic">用户服务</p>
			<ul>
				<li>
					<p class="ltopic">免费咨询律师</p>
					<p class="lcontent">基于您提交的具体法律问题，好律师网将智能化推荐最专业律师免费快速地解答您的问题，并即时通知您。让法律无忧！</p>
				</li>
				<li>
					<p class="ltopic">轻松找到好律师</p>
					<p class="lcontent">基于律师所在地、专业领域、律师评分、客户评价等搜索条件，您可以在好律师网免费快捷地找到为您提供最佳法律服务的好律师。让您省去在各律师事务所之间的奔波之苦！</p>
				</li>
				<li>
					<p class="ltopic">安心获得律师报价</p>
					<p class="lcontent">基于您的个性化法律服务需求，您可以在好律师网一键发布您的需求，快速全面地获得众多资深律师的精准报价。让您的选择变得简单！</p>
				</li>
			</ul>
		</div>
		<div class="blockdiv bottomdiv">
			<p class="topic">快到碗里来</p>
			<p class="lcontent">我们本着促进中国律师行业信用体系，基于对法律、律师的数据分析，尝试成为中国法律服务业的基础坐标之一。我们现有团队由律师业和互联网业的年轻从业人员组成，我们并非精英，不是大牛。我们兼具着理想主义和现实主义，对或错铭记着，利或弊于心里。我们在路上，又在远望。我们在学习，又在探索。</p>
			<p>你，就是你，欢迎和我们一起启航、远望、学习和探索。火速联系，我们需要聊一聊。</p>
			<p>2690143427@qq.com</p>
		</div>
		<div class="footdiv">
			<p>all rights reserved by lvshi.in</p>
		</div> 
	</div>
  </body>
</html>
