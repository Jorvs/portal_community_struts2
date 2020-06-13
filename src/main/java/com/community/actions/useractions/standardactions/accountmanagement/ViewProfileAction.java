package com.community.actions.useractions.standardactions.accountmanagement;

import com.community.bean.usersbean.User;
import com.community.dao.usersdao.standardao.UserMgmtDao;

import org.apache.struts2.ServletActionContext;

public class ViewProfileAction {



    int user_id;

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
    
    int user_id_session;
   
    
    public String execute(){

        
        retriveProfileData();   // retrives the data of the profile of the user that is logon



             String statusCode = "viewprofile";
        
        return statusCode;

    }// end of execute


    public Object retriveProfileData(){

        // gets the user_id from the ssession 
        user_id_session =   (int)ServletActionContext.getRequest().getSession().getAttribute("login_user");


        //  recives the user_id and retrives the profile date of the user login
        User user_data = UserMgmtDao.getProfileDataById(user_id_session);

        user_id = user_data.getUser_id();
        email_Address = user_data.getEmail_Address();
        password = user_data.getPassword();
        first_Name = user_data.getFirst_Name();
        last_Name = user_data.getLast_Name();
        midle_Name = user_data.getMidle_Name();
        birthday = user_data.getBirthday();
        gender = user_data.getGender();
        country = user_data.getCountry();
        city = user_data.getCity();
        contact_no = user_data.getContact_no();
        address = user_data.getAddress();

        return user_data;


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