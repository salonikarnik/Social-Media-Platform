<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html class="full" lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>Social Media Platform</title>
<link href="css/bootstrap.css" rel="stylesheet" type="text/css">
<link href="css/bootstrap-theme.css" rel="stylesheet" type="text/css">
<link href="simpleStyle.css" rel="stylesheet" type="text/css">
<link rel = "web page icon" href = "logo.png" type = "image/png">
</head>

    <body>
	
		<nav class="navbar navbar-default">
		  <div class="container-fluid">
		    <div class="navbar-header">
		      <a class="navbar-brand" href="login.jsp">
		        <p class='plain_text'>ASA.Logic</p>
		      </a>
		    </div>
		  </div>
		</nav>
		<div class='container'>			
			<p><br/></p>
			<div class="row">
				<div class="col-md-2"></div>
			  	<div class="col-md-8">
			  		<div class="panel panel-default">
					  	<div class="panel-body">
					    	<div class="page-header" style="margin-top:5px">
							  	<h3 style="font-weight:bold">Log In</h3>
							</div>
							<form class="form-horizontal" action="uservalidation" method="post">
								  <div class="form-group">
								    <label for="inputEmail3" class="col-sm-2 control-label">Email</label>
								    <div class="col-sm-10">
    								 	<div class="input-group">
    										<span class="input-group-addon"><span class="glyphicon glyphicon-user"></span></span>								    
								     		<input type="email" class="form-control" id="inputEmail3" placeholder="Email" required='required' name="email">
								     	</div>	
								    </div>
								  </div>
								  <div class="form-group">
								    <label for="inputPassword3" class="col-sm-2 control-label">Password</label>
								    <div class="col-sm-10">
    									<div class="input-group">
    										<span class="input-group-addon"><span class="glyphicon glyphicon-star"></span></span>								    
								      		<input type="password" class="form-control" id="inputPassword3" placeholder="Password" required='required' name="password">
								      	</div>	
								    </div>
								  </div>
								  <div class="form-group">
								    <div class="col-sm-offset-2 col-sm-10">
								      <button type="submit" class='btn btn-primary'>Sign in</button>
								      <h3>New user? click<a href="register.jsp"> here </a> to register!</h3>
								      <!-- <h3>New user?<a href="homepage.jsp"> Click </a>here to register!</h3>  -->
								    </div>
								  </div>
							</form>
					  	</div>
					</div>
			  	</div>
			  	<div class="col-md-2"></div>
			</div>
		</div>
				
        <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
    </body>
</html>