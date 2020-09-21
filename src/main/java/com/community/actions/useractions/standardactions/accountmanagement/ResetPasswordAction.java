package com.community.actions.useractions.standardactions.accountmanagement;

import com.community.bean.usersbean.ResetPasswordBean;
import com.community.dao.usersdao.standardao.UserMgmtDao;
import com.community.sendemails.SendEmail;
import com.google.protobuf.Type;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.inject.EarlyInitializable;
import com.opensymphony.xwork2.validator.annotations.EmailValidator;
import com.opensymphony.xwork2.validator.annotations.ValidationParameter;


public class ResetPasswordAction extends ActionSupport {
    
    String email_Address;
    String statusCode;
    String errormessage;

    // String fromEmail;
    // String emailpassword;



    public String execute() throws Exception {
        
        System.out.println("the reset password action was executed");
   
        // bean for holding the email where to send the reset password
        ResetPasswordBean reset_email = new ResetPasswordBean(email_Address);

        // used for sending the mail to the email
        SendEmail sndmail =  new SendEmail();
        String  code = sndmail.generateCode();

       
        // checks if user exist
        boolean isUserExist = UserMgmtDao.CheckEmailExist(reset_email);
      

        // checking if there is result if the email exist
        if(isUserExist) 
        {       
            // if the user email exist send the email to his email
            System.out.println("email is going to be sent to: " + reset_email );
            sndmail.sendEmailForReset(reset_email);
            return  statusCode = "resetpasswordsent";
        }else
        {
           // if the user does not exist user does not exist 
           System.out.println("The email does not exist");
           errormessage = "this email does not exist";
            return  statusCode = "input";
        }
    


        
}



    public String getEmail_Address() {
        return this.email_Address;
    }

    public void setEmail_Address(String email_Address) {
        this.email_Address = email_Address;
    }


    public String getErrormessage() {
        return this.errormessage;
    }

    public void setErrormessage(String errormessage) {
        this.errormessage = errormessage;
    }




    public void validate() {
		

		if(email_Address.equals("")) {
            addFieldError("email_Address", "email address is required");
        }
        
		
		
	}// end of validate



}// end of ResetPasswordAction
