<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>    
<%@ include file="/common/common.jsp" %>

<!DOCTYPE html>
<html lang="kr">
<head>
   	<meta charset="euc-kr">
   	<meta http-equiv="X-UA-Compatible" content="IE=edge">
   	<meta name="viewport" content="width=device-width, initial-scale=1">
   	<title>WESPEC in Software</title>

   	<!-- Bootstrap -->
   	<link href="<%=skinPath%>/css/bootstrap.min.css" rel="stylesheet">
   	<link href="<%=skinPath%>/css/login.css" rel="stylesheet" media="screen">
   	<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
   	<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
   	<!--[if lt IE 9]>
    	 <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    	 <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
  	 	<![endif]-->
 	</head>
 	<body>

 	<!-- 
 	<video id="videobcg" preload="auto" autoplay="true" loop="loop" muted="muted" volume="50">
     <source src="http://vimeo.com/34706361" type="video/mp4">
     <source src="movie.webm" type="video/webm">
      
	</video> -->
	<!-- 
	<iframe id="videobcg" src="//player.vimeo.com/video/34706361?title=0&amp;byline=0&amp;portrait=0&amp;badge=0&amp;color=ffffff&amp;autoplay=1&amp;loop=1" width="1024" height="575" frameborder="0" webkitallowfullscreen mozallowfullscreen allowfullscreen></iframe> 
	<iframe id="videobcg" src="//player.vimeo.com/video/91590180?title=0&amp;byline=0&amp;portrait=0&amp;color=ffffff&amp;autoplay=1&amp;loop=1" width="1024" height="576" frameborder="0" webkitallowfullscreen mozallowfullscreen allowfullscreen></iframe>
	
	-->
	<iframe id="videobcg"src="//player.vimeo.com/video/78801886?title=0&amp;byline=0&amp;portrait=0&amp;color=ffffff&amp;autoplay=1&amp;loop=1" width="1024" height="436" frameborder="0" webkitallowfullscreen mozallowfullscreen allowfullscreen></iframe>
	
	
	<div class="wrapper">
		
		<form class="form-signin" action="<%=rootPath %>/login" method="post">    
		<h2 class="form-signin-heading">Welcome to Wespec<br>Please login</h2>
			<input type="text" class="form-control" name="memberId" placeholder="Student Code" autofocus="autofocus" /><br>
			<input type="password" class="form-control" name="memberPw" placeholder="Password" /><br/>
			<div class="row">
				<div class="col-md-6"> <input type="checkbox" name="rememberId" value="rememberId"/> <abbr title="���� ���ӽ� ���̵� �ڵ��Է� �˴ϴ�.">Remember your ID</abbr></div>
				<div class="col-md-6"> <input type="checkbox" name="autoLogin" value="autoLogin"/> <abbr title="���� ���ӽ� �ý��ۿ� �ڵ��α��� �˴ϴ�. ���� PC������ �� �׸��� üũ�ϼ���.">Auto Login</abbr></div>
			</div>
			<br/>
			<button class="btn btn-lg btn-primary btn-block" type="submit">Login</button>
			<button class="btn btn-lg btn-warning btn-block" type="submit">Forgot password</button>     
		</form>
	</div>

    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="<%=skinPath%>/js/bootstrap.min.js"></script>
 	</body>
</html>