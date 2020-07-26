package com.community.actions.useractions.adminactions.accountmanagement;

import com.community.bean.usersbean.LoginInfo;
import com.community.dao.usersdao.standardao.LoginDAO;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{


    

    String email_Address;
    String password;

    
    
    

    public String execute() throws Exception{
        // boolean isUserValid = false;

            String statusCode = "";
           
            LoginInfo userInfo = new LoginInfo(email_Address,password);
            
            
            boolean isUserValid = LoginDAO.isUserValid(userInfo);
            if(isUserValid) 
            {
                statusCode = "loginsuccess";
                System.out.println("tryingss debug mode");
            }else
            {
                statusCode = "input";
            }
            return statusCode;
        }// end of execute function

        public String getEmail_Address() {
            return this.email_Address;
        }
    
        public void setEmail_Address(String email_Address) {
            this.email_Address = email_Address;
        }
    
        public String getPassword() {
            return this.password;
        }
    
        public void setPassword(String password) {
            this.password = password;
        }


public void validate() {
		
		if(email_Address.equals("")) {
			addFieldError("email_Address", "email address  is required");
        }
        
        if(password.equals("")) {
			addFieldError("password", "password is required");
        }
        
        // if(password.length() < 6) {
		// 	addFieldError("password", "password is required");
		// }

    }
    

}// end of LoginFunction