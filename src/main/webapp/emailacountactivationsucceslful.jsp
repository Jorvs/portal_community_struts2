<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>

<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="https://fonts.googleapis.com/css?family=Roboto:400,700" rel="stylesheet">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<title>Account activatio succesful page</title>



<!-- Latest compiled and minified CSS -->
<!-- Latest compiled and minified CSS -->
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

<style type="text/css">
	body{
		color: #fff;
		background: #63738a;
		font-family: 'Roboto', sans-serif;
		padding-top: 70px;
		padding-bottom: 140px;
	}
    
	
    	
	.signup-form{
		width: 600px;
		margin: 0 auto;
		padding: 40px 0;
	}

	.errorMessage {
		color: red;
		font-size: 0.8em;
		/* text-align: left; */
		
		
	}
	
    
    .signup-form form{
		color: #999;
		border-radius: 3px;
    	margin-bottom: 25px;
        background: #f2f3f7;
        box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
        padding: 30px;
    }
	
	
	
	   	
    .signup-form a{
		color: #fff;
		text-decoration: underline;
	}
    .signup-form a:hover{
		text-decoration: none;
	}
	.signup-form form a{
		color: #5cb85c;
		text-decoration: none;
	}	
	.signup-form form a:hover{
		text-decoration: underline;
	}  


</style>

</head> 







<body>
	
	
		<!-- this is the header which contains the navigation bar  and header tag -->
		<%@ include file="userheader.jsp" %>

	 	
	






						<!-- ////////////////////////////////// -->
<div class="signup-form container" >

	<h2 ></h2>

	
       

    <s:form   cssClass="mx-auto mt-4" method="POST">
		<span style="color: red;" ><s:property  value="errormessage" /></span>
		<h2>your account was succesfully activated</h2>
		
		
    </s:form>
       
</div>





<!-- this is the footer which contains the navigation bar  and footer tag -->
<jsp:include page="/userfooter.jsp"></jsp:include>

</body>
</html>                            