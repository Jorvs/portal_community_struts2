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
<title>Search Users</title>



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
		padding-top: 100px;
		padding-bottom: 140px;
	}
    
	
    	
	.design-form{
		width: 600px;
		margin: 0 auto;
		padding: 40px 0;
	}

	
	
    
    .design-form form{
		color: #999;
		border-radius: 3px;
    	margin-bottom: 25px;
        background: #f2f3f7;
        box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
        padding: 30px;
    }
	
	
	
	   	
    .design-form a{
		color: #fff;
		text-decoration: underline;
	}
    .design-form a:hover{
		text-decoration: none;
	}
	.design-form form a{
		color: #5cb85c;
		text-decoration: none;
	}	
	.design-form form a:hover{
		text-decoration: underline;
	}  


</style>

</head> 



<body>
	
	



		<!-- this is the header which contains the navigation bar  and header tag -->
		<%@ include file="userheader.jsp" %>
	 
						<!-- /////////////////////////////////////////// -->


				

				<div class="design-form">
					
					<table width="1000" class="userTable" align="center" >
						<thead>
							<tr>
								<th>Email Address</th>
								<th>First Name</th>
								<th>Last Name</th>
								<th colspan="2" >Actions</th>
							</tr>
						</thead>
						<s:iterator value="users" var="user" >
							<tr>
								<td> <s:property value="#user.email_Address"/></td>
								<td> <s:property value="#user.first_Name"/></td>
								<td> <s:property value="#user.last_Name"/></td>
								<td> <a href="viewOtherUserAction?user_id=<s:property value="#user.user_id" />"><button>View profle</button></a></td>
							</tr>	
						</s:iterator>
					</table>
						
						<div class="form-group">
							<!-- <div class="row">
								<div class="col-xs-6"><input type="text" class="form-control" name="first_name" placeholder="First Name" required="required"></div>
								<div class="col-xs-6"><input type="text" class="form-control" name="last_name" placeholder="Last Name" required="required"></div>
							</div>        	 -->
						</div>
					   
					
					
				</div>





						<!-- ////////////////////////////////// -->
<div class="signup-form container" >

	
</div>





<!-- this is the footer which contains the navigation bar  and footer tag -->
<jsp:include page="/userfooter.jsp"></jsp:include>

</body>
</html>                            