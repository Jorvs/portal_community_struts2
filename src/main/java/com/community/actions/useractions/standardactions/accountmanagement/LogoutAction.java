package com.community.actions.useractions.standardactions.accountmanagement;

import com.opensymphony.xwork2.ActionSupport;

import org.apache.struts2.ServletActionContext;

public class LogoutAction extends ActionSupport {
    



    String statusCode;

    public String execute(){

        ServletActionContext.getRequest().getSession().invalidate();

        return  statusCode = "killsession";
    }


}// end of LogOutAction