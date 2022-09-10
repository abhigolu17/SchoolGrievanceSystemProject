<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>

<link href="css/stdReg.css" rel="stylesheet" ></link> 
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body class="container_style">

<div class="container">
        <div class="row">
			<div class="col-md-6 col-md-offset-3">
				<div class="panel panel-login">
					<div class="panel-heading">
						<div class="row">
							<div class="col-xs-6">
								<a href="#" class="active" id="login-form-link">Login</a>
							</div>
							<div class="col-xs-6">
								<a href="#" id="register-form-link">Register</a>
							</div>
						</div>
						<hr>
					</div>
					<div class="panel-body">
						<div class="row">
							<div class="col-lg-12">
								<form id="login-form" action="loginStudent" method="post" role="form" style="display: block;">
									<div class="form-group">
										<input type="text" name="sid" id="sid" required="required" tabindex="1" class="form-control" placeholder="Student ID" value="">
									</div>
									<div class="form-group">
										<input type="password" name="password" required="required" id="password" tabindex="2" class="form-control" placeholder="Password">
									</div>
									<div class="form-group text-center">
										<input type="checkbox" tabindex="3" class="" name="remember" id="remember">
										<label for="remember"> Remember Me</label>
									</div>
									<div class="form-group">
										<div class="row">
											<div class="col-sm-6 col-sm-offset-3">
												<input type="submit" name="login-submit" id="login-submit" tabindex="4" class="form-control btn btn-login" value="Log In">
											</div>
										</div>
									</div>
									<div class="form-group">
										<div class="row">
											<div class="col-lg-12">
												<div class="text-center">
													<a href="http://phpoll.com/recover" tabindex="5" class="forgot-password">Forgot Password?</a>
												</div>
											</div>
										</div>
									</div>
								</form>
								<form id="register-form" action="addStudent" method="post" role="form" style="display: none;">
									<div class="form-group">
										<input type="text" name="sfname" re id="sfname" placeholder="First Name" required="required" value="" size="27">
										<input type="text" name="slname" id="slname" placeholder="Last Name" value="" size="27" >
									</div>
									<div class="form-group">
										<input type="text" name="sid" id="sid" tabindex="1" class="form-control" placeholder="Enrollment No." required="required" value="">
									</div>
									<div class="form-group">
										<input type="email" name="semail" id="semail" tabindex="1" class="form-control" placeholder="Email Address" required="required" value="">
									</div>
									<div class="form-group">
										<input type="password" name="spassword" id="spassword" tabindex="2" class="form-control" placeholder="Password" required="required">
									</div>
									<div class="form-group">
										<input type="text" name="saddress" id="saddress" tabindex="1" class="form-control" placeholder="Address" value="" required="required">
									</div>
									<div class="form-group">
										<input type="text" name="spincode" id="spincode" placeholder="Pin Code" value="" size="25" required="required">
										<input type="radio" tabindex="1" id="sgender" name="sgender" value="male"> Male
										<input type="radio" tabindex="1" id="sgender" name="sgender" value="female"> Female
									</div>
									<!-- <div class="form-group">
										<input type="password" name="confirm-password" id="confirm-password" tabindex="2" class="form-control" placeholder="Confirm Password">
									</div> -->
									<div class="form-group">
										<div class="row">
											<div class="col-sm-6 col-sm-offset-3">
												<input type="submit" name="register-submit" id="register-submit" tabindex="4" class="form-control btn btn-register" value="Register Now">
											</div>
										</div>
									</div>
								</form>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	
	
	<script type="text/javascript">
	$(function() {

	    $('#login-form-link').click(function(e) {
	    	$("#login-form").delay(100).fadeIn(100);
	 		$("#register-form").fadeOut(100);
			$('#register-form-link').removeClass('active');
			$(this).addClass('active');
			e.preventDefault();
		});
		$('#register-form-link').click(function(e) {
			$("#register-form").delay(100).fadeIn(100);
	 		$("#login-form").fadeOut(100);
			$('#login-form-link').removeClass('active');
			$(this).addClass('active');
			e.preventDefault();
		});

	});
	</script>
</body>
</html>