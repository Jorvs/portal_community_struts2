package com.community.actions.useractions.adminactions.accountmanagement;

import com.community.bean.usersbean.User;
import com.community.dao.usersdao.admindao.AdmnUserMgtmtDao;
import com.opensymphony.xwork2.ActionSupport;

public class UpdateUserAction extends ActionSupport {
    
    int  user_id;
    String email_Address;
    String password;
    String first_Name;
    String last_Name;
    String midle_Name;
    String birthday;
    String country;
    String city;
    String contact_no;
    String address;
    String gender;

    public String execute(){

        String statusCode = "";
       

         Object data = retriveUserData();
        

        // if(data != null){
       
              return statusCode = "gotadminupdatepage";

        // }else
        // {
        //     return statusCode = "error_update_registers";
        // }

       
        
        
    }

    public Object retriveUserData() {
       
       
        User user = AdmnUserMgtmtDao.getUserByID(user_id);

        user_id = user.getUser_id();
        email_Address = user.getEmail_Address();
        password = user.getPassword();
        first_Name = user.getFirst_Name();
        last_Name = user.getLast_Name();
        midle_Name = user.getMidle_Name();
        birthday = user.getBirthday();
        gender = user.getGender();
        country = user.getCountry();
        city = user.getCity();
        contact_no = user.getContact_no();
        address = user.getAddress();

        System.out.println(user);
        return user;

     }






    public int getUser_id() {
        return this.user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

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

    public String getFirst_Name() {
        return this.first_Name;
    }

    public void setFirst_Name(String first_Name) {
        this.first_Name = first_Name;
    }

    public String getLast_Name() {
        return this.last_Name;
    }

    public void setLast_Name(String last_Name) {
        this.last_Name = last_Name;
    }

    public String getMidle_Name() {
        return this.midle_Name;
    }

    public void setMidle_Name(String midle_Name) {
        this.midle_Name = midle_Name;
    }

    public String getBirthday() {
        return this.birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getContact_no() {
        return this.contact_no;
    }

    public void setContact_no(String contact_no) {
        this.contact_no = contact_no;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
   

}