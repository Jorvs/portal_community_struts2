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
    

    	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS    -->
	<!-- paste thos on the body tag -->
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

<title>Welcome</title>





<s:head/> <!--used for styling the error  -->
<body>


	// header that contains the navbar 
    <%@ include file="userheader.jsp" %>

	<h2>Update Form</h2>
		<s:form		action="updateSaveProfileDataAction" method="post" >
		<s:textfield name="user_id"  label="user_id" type="hidden" ></s:textfield>
		<s:textfield name="email_Address" label="Email/User" ></s:textfield>
		<s:textfield name="first_Name" label="Your First Name" ></s:textfield>
		<s:textfield name="last_Name" label="Your Last Name" ></s:textfield>
		<s:textfield name="midle_Name" label="Your Midle Name" ></s:textfield>
		<s:textfield name="birthday" label="Birthday" placeholder="YYYY-MM-DD" ></s:textfield>
		<s:select 	 name="gender" label="Gender" list="{'Male','Female'}"></s:select>
		<s:textfield name="country" label="Country" ></s:textfield>
		<s:textfield name="city" label="City" ></s:textfield>
		<s:textfield name="contact_no" label="Contact no" ></s:textfield>
		<s:textfield name="address" label="Address" ></s:textfield>

		<s:textfield name="user_company_name" label="Company Name" ></s:textfield>
		<s:textfield name="company_duration_work" label="Duration on worked" ></s:textfield>
		<s:textfield name="position_worked" label="Position on Worked" ></s:textfield>
		<s:textfield name="salary" label="Salary" ></s:textfield>
		<s:textfield name="year_worked" label="Year Worked" ></s:textfield>

		<s:submit   value="Update_User"/>

		<!-- <h2><a href="updatepassword.jsp">Change password</a></h2> -->
		</s:form>
	
		


		

	 <!-- this is the footer link -->
	<jsp:include page="/userfooter.jsp"></jsp:include>

</body>
</html>