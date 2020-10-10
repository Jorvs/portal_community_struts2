package com.community.actions.useractions.standardactions.accountmanagement;

import com.community.dao.usersdao.standardao.UserMgmtDao;
import com.opensymphony.xwork2.ActionSupport;

import org.apache.struts2.ServletActionContext;

public class UpdateSavePasswordAction extends ActionSupport{
    

    String statusCode;
    String errormessage;
    String password;

    public String execute() throws Exception{
        // boolean isUserValid = false;
       
            //bean for passwrokd reset
            String   user_id_from_session =   (String)ServletActionContext.getRequest().getSession().getAttribute("login_user");
           
             int updated_password = UserMgmtDao.updaterUserPassword(user_id_from_session, password);
             System.out.println("the pass transfered from action = " + password);


                
                if(updated_password == 1) 
                {       
               
                   
                    
                    
                    // kill the session
                    ServletActionContext.getRequest().getSession().invalidate();
                    
                  



                 System.out.println("password was updated maunaly");
                
                    return  statusCode = "changepasssuccess";
                }else
                {
                    errormessage = "Invalid password";
                    return  statusCode = "input";
                }

             
            
        }// end of execute function


        


        





    public String getStatusCode() {
        return this.statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getErrormessage() {
        return this.errormessage;
    }

    public void setErrormessage(String errormessage) {
        this.errormessage = errormessage;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }




    @Override
    public String toString() {
        return "{" +
            " statusCode='" + getStatusCode() + "'" +
            ", errormessage='" + getErrormessage() + "'" +
            ", password='" + getPassword() + "'" +
            "}";
    }




        
        


    





   






public void validate() {
		
		
        
        if(password.equals("")) {
			addFieldError("password", "password is required");
        }
        
        // if(password.length() < 6) {
		// 	addFieldError("password", "password is required");
		// }

    }




}
