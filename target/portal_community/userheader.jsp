<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="s" uri="/struts-tags" %>

 
<%
if(session.getAttribute("login_user") == null)
{
  response.sendRedirect("login.jsp");
}
%>
<header>
 
  

<nav class="navbar bg-dark navbar-dark navbar-expand-md fixed-top"  > <!-- bg-dark navbar-dark  --> 
    <div class="container-fluid"> 
  <!-- paste  the button here of you want it on the appear on the right --> 
  <a href="#" class="navbar-brand">Community Portal</a> 

      <h1>Welcome  <s:property value="user_id_session" /> </h1>

  <button class="navbar-toggler" type="button" data-toggle="collapse" 
  data-target="#myTogglerNav" aria-controls="myTogglerNav" aria-expanded="false" aria-label="Toggle navigation"> 
  <span class="navbar-toggler-icon" ></span> 
  </button> 
  <!-- paste the button here of you want it on the appear on the left --> 


<div class="navbar-nav  collapse navbar-collapse " id="myTogglerNav">    <!-- ml-sm-auto  if want to align it to right   --> 


   <div class="row row-cols-3 navbar-nav ml-sm-auto">  <!-- div for moving the menu options to the left --> 
        <!-- the drop down menus goes down here for api/ frame work courses --> 
       <div class="col dropdown">   <!-- this div is for drop down menu "dropdown-toogle" allows it --> 
             <a class="nav-item nav-link  dropdown-toggle "  data-toggle="dropdown" id="servicesDropdown" aria-haspopup="true" aria-expanded="false" href="#">Jobs/ carrier</a> <!-- there is no addres link so that the drop down would work --> 
         <div   class="dropdown-menu" aria-labelledby="servicesDropdown"> 
                  <a class="dropdown-item" href="links here">find work</a> 
                  <a class="dropdown-item" href="links here">post work</a> 

         </div> 
      </div> 
          <!-- the drop down menus goes down here for computer language work courses --> 
      <div class="col dropdown">   <!-- this div is for drop down menu "dropdown-toogle" allows it --> 
        <a class="nav-item nav-link dropdown-toggle "  data-toggle="dropdown" id="servicesDropdown" aria-haspopup="true" aria-expanded="false" href="#">Profile</a> <!-- there is no addres link so that the drop down would work --> 
        <!-- the drop down menus goes down here --> 
           <div   class="dropdown-menu" aria-labelledby="servicesDropdown"> 
              <a class="dropdown-item" href="profile.jsp">Profile</a> 
              <a class="dropdown-item" href="update.jsp">Update Profile</a> 
              <a class="dropdown-item" href="links here">Account Settings</a> 
              <a class="dropdown-item" href="login.jsp">Logout</a> 
           </div> 
       </div>  

        <!-- ///////////////////////search form////////////////////// -->
       <div class="col"  >
         <s:form class="form-inline" action="searchUserAction" method="post"> 
         <s:textfield class="form-control mr-2 " name="search_name" type="search" placeholder="Search"></s:textfield> <!-- mr-2 psuhes the btn by 2 for spacing  --> 
         <s:submit class="btn btn-outline-light" type="button" value="Go" >Search</s:submit> 
         </s:form> <!-- this adds search bar and btn -->    
       </div>

    </div>   <!-- end of div for moving the menu to the left -->

</div> <!-- end of navbar --> 

</div><!-- end of container div --> 

</nav> <!-- end of navigation --> 


</header>


