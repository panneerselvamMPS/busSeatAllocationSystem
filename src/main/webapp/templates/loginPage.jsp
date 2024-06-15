<html ng-app="myApp">

<head>
<link rel="stylesheet" href="css/stylesheet.css">
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular.min.js"></script>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa" crossorigin="anonymous"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<script src="js/singleBusRegistrationController.js"></script>
<script src="js/loginPageController.js"></script>
<script src="js/loginPageValuesController.js"></script>
<script src="js/HomeController.js"></script>
</head>

<body>
  <div data-ng-controller="HomeController">
	<div class="container-fluid mt-3 bg-dark"> 
		 <div class="d-flex justify-content-center">
		 </div>
	</div>
	
	<div class="container-fluid mt-3 bg-info">
	   <div class="btn-group-lg">
	    <label class="btn btn-info" >Welcome to Bus Reservation</label>
	   </div>
    </div>
    
  <br>
  <jsp:include page="loginPageValues.jsp" />
  <!-- <div class="container-fluid mt-3">
  	<div class="tab-content">
		<div class="tab-pane fade">
			
		</div>
    </div>
  </div> -->
</div>    
</body>

</html>