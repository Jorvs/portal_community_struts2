<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Form</title>
<s:head/> <!--used for styling the error  -->
<body>

<h2>Update Form</h2>
	<s:form		action="updateAction" method="post" >
	<s:textfield name="user_id"  label="user_id" type="hidden" ></s:textfield>
	<s:textfield name="email_Address" label="Email/User" ></s:textfield>
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
	<s:submit   value="Update_User"/>
	</s:form>

</body>
</html>