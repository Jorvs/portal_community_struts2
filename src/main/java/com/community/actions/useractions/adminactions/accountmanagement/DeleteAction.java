package com.community.actions.useractions.adminactions.accountmanagement;

import com.community.dao.usersdao.admindao.AdmnUserMgtmtDao;
import com.opensymphony.xwork2.ActionSupport;

public class DeleteAction extends ActionSupport{

   int user_id;
   
   String message = "";
   String statuscode;
    public String execute(){

        
        System.out.println(user_id);
        int recDeleted = AdmnUserMgtmtDao.deleteUser(user_id);
        if(recDeleted == 1)
        {
            return statuscode = "deletesuccess";
        }
        else
        {
            message = "cant delete user with data from other table for data security and constraints";
            return statuscode = "errorsuccess";
        }



       

    }// end of execute


    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }





    public int getUser_id() {
        return this.user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }


}// end of deleteAction