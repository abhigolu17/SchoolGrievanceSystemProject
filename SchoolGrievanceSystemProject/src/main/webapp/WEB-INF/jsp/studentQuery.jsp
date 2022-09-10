<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<link href="css/queryStd.css" rel="stylesheet" ></link> 
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body class="container_style">
<div class="topnav">
  <a class="active" href="welcomeStudent">Home</a>
<!--   <h3 style="color:red;">Student Query Form</h3> -->
</div>
	<div class="container">
		<div class=" text-center mt-5 ">
			<h1>Student Query Form</h1>
		</div>
		<div class="row ">
			<div class="col-lg-7 mx-auto">
				<div class="card mt-2 mx-auto p-4 bg-light">
					<div class="card-body bg-light">

						<div class="container">
							<form  action="addQuery" method="post" id="contact-form" role="form">
								
								<div class="controls">

									<div class="row">
										<div class="col-md-6">
											<div class="form-group">
												<label for="form_name">Firstname *</label> <input
													id="form_name" type="text" name="fname" class="form-control"
													placeholder="Please enter your firstname *"
													required="required" data-error="Firstname is required.">

											</div>
										</div>
										<div class="col-md-6">
											<div class="form-group">
												<label for="form_lastname">Lastname *</label> <input
													id="form_lastname" type="text" name="surname"
													class="form-control"
													placeholder="Please enter your lastname *"
													required="required" data-error="Lastname is required.">
											</div>
										</div>
									</div>
									<div class="row">
										<div class="col-md-6">
											<div class="form-group">
												<label for="form_email">Email *</label> <input
													id="form_email" type="email" name="email"
													class="form-control"
													placeholder="Please enter your email *" required="required"
													data-error="Valid email is required.">

											</div>
										</div>
										<div class="col-md-6">
											<div class="form-group">
												<label for="form_need">Please specify your need *</label> <select
													id="form_need" name="need" class="form-control"
													required="required" data-error="Please specify your need.">
													<option value="" selected disabled>--Select Your
														Issue--</option>
													<option>Simple Queries</option>
													<option>Exception Queries</option>
													<option>Dependency</option>
													<option>Other</option>
												</select>

											</div>
										</div>
									</div>
									<div class="row">
										<div class="col-md-12">
											<div class="form-group">
												<label for="form_message">Message *</label>
												<textarea id="form_message" name="message"
													class="form-control" placeholder="Write your message here."
													rows="4" required="required"
													data-error="Please, leave us a message."></textarea>
											</div>

										</div>

										<div class="col-md-12">

											<input type="submit" class="btn btn-success btn-send  pt-2 btn-block" value="Send Message">

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


</body>
</html>	