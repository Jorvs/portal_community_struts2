package com.community.bean.usersbean;

public class ResetPasswordBean {
    


    String email_Address;
    String code;

   

   


    public ResetPasswordBean(String email_Address){

        this.email_Address = email_Address;

    }

    // public ResetPasswordBean(String code){

        
    //     this.code = code;

    // }

  

    public ResetPasswordBean(String email_Address,String code){

        this.email_Address = email_Address;

        this.code = code;

    }








    public String getEmail_Address() {
        return this.email_Address;
    }

    public void setEmail_Address(String email_Address) {
        this.email_Address = email_Address;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    
    



    @Override
    public String toString() {
        return "{" +
            " email_Address='" + getEmail_Address() + "'" +
            ", code='" + getCode() + "'" +
            "}";
    }




}// end or ResetPasswordBean
