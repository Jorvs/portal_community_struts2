<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <header>

        <nav class="navbar bg-dark navbar-dark navbar-expand-md fixed-top"  > <!-- bg-dark navbar-dark  --> 
            <div class="container-fluid"> 
          <!-- paste  the button here of you want it on the appear on the right --> 
          <a href="#" class="navbar-brand">Community Portal</a> 
          <button class="navbar-toggler" type="button" data-toggle="collapse" 
          data-target="#myTogglerNav" aria-controls="myTogglerNav" aria-expanded="false" aria-label="Toggle navigation"> 
          <span class="navbar-toggler-icon" ></span> 
          </button> 
          <!-- paste the button here of you want it on the appear on the left --> 
        
        
        <div class="navbar-nav  collapse navbar-collapse" id="myTogglerNav">    <!-- ml-sm-auto  if want to align it to right   --> 
        
        
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
                  <div class="col dropdown">   <!-- this div is for drop down menu "dropdown-toogle" allows it --> 
                    <a class="nav-item nav-link dropdown-toggle "  data-toggle="dropdown" id="servicesDropdown" aria-haspopup="true" aria-expanded="false" href="#">Sign Up</a> <!-- there is no addres link so that the drop down would work --> 
                    <!-- the drop down menus goes down here --> 
                       <div   class="dropdown-menu" aria-labelledby="servicesDropdown"> 
                          <a class="dropdown-item" href="register.jsp">Sign Up</a> 
                          
                       </div> 
                   </div>  
        
                <!-- ///////////////////////search form////////////////////// -->
               <div >
                 
               </div>
        
            </div>   <!-- end of div for moving the menu to the left -->
        
        </div> <!-- end of navbar --> 
        
        </div><!-- end of container div --> 
        
        </nav> <!-- end of navigation --> 
        
        
        </header>