package com.community.bean.usersbean;

public class ResetPasswordBean {


    String email_Address;


    public ResetPasswordBean(String email_Address){

        this.email_Address = email_Address;

    }



    public String getEmail_Address() {
        return this.email_Address;
    }

    public void setEmail_Address(String email_Address) {
        this.email_Address = email_Address;
    }
    
    
}
