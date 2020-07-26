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
<title>Registration Users</title>



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
        <%@ include file="/userheader.jsp" %>






<div class="row" >
	<div class="signup-form container" >

	<article class="col-sm-6"> 

		<h2 >Registration Form</h2>

		
			<s:form	 class="signup-form form"	action="jobSearchResult" method="post" >
			<s:textfield  name="search_jobs" label="Search Jobs" type="search" placeholder="Can be left blank"></s:textfield>
			<s:select name="job_title" label="Job Title" list="{'Front End','Back End','Full stack'}" ></s:select>
			<s:select name="job_description" label="Job Description" list="{'Full time','Part time'}" ></s:select>
			<s:select name="type_of_work" label="type of work" list="{'On site','Remote'}" ></s:select>
			<s:select name="qualifications" label="Qualification" list="{'bachelor','boot camp certicate','masteral'}" ></s:select>
			
			<s:submit  type="button" value="Find Jobs"/>
			</s:form>
	</article> 		

	
	
	</div>	<!-- row -->

	<article class="col-sm-6"> 
		<h3>Search Job Results</h3> 
		<table width="1000" class="userTable" align="center" >
			<thead>
				<tr>
					<th>Job Title</th>
					<th>Job Description</th>
					<th>Job Salary</th>
					<th>Type of Work</th>
					<th colspan="2" >Actions</th>
				</tr>
			</thead>
			<s:iterator value="jobs" var="job" >
			<tr>
				<td> <s:property value="#job.job_information_id"/> </td>
				<td> <s:property value="#job.job_description"/></td>
				<td> <s:property value="#job.job_title"/></td>
				<td> <s:property value="#job.job_salary"/></td>
				<td> <s:property value="#job.type_of_work"/></td>
				<td> <a href="viewJobAction?job_information_id=<s:property value="#user.user_id" />"><button>show more</button></a></td>
				
			</tr>
			</s:iterator>
		</table>
	   </article>

</div>








<!-- this is the footer which contains the navigation bar  and footer tag -->
<%@ include file="/userfooter.jsp" %>

</body>
</html>                            