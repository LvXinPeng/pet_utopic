<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>Products</title>
<!-- Custom Theme files -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- //Custom Theme files -->
<link href="css/bootstrap.css" type="text/css" rel="stylesheet" media="all">
<link href="css/style.css" type="text/css" rel="stylesheet" media="all">
<link href="css/form.css" rel="stylesheet" type="text/css" media="all" />
<!-- js -->
<script src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/bootstrap-3.1.1.min.js"></script>
<!-- //js -->	
<!-- cart -->
<script src="js/simpleCart.min.js"> </script>
<!-- cart -->
<!-- the jScrollPane script -->
<script type="text/javascript" src="js/jquery.jscrollpane.min.js"></script>
		<script type="text/javascript" id="sourcecode">
			$(function()
			{
				$('.scroll-pane').jScrollPane();
			});
		</script>
		
<!-- //the jScrollPane script -->
<script type="text/javascript" src="js/jquery.mousewheel.js"></script>
<!-- the mousewheel plugin -->		
</head>
<body>
	<!--header-->
	<div class="header">
		<div class="container">
			<nav class="navbar navbar-default" role="navigation">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
						<span class="sr-only">Toggle navigation</span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
					</button>
					<h1 class="navbar-brand"><a  href="index.html">PetUtopia</a></h1>
				</div>
				<!--navbar-header-->
				<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
					<ul class="nav navbar-nav">
						<li><a href="../main.jsp" class="active">首页</a></li>
						<li class="dropdown">
							<a href="#" class="dropdown-toggle" data-toggle="dropdown">宠物狗<b class="caret"></b></a>
							<ul class="dropdown-menu multi-column columns-4">
								<div class="row">
									<div class="col-sm-3">
										<h4>By Relation</h4>
										<ul class="multi-column-dropdown">
											<li><a class="list" href="products.html">阿拉斯加雪撬犬</a></li>
											<li><a class="list" href="products.html">田园犬</a></li>
											<li><a class="list" href="products.html">哈士奇</a></li>
											<li><a class="list" href="products.html">秋田犬</a></li>
											<li><a class="list" href="products.html">吉娃娃</a></li>
											<li><a class="list" href="products.html">杜宾犬</a></li>
										</ul>
									</div>																		
									
								
								</div>
							</ul>
						</li>
					   <li class="dropdown grid">
							<a href="#" class="dropdown-toggle list1" data-toggle="dropdown">宠物猫<b class="caret"></b></a>
							<ul class="dropdown-menu multi-column columns-4">
								<div class="row">
									<div class="col-sm-3">
										<h4>By Relation</h4>
										<ul class="multi-column-dropdown">
											<li><a class="list" href="products.html">Friend</a></li>
											<li><a class="list" href="products.html">Lover</a></li>
											<li><a class="list" href="products.html">Sister</a></li>
											<li><a class="list" href="products.html">Brother</a></li>
											<li><a class="list" href="products.html">Kids</a></li>
											<li><a class="list" href="products.html">Parents</a></li>
										</ul>
									</div>																		
					
									
								</div>
							</ul>
						</li>				
						
						
					</ul> 
					<!--/.navbar-collapse-->
				</div>
				<!--//navbar-header-->
			</nav>
		
			<div class="clearfix"> </div>
		</div>
	</div>
	<!--//header-->
	<!--products-->
	<div class="products">	 
		<div class="container">
			<h2>我们的宠物</h2>			
			<div class="col-md-9 product-model-sec">
			<c:forEach items="${petforkeeps}" var="petforkeep">
				<div class="product-grid">
					<a href="single.jsp?pet_id=${petforkeep.petId }&petName=${petforkeep.petName}&price=${petforkeep.price}&variety=${petforkeep.variety }&petInfo=${petforkeep.petInfo}">				
						<div class="more-product"><span> </span></div>						
						<div class="product-img b-link-stripe b-animate-go  thickbox">
							<img src="../${petforkeep.petPhoto }" class="img-responsive"  alt="">
							<div class="b-wrapper">
								<h4 class="b-animate b-from-left  b-delay03">							
									<button>View</button>
								</h4>
							</div>
						</div>
					</a>				
					<div class="product-info simpleCart_shelfItem">
						<div class="product-info-cust prt_name">
							<h4>${petforkeep.petName }</h4>								
							<span class="item_price">${petforkeep.price}</span>
							<div class="ofr">
								<p><del></del></p>
								<p></p>
							</div>
							<c:if test="${sessionScope.user.user_id == petforkeep.onwerId }">
							<a href="javascript:update();" >修改宠物信息</a>
							<script type="text/javascript">
							function update() {
								
								var temp = document.createElement("form");
								temp.action = "update.jsp";
								temp.method = "post";
								var petName = document.createElement("input");
								petName.setAttribute("name", "petName");
								petName.setAttribute("value", "${petforkeep.petName }");
								temp.appendChild(petName);
								var variety = document.createElement("input");
								variety.setAttribute("name", "variety");
								variety.setAttribute("value", "${petforkeep.variety }");
								temp.appendChild(variety);
								var startDate = document.createElement("input");
								startDate.setAttribute("name", "startDate");
								startDate.setAttribute("value", "${petforkeep.startDate }");
								temp.appendChild(startDate);
								var endDate = document.createElement("input");
								endDate.setAttribute("name", "endDate");
								endDate.setAttribute("value", "${petforkeep.endDate }");
								temp.appendChild(endDate);
								var price = document.createElement("input");
								price.setAttribute("name", "price");
								price.setAttribute("value", "${petforkeep.price }");
								temp.appendChild(price);
								var petInfo = document.createElement("input");
								petInfo.setAttribute("name", "petInfo");
								petInfo.setAttribute("type", "text");
								petInfo.setAttribute("value", "${petforkeep.petInfo}");
								temp.appendChild(petInfo);
								/* ar photo = document.createElement("input");
								photo.setAttribute("name", "petPhoto");
								photo.src = "${petforkeep.petPhoto }";
								temp.appendChild(photo); */
								document.body.appendChild(temp);
								temp.submit();

							}
						</script>
							</c:if>
							
							<div class="clearfix"> </div>
						</div>												
					</div>
				</div>
				</c:forEach>
			</div>	
			
						 
			</div>
	
	</div>
	<!--//products-->
	<!--footer-->
	<div class="footer">
		<div class="container">
			<div class="footer-grids">
				<div class="col-md-2 footer-grid">
					<h4>company</h4>
					<ul>
						<li><a href="products.html">products</a></li>
						<li><a href="#">Work Here</a></li>
						<li><a href="#">Team</a></li>
						<li><a href="#">Happenings</a></li>
						<li><a href="#">Dealer Locator</a></li>
					</ul>
				</div>
				<div class="col-md-2 footer-grid">
					<h4>service</h4>
					<ul>
						<li><a href="#">Support</a></li>
						<li><a href="#">FAQ</a></li>
						<li><a href="#">Warranty</a></li>
						<li><a href="contact.html">Contact Us</a></li>
					</ul>
				</div>
				<div class="col-md-3 footer-grid">
					<h4>order & returns</h4>
					<ul>
						<li><a href="#">Order Status</a></li>
						<li><a href="#">Shipping Policy</a></li>
						<li><a href="#">Return Policy</a></li>
						<li><a href="#">Digital Gift Card</a></li>
					</ul>
				</div>
				<div class="col-md-2 footer-grid">
					<h4>legal</h4>
					<ul>
						<li><a href="#">Privacy</a></li>
						<li><a href="#">Terms and Conditions</a></li>
						<li><a href="#">Social Responsibility</a></li>
					</ul>
				</div>
				<div class="col-md-3 footer-grid icons">
					<h4>Connect with Us</h4>
					<ul>
						<li><a href="#"><img src="images/i1.png" alt=""/>Follow us on Facebook</a></li>
						<li><a href="#"><img src="images/i2.png" alt=""/>Follow us on Twitter</a></li>
						<li><a href="#"><img src="images/i3.png" alt=""/>Follow us on Google-plus</a></li>
						<li><a href="#"><img src="images/i4.png" alt=""/>Follow us on Pinterest</a></li>
					</div>
				</div>
				<div class="clearfix"></div>
			</div>
		</div>
	</div>
	<!--//footer-->
	<div class="footer-bottom">
		<div class="container">
			<p>Copyright &copy; 2015.Company name All rights reserved.More Templates</p>
		</div>
	</div>
</body>

</html>