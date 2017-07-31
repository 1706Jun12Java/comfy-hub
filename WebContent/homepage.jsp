<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<link
	href="https://fortawesome.github.io/Font-Awesome/assets/font-awesome/css/font-awesome.css"
	rel="stylesheet">
<link
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css"
	rel="stylesheet" />
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

<nav class="navbar navbar-toggleable-md navbar-light bg-faded"
	style="background-color: white;">
<div class="container-fluid">
	<div class="navbar-header">
		<button type="button" class="navbar-toggle collapsed"
			data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"
			aria-expanded="false">
			<span class="sr-only">Toggle navigation</span> <span class="icon-bar"></span>
			<span class="icon-bar"></span> <span class="icon-bar"></span>
		</button>
	</div>
	<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
		<a class="navbar-brand" href="#"> <img src="ComfyHubLogo.png"
			width="20" height="30" alt="">
		</a>
		<ul class="nav navbar-nav navbar-right">
			<li><a href="logout.html">Sign Up</a></li>
			<li><a href="logout.html">Sign In</a></li>
		</ul>
	</div>
</div>
</nav>
<head>
<title>Homepage - ComfyHub</title>
<link href="css/bootstrap.min.css" rel="stylesheet">
<link rel = "stylesheet"
   type = "text/css"
   href = "myStyle.css" />
<link href="https://fonts.googleapis.com/css?family=Lato"
	rel="stylesheet">

</head>
<body>

	</br>
	<h1>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; ComfyHub :)</h1>
	</br>
	<form class="form-horizontal">
		<fieldset>

			<!-- Select Basic -->
			<div class="form-group">
				<label class="col-md-4 control-label"
					style="font-family: 'Lato'; color: purple; font-size: 15px"
					for="selectbasic">Borough</label>
				<div class="col-md-4">
					<select id="selectbasic" name="selectbasic" class="form-control">
						<option value="Brooklyn">Brooklyn</option>
						<option value="Bronx">Bronx</option>
						<option value="Queens">Queens</option>
						<option value="Manhattan">Manhattan</option>
						<option value="Staten Island">Staten Island</option>
					</select>
				</div>
			</div>

		</fieldset>
	</form>

	
</body>

<footer>
<div class="container">
	<div class="row">
		<div class="col-md-3 col-sm-6 footer-col">
			<div class="logofooter">ComfyHub :)</div>
			<p>ComfyHub is your one-stop shop for all rentals in NYC. We'll
				make sure you get the best deals at the location you want. We
				partner with top industry experts to ensure that your experience is
				worthwhile.</p>
			<p>
				<i class="fa fa-map-pin"></i> 119 West 31st Street, New York, NY
			</p>
			<p>
				<i class="fa fa-phone"></i> Phone : 718-706-8956
			</p>
			<p>
				<i class="fa fa-envelope"></i> E-mail : info@comfyhub.com
			</p>

		</div>
		<div class="col-md-3 col-sm-6 footer-col">
			<h6 class="heading7">GENERAL LINKS</h6>
			<ul class="footer-ul">
				<li><a href="#"> Careers</a></li>
				<li><a href="#"> Privacy Policy</a></li>
				<li><a href="#"> Terms & Conditions</a></li>
				<li><a href="#"> Client Gateway</a></li>
				<li><a href="#"> Ranking</a></li>
				<li><a href="#"> Business Partners</a></li>
				<li><a href="#"> Frequently Ask Questions</a></li>
			</ul>
		</div>
		<div class="col-md-3 col-sm-6 footer-col">
			<h6 class="heading7">LATEST POSTS</h6>
			<div class="post">
				<p>
					The Finest Properties in NYC<span>July 29,2017</span>
				</p>
				<p>
					Welcome to the Big Apple: Did you find your space?<span>July
						24,2017</span>
				</p>
				<p>
					The Highs and Lows of City Life <span>July 19,2017</span>
				</p>
			</div>
		</div>
		<div class="col-md-3 col-sm-6 footer-col">
			<h6 class="heading7">Social Media</h6>
			<ul class="footer-social">
				<li><i class="fa fa-linkedin social-icon linked-in"
					aria-hidden="true"></i></li>
				<li><i class="fa fa-facebook social-icon facebook"
					aria-hidden="true"></i></li>
				<li><i class="fa fa-twitter social-icon twitter"
					aria-hidden="true"></i></li>
				<li><i class="fa fa-google-plus social-icon google"
					aria-hidden="true"></i></li>
			</ul>
		</div>
	</div>
</div>
</footer>
<div class="copyright">
	<div class="container">
		<div class="col-md-6">
			<p>&copy; 2017 - All Rights Reserved with ComfyHub Co.</p>
		</div>
		<div class="col-md-6">
			<ul class="bottom_ul">
				<li><a href="#">comfyhub.com</a></li>
				<li><a href="#">About us</a></li>
				<li><a href="#">Blog</a></li>
				<li><a href="#">Faq's</a></li>
				<li><a href="#">Contact us</a></li>
				<li><a href="#">Site Map</a></li>
			</ul>
		</div>
	</div>
</div>

</html>