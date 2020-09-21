package com.community.actions.useractions.standardactions.accountmanagement;

import com.community.bean.usersbean.ResetPasswordBean;
import com.community.dao.usersdao.standardao.UserMgmtDao;
import com.community.sendemails.SendEmail;
import com.google.protobuf.Type;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.inject.EarlyInitializable;
import com.opensymphony.xwork2.validator.annotations.EmailValidator;
import com.opensymphony.xwork2.validator.annotations.ValidationParameter;

import org.apache.struts2.ServletActionContext;


public class AccountActivateAction extends ActionSupport {
    
    String email_Address;
    String code;
    String errormessage;

    String statusCode;
   

    



    public String execute() throws Exception {

        String   email_to_check_if_verified =   (String)ServletActionContext.getRequest().getSession().getAttribute("email_if_activated");
        System.out.println( "AccountActivate = " + email_to_check_if_verified);
        ResetPasswordBean emailcodebean = new ResetPasswordBean(email_to_check_if_verified,code);

        boolean checkIfEmailCodeMatch = UserMgmtDao.checkIfEmailAndCodeMatches(emailcodebean);
        System.out.println("true if the code and email matches = "   +  checkIfEmailCodeMatch);


        if(checkIfEmailCodeMatch){
            System.out.println("The Email and code matches");
            statusCode = "accountactivated";
            int changestatus = UserMgmtDao.changeVerficationStatus(email_to_check_if_verified);
            System.out.println("1 if successfuly change " + changestatus);

        }else{

            errormessage = "wrong code was entered please check and try again";
            statusCode = "input";

        }


        
        
    
       
        
        return statusCode;



       
    }// end of exucute
    


        

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
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
		

		if(code.equals("")) {
            addFieldError("code", "code address is required");
        }
        
		
		
	}// end of validate



}// end of AccountActivate
