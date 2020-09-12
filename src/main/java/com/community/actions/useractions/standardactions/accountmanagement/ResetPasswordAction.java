package com.community.actions.useractions.standardactions.accountmanagement;

import com.community.bean.usersbean.ResetPasswordBean;
import com.community.dao.usersdao.standardao.ResetPassWordDao;

public class ResetPasswordAction {
    
    String email_Address;
    String statusCode;



    public String execute() throws Exception {
        // need a contructor on registerinfo with this variables
   
        // bean
        ResetPasswordBean reset_email = new ResetPasswordBean(email_Address);

        // checks if user exist
        boolean isUserExist = ResetPassWordDao.CheckEmailExist(reset_email);


        // checking if there is result if the email exist
        if(isUserExist) 
        {       
            // if the user email exist send the email to his email
            System.out.println("email was sent to your email");
            return  statusCode = "resetpasswordsent";
        }else
        {
           // if the user does not exist user does not exist 
           System.out.println("The email does not exist");
            return  statusCode = "input";
        }
    


        
}



    public String getEmail_Address() {
        return this.email_Address;
    }

    public void setEmail_Address(String email_Address) {
        this.email_Address = email_Address;
    }



}
