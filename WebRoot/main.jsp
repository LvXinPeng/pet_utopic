<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML>
<html>
<head>
<title>Pet Utopia</title>
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all">
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="js/jquery-1.11.0.min.js"></script>
<!-- Custom Theme files -->
<link href="css/style.css" rel="stylesheet" type="text/css" media="all"/>
<!-- Custom Theme files -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); }
</script>
<meta name="keywords" content="Happy Pets Responsive web template, Bootstrap Web Templates, Flat Web Templates, AndriodCompatible web template, Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<!--Google Fonts-->
<link href='http://fonts.googleapis.com/css?family=Source+Sans+Pro:200,300,400,600,700,900' rel='stylesheet' type='text/css'>
<link href='http://fonts.googleapis.com/css?family=Droid+Serif:400,700,400italic,700italic' rel='stylesheet' type='text/css'>
	<link rel="stylesheet" href="css/style.css">
	<!-- start-smoth-scrolling -->
<script type="text/javascript" src="js/move-top.js"></script>
<script type="text/javascript" src="js/easing.js"></script>
<script src="js/menu_jquery.js"></script>
	<script type="text/javascript" src='js/style.js'></script>

	<script type="text/javascript">
			jQuery(document).ready(function($) {
				$(".scroll").click(function(event){		
					event.preventDefault();
					$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);
				});
			});
	</script>
<!-- //end-smoth-scrolling -->
</head>
<body>
<script>$(document).ready(function(c) {
	$('.ban-main-cls').on('click', function(c){
		$('.bann-close').fadeOut('slow', function(c){
	  		$('.bann-close').remove();
		});
	});	  
});
</script>
<script src="js/classie.js"></script>
<script src="js/uisearch.js"></script>
<!--header start here-->
<div class="header">
			<div class="nav">
			<div class="logo"> <img  height="75px" src="images\c.png"></div>
				<div class="head-button">
					<div id="loginContainer" ><a href="login.jsp" ><span>登录/注册</span></a></div>
				</div>

			<div class="nav_li">
				<ul>
					<li><a href="">宠物动态</a></li>
					<li><a href="">宠物商城</a></li>
					<li><a href="pet/buypet.jsp">认领寄养</a></li>
					<li><a href="">新手培训</a></li>
					<li><a href="">意见反馈</a></li>
				</ul>
			</div>

		</div></div>

     <div class="clearfix"> </div>
  <!-- </div>	-->

</div>
<!--header end here-->
<!--banner start here-->
<div class="banner">
	<div class="container">
		
	</div>

</div>

<div class="footer">
	<div class="container">
		<div class="footer-main">
			<div class="col-md-5 footer-left">
	           <p>Design by <a href="" target="_blank"> Pet_Utopia </a></p>
			</div>

		  <div class="clearfix"> </div>
		</div>
	</div>

</div>
<!--footer end here-->
</body>
</html>