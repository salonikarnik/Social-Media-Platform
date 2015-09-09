<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html class="full" lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>Social Media Platform-Registration</title>
<link href="css/bootstrap.css" rel="stylesheet" type="text/css">
<link href="css/bootstrap-theme.css" rel="stylesheet" type="text/css">
<link href="simpleStyle.css" rel="stylesheet" type="text/css">
<link rel = "web page icon" href = "logo.png" type = "image/png">
<!-- <script src="countries.js"></script> -->
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
							  	<h3 style="font-weight:bold">Registration Form</h3>
							</div>
							<form class="form-horizontal">
								  <div class="form-group">
								    <label for="inputFname" class="col-sm-2 control-label">First Name</label>
								    <div class="col-sm-10">
								      <input type="text" class="form-control" id="inputFname" placeholder="First Name" required='required'>
								    </div>
								  </div>
								  <div class="form-group">
								    <label for="inputLname" class="col-sm-2 control-label">Last Name</label>
								    <div class="col-sm-10">
								      <input type="text" class="form-control" id="inputLname" placeholder="Last Name" required='required'>
								    </div>
								  </div>
								  <div class="form-group">
								    <label for="inputEmail7" class="col-sm-2 control-label">Email</label>
								    <div class="col-sm-10">
    								 	<div class="input-group">
    										<span class="input-group-addon"><span class="glyphicon glyphicon-user"></span></span>								    
								     		<input type="email" class="form-control" id="inputEmail7" placeholder="Email" required='required'>
								     	</div>
								     	
								    </div>
								  </div>
								  <div class="form-group">
								    <label for="inputPassword7" class="col-sm-2 control-label">Password</label>
								    <div class="col-sm-10">
    									<div class="input-group">
    										<span class="input-group-addon"><span class="glyphicon glyphicon-star"></span></span>								    
								      		<input type="password" class="form-control" id="inputPassword7" name='inputPassword7' minlength="6" placeholder="Password" required='required'>
								      	</div>	
								    </div>
								  </div>
								  <div class="form-group">
								    <label for="inputPassword8" class="col-sm-2 control-label">Confirm Password</label>
								    <div class="col-sm-10">
    									<div class="input-group">
    										<span class="input-group-addon"><span class="glyphicon glyphicon-star"></span></span>								    
								      		<input type="password" class="form-control" id="inputPassword8" name='inputPassword8' placeholder="Password" required='required'>
								      	</div>	
								    </div>
								  </div>	
								  <div class="form-group">
								    <label for="inputGender" class="col-sm-2 control-label">Gender</label>
								    <div class="col-sm-10">
										<label class="radio-inline">
										  	<input type="radio" name="inlineRadioOptions" id="inlineRadio1" value="option1" checked> Male
										</label>
										<label class="radio-inline">
										  	<input type="radio" name="inlineRadioOptions" id="inlineRadio2" value="option2"> Female
										</label>
								    </div>
								  </div>
								  <div class="form-group">
								    <label for="inputDOB" class="col-sm-2 control-label">Birth Date</label>
								    <div class="col-sm-10">
								      <input type="date" class="form-control" id="inputDOB" required='required'>
								    </div>
								  </div>								  								  							  
								  <div class="form-group">
								    <label for="inputAdress" class="col-sm-2 control-label">Address</label>
								    <div class="col-sm-10">
								      <input type="text" class="form-control" id="inputAdress" placeholder="Address" required='required'>
								    </div>
								  </div>								  
								  <div class="form-group">
								    <label for="inputCountry" class="col-sm-2 control-label">Country</label>
								    <div class="col-sm-10">
								      	<select class="form-control" id="inputCountry" required>
										  <option value="">Select Country</option>
										  <option value="saab">United States</option>
										  <option value="mercedes">India</option>
										  <option value="audi">Canada</option>
										  <option value="mercedes">United Kingdom</option>
										  <option value="audi">China</option>										  
										</select>
								    </div>
								  </div>
								  <div class="form-group">
								    <label for="inputState" class="col-sm-2 control-label">State</label>
								    <div class="col-sm-10">
								      <input type="text" class="form-control" id="inputState" placeholder="State" required='required'>
								    </div>
								  </div>								  
								  <div class="form-group">
								    <label for="inputCity" class="col-sm-2 control-label">City</label>
								    <div class="col-sm-10">
								      <input type="text" class="form-control" id="inputCity" placeholder="City" required='required'>
								    </div>
								  </div>								  
								  <div class="form-group">
								    <label for="inputZip" class="col-sm-2 control-label">Zip Code</label>
								    <div class="col-sm-10">
								      <input type="number" class="form-control" id="inputZip" placeholder="Zip Code" maxlength="5" required='required'>
								    </div>
								  </div>								  								  								  								  								  								  
								  <div class="form-group">
								    <div class="col-sm-offset-2 col-sm-10">
								      <button type="submit" class='btn btn-primary' id='submit'>Sign in</button>
								      <button type="submit" class='btn btn-success' id='login'>Back to Login</button>
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
        <script src="simpleJS.js"></script>
    </body>
</html>