<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Form</title>
<s:head/> <!--used for styling the error  -->
<body>

<h2>Registration Form</h2>
	<s:form		action="registerUserAction" method="post" >
	<s:textfield name="email_Address" label="Email/User Name" ></s:textfield>
	<s:textfield name="password" label="Password" type="password" ></s:textfield>
	<s:textfield name="first_Name" label="Your First Name" ></s:textfield>
	<s:textfield name="last_Name" label="Your Last Name" ></s:textfield>
	<s:textfield name="midle_Name" label="Your Midle Name" ></s:textfield>
	<s:textfield name="birthday" label="Birthday" placeholder="YYYY-MM-DD" ></s:textfield>
	<s:select 	 name="gender" label="Gender" list="{'Male','Female'}"></s:select>
	<s:textfield name="country" label="Country" ></s:textfield>
	<s:textfield name="city" label="City" ></s:textfield>
	<s:textfield name="contact_no" label="Contact no" ></s:textfield>
	<s:textfield name="address" label="Address" ></s:textfield>
	<s:submit value="Register User"/>
	</s:form>

</body>
</html>