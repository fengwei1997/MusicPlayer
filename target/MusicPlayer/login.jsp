<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>
<!DOCTYPE html>
<head>
	<meta charset="UTF-8" />
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>login</title>
	<link rel="stylesheet" type="text/css" href="css/normalize.css" />
	<link rel="stylesheet" type="text/css" href="css/demo.css" />
	<link rel="stylesheet" href="js/vendor/jgrowl/css/jquery.jgrowl.min.css">
	<!--必要样式-->
	<link rel="stylesheet" type="text/css" href="css/component.css" />
	<!--[if IE]>
	<script src="js/html5.js"></script>
	<![endif]-->
	<style>
		input::-webkit-input-placeholder{
			color:rgba(0, 0, 0, 0.726);
		}
		input::-moz-placeholder{   /* Mozilla Firefox 19+ */
			color:rgba(0, 0, 0, 0.726);
		}
		input:-moz-placeholder{    /* Mozilla Firefox 4 to 18 */
			color:rgba(0, 0, 0, 0.726);
		}
		input:-ms-input-placeholder{  /* Internet Explorer 10-11 */
			color:rgba(0, 0, 0, 0.726);
		}
	</style>
</head>
<body>
<div class="container demo-1">
	<div class="content">
		<div id="large-header" class="large-header">
			<canvas id="demo-canvas"></canvas>
			<div class="logo_box">
				<h3>MARS HELP</h3>
				<form action="doLogin" name="f" method="post">
					<div class="input_outer">
						<span class="u_user"></span>
						<input id="ID" name="username" class="text" style="color: #000000 !important" type="text" placeholder="请输入账户">
					</div>
					<div class="input_outer">
						<span class="us_uer"></span>
						<input id="PASSWORD" name="password" class="text" style="color: #000000 !important; position:absolute; z-index:100;"value="" type="password" placeholder="请输入密码">
					</div>
					<div id="LOGIN" class="mb2"><input type="submit" value="login"></div>
				</form>
			</div>
		</div>
	</div>
</div><!-- /container -->
<script src="js/TweenLite.min.js"></script>
<script src="js/EasePack.min.js"></script>
<script src="js/jquery.js"></script>
<script src="js/rAF.js"></script>
<script src="js/demo-1.js"></script>
<script src="js/vendor/jgrowl/jquery.jgrowl.min.js"></script>
<script src="js/Longin.js"></script>
<div style="text-align:center;">
</div>
</body>
</html>