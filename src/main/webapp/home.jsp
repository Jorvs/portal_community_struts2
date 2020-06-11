<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>


<html>
<head>

<!-- Required meta tags  paste this on the header tag-->
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

	<!-- Bootstrap CSS   paste this on the head tag  -->
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

<title>Welcome</title>
</head>
<body>
	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS    -->
	<!-- paste thos on the body tag -->
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

<!-- ///////////////////////////////code for the page is below///////////////////////////////// -->






				<!-- ////////////////////// navaigation bar ////////////////////////// -->
 <nav class="navbar bg-dark navbar-dark navbar-expand-md fixed-top"  > <!-- bg-dark navbar-dark  --> 
	 <div class="container"> 
   <!-- paste  the button here of you want it on the appear on the right --> 
   <a href="#" class="navbar-brand">Community Portal</a> 
   <button class="navbar-toggler" type="button" data-toggle="collapse" 
   data-target="#myTogglerNav" aria-controls="myTogglerNav" aria-expanded="false" aria-label="Toggle navigation"> 
   <span class="navbar-toggler-icon" ></span> 
   </button> 
   <!-- paste the button here of you want it on the appear on the left --> 
 
 
 <div class="navbar-nav   collapse navbar-collapse" id="myTogglerNav">    <!-- ml-sm-auto  if want to align it to right   --> 
 
 
	<div class="navbar-nav ml-sm-auto">  <!-- div for moving the menu options to the left --> 
		 <!-- the drop down menus goes down here for api/ frame work courses --> 
		<div class="dropdown">   <!-- this div is for drop down menu "dropdown-toogle" allows it --> 
			  <a class="nav-item nav-link  dropdown-toggle "  data-toggle="dropdown" id="servicesDropdown" aria-haspopup="true" aria-expanded="false"  href="#">Jobs/ carrier</a> <!-- there is no addres link so that the drop down would work --> 
			  <div   class="dropdown-menu" aria-labelledby="servicesDropdown"> 
				   <a class="dropdown-item" href="links here">find work</a> 
				   <a class="dropdown-item" href="links here">post work</a> 
 
		  </div> 
	   </div> 
		   <!-- the drop down menus goes down here for computer language work courses --> 
	   <div class="dropdown">   <!-- this div is for drop down menu "dropdown-toogle" allows it --> 
		 <a class="nav-item nav-link  dropdown-toggle "  data-toggle="dropdown" id="servicesDropdown" aria-haspopup="true" aria-expanded="false" href="#">Profile</a> <!-- there is no addres link so that the drop down would work --> 
		 <!-- the drop down menus goes down here --> 
			<div   class="dropdown-menu" aria-labelledby="servicesDropdown"> 
			   <a class="dropdown-item" href="/profile.jsp">Profile</a> 
			   <a class="dropdown-item" href="/update.jsp">Update Profile</a> 
			   <a class="dropdown-item" href="links here">account settings</a> 
			</div> 
		</div> 

		<div>
		 <form class="form-inline" > 
	  <input class="form-control mr-2" type="search" placeholder="Search" > <!-- mr-2 psuhes the btn by 2 for spacing  --> 
		   <button class="btn btn-outline-light" type="submit" >Go</button> 
	  </form> <!-- this adds search bar and btn -->    
		</div><!-- end the div navbar -->


	</div>   <!-- end of div for moving the menu to the left -->
 
   </div> <!-- end of navbar --> 
 
 </div><!-- end of container div --> 
 
</nav> <!-- end of navigation --> 




				<!-- ////////////////////////////////////// -->
<h2>Welcome</h2>
	 <!-- <s:label value="first Name" />
	<s:property value="first_Name"/><br/>
	
	<s:label value="Last Name" />
	<s:property value="last_Name"/><br/>  -->

	<h1>this is the for home where new feed goes<h1>

	
	
<footer>
	b4-foo

</footer>


</body>
</html>