<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="s" uri="/struts-tags" %>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="https://fonts.googleapis.com/css?family=Roboto:400,700" rel="stylesheet">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<title>Succes page</title>
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
		padding-top: 80px;
	}
    .form-control{
		height: 40px;
		box-shadow: none;
		color: #969fa4;
	}
	.form-control:focus{
		border-color: #5cb85c;
	}
    .form-control, .btn{        
        border-radius: 3px;
    }
	.welcome-form{
		width: 400px;
		margin: 0 auto;
		padding: 30px 0;
	}
	.welcome-form h2{
		color: #636363;
        margin: 0 0 15px;
		position: relative;
		text-align: center;
    }
	.welcome-form h2:before, .signup-form h2:after{
		content: "";
		height: 2px;
		width: 30%;
		background: #d4d4d4;
		position: absolute;
		top: 50%;
		z-index: 2;
	}	
	.welcome-form h2:before{
		left: 0;
	}
	.welcome-form h2:after{
		right: 0;
	}
    .welcome-form .hint-text{
		color: #999;
		margin-bottom: 30px;
		text-align: center;
	}
    .welcome-form form{
		color: #999;
		border-radius: 3px;
    	margin-bottom: 15px;
        background: #f2f3f7;
        box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
        padding: 30px;
    }
	.welcome-form .form-group{
		margin-bottom: 20px;
	}
	.welcome-form input[type="checkbox"]{
		margin-top: 3px;
	}
	.welcome-form .btn{        
        font-size: 16px;
        font-weight: bold;		
		min-width: 140px;
        outline: none !important;
    }
	.welcome-form .row div:first-child{
		padding-right: 10px;
	}
	.welcome-form .row div:last-child{
		padding-left: 10px;
	}    	
    .welcome-form a{
		color: #fff;
		text-decoration: underline;
	}
    .welcome-form a:hover{
		text-decoration: none;
	}
	.welcome-form form a{
		color: #5cb85c;
		text-decoration: none;
	}	
	.welcome-form form a:hover{
		text-decoration: underline;
	}  
</style>
</head>
<body>

	<!-- this is the header which contains the navigation bar  and header tag -->
	<%@ include file="userheader.jsp" %>


<div class="welcome-form">
    <form action="/examples/actions/confirmation.php" method="post">
        
	
        <div class="form-group">
			
			<h2> Registration was succesful the email was sent to your email addres</h2>

        </div>
       
    </form>
	
</div>

		<!-- this is the footer which contains the navigation bar  and footer tag -->
<jsp:include page="/userfooter.jsp"></jsp:include>

</body>
</html>                            