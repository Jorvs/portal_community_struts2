<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Form</title>
<s:head/> <!--used for styling the error  -->
<body>
<div align="center">
    <h2>Login</h2>
        <s:form		action="loginAction" class="LoginForm" >
        <s:textfield name="email_Address" label="Email/User Name" class="formTextField"></s:textfield>
        <s:textfield name="password" label="Password" type="password" class="formTextField" ></s:textfield>
        <s:submit value="Login" class="actionBtn"/>
        </s:form>
        <h2><a href="register.jsp">Signup</a></h2>
</div>
</body>
</html>