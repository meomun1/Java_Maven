<%@ taglib prefix="shop" tagdir="/WEB-INF/tags"%>

<!DOCTYPE html>
<html lang="en">
<head>
	<title>Max-Luong</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
<!--===============================================================================================-->	
	<link rel="icon" type="image/png" href="images/icons/favicon.ico"/>
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/bootstrap/css/bootstrap.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="fonts/font-awesome-4.7.0/css/font-awesome.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="fonts/Linearicons-Free-v1.0.0/icon-font.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/animate/animate.css">
<!--===============================================================================================-->	
	<link rel="stylesheet" type="text/css" href="vendor/css-hamburgers/hamburgers.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/animsition/css/animsition.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/select2/select2.min.css">
<!--===============================================================================================-->	
	<link rel="stylesheet" type="text/css" href="vendor/daterangepicker/daterangepicker.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="css/util.css">
	<link rel="stylesheet" type="text/css" href="css/main.css">

	<shop:indexcss/>

<!--===============================================================================================-->
</head>
<body style="background-color: #666666;">

	<div class="limiter">
		
		<div class="container-login100">
			<div class="wrap-login100">

				<form class="login100-form validate-form" action="sign-up" method= "POST">
					<span class="login100-form-title p-b-43">
						Login to continue
					</span>

                    <div class="wrap-input100 validate-input" data-validate = "Please enter first name">
						<input class="input100" type="text" name="firstName">
						<span class="focus-input100"></span>
						<span class="label-input100">First Name</span>
					</div>

                    <div class="wrap-input100 validate-input" data-validate = "Please enter last name">
						<input class="input100" type="text" name="lastName">
						<span class="focus-input100"></span>
						<span class="label-input100">Last Name</span>
					</div>

                    <div class="wrap-input100 validate-input" data-validate = "Valid email is required: ex@abc.xyz">
						<input class="input100" type="email" name="email">
						<span class="focus-input100"></span>
						<span class="label-input100">Email</span>
					</div>
					
					
					<div class="wrap-input100 validate-input" data-validate="Password is required">
						<input class="input100" type="password" name="password">
						<span class="focus-input100"></span>
						<span class="label-input100">Password</span>
					</div>
					
					
					<div class="wrap-input100 validate-input" data-validate="Password is required">
						<input class="input100" type="password" name="repeat_password">
						<span class="focus-input100"></span>
						<span class="label-input100">Repeat Password</span>
					</div>

					<c:if test="${errorMessage != null}">
						<div style="text-align: center">
							<span
								style="
								color: #d8000c;
								background-color: #ffd2d2;
								padding: 10pxß;
								margin: 10px 0;
								border: 1px solid #d8000c;
								border-radius: 5px;
								font-family: Arial, sans-serif;
								display: inline-block;
								"
								>${errorMessage}</span
							>
						</div>
					</c:if>

					<div class="flex-sb-m w-full p-t-3 p-b-32">
						<div class="contact100-form-checkbox">
							<input class="input-checkbox100" id="ckb1" type="checkbox" name="remember-me">
							<label class="label-checkbox100" for="ckb1">
								Remember me
							</label>
						</div>

						<div>
							<a href="#" class="txt1">
								Forgot Password?
							</a>
						</div>
					</div>
			

					<div class="container-login100-form-btn">
						<button type = "submit" value="Sign-up" class="login100-form-btn">  <!-- onclick="window.location.href='sign-in.html'"> -->
						Sign-up</button>
					</div>
					
					<div class="text-center p-t-46 p-b-20">
						<span class="txt2">
							or 
							<a href="sign-in">
								sign in
							</a>
							using
						</span>
					</div>

					<div class="login100-form-social flex-c-m">
						<a href="#" class="login100-form-social-item flex-c-m bg1 m-r-5">
							<i class="fa fa-facebook-f" aria-hidden="true"></i>
						</a>

						<a href="#" class="login100-form-social-item flex-c-m bg2 m-r-5">
							<i class="fa fa-twitter" aria-hidden="true"></i>
						</a>
					</div>
				</form>

				<div class="login100-more" style="background-image: url('images/bg-01.jpg'); background-size: cover;">
				</div>
			</div>
		</div>
	</div>
	

	<shop:footer/>
	

	
	<shop:indexjs/>
<!--===============================================================================================-->
	<script src="vendor/jquery/jquery-3.2.1.min.js"></script>
<!--===============================================================================================-->
	<script src="vendor/animsition/js/animsition.min.js"></script>
<!--===============================================================================================-->
	<script src="vendor/bootstrap/js/popper.js"></script>
	<script src="vendor/bootstrap/js/bootstrap.min.js"></script>
<!--===============================================================================================-->
	<script src="vendor/select2/select2.min.js"></script>
<!--===============================================================================================-->
	<script src="vendor/daterangepicker/moment.min.js"></script>
	<script src="vendor/daterangepicker/daterangepicker.js"></script>
<!--===============================================================================================-->
	<script src="vendor/countdowntime/countdowntime.js"></script>
<!--===============================================================================================-->
	<script src="js/signin.js"></script>


</body>
</html>