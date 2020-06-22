package com.community.actions.useractions.standardactions.accountmanagement;

import com.community.bean.usersbean.User;
import com.community.dao.usersdao.standardao.UserMgmtDao;

import org.apache.struts2.ServletActionContext;

public class UpdateSaveProfileDataAction {

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

    // diffetned table data
    String user_company_name;
    String company_duration_work;
    String position_worked;
    String year_worked;
    String salary;

    int user_id_session;

    public String execute(){

        String statuscode;
        // saveProfileDataForUpdate();

        user_id_session =   (int)ServletActionContext.getRequest().getSession().getAttribute("login_user");

        User userinfo = new User (  email_Address,password,
                                    first_Name,last_Name,midle_Name,
                                    birthday,country,city,contact_no,address,gender,
                                    user_company_name,company_duration_work,position_worked,year_worked,salary);
        
        

        System.out.println("execute email = " + email_Address);
        System.out.println("execute first name = " + first_Name);
        System.out.println("execute lastname = " + last_Name);
        System.out.println("execute midlename = " + midle_Name);
        System.out.println("execute birthday = " +birthday);
        System.out.println("execute gender = " + gender);
        System.out.println("execute country = " +country);
        System.out.println("execute city = " + city);
        System.out.println("execute contact = " +contact_no);
        System.out.println("execute address = " +address);

        
        


        int recInserted = UserMgmtDao.updateUserProfileData(userinfo, user_id_session);
        if(recInserted == 1)
        {
			System.out.println("The profile was updated in execute");
            return  statuscode = "saveupdateprofiledata";
        }
        else
        {
			
			return statuscode = "error";
        }
       
        


         
        
      

    }// end of execute


    // public Object saveProfileDataForUpdate(){

    //     // gets the user_id from the ssession 
    //     user_id_session =   (int)ServletActionContext.getRequest().getSession().getAttribute("login_user");

    //     User userinfo = new User();

    //      //  updates the te data if there is a result or 1 it is successful
    //     int  user_data_successfuly_added = UserMgmtDao.updateUserProfileData(user_id_session);


    //     if(user_data_successfuly_added > 0){
    //     System.out.println("The  profile data has been updated");
    //     }

    //     // user_id =  userinfo.getUser_id();
    //     // email_Address =  userinfo.getEmail_Address();
    //     // password =  userinfo.getPassword();
    //     // first_Name =  userinfo.getFirst_Name();
    //     // last_Name =  userinfo.getLast_Name();
    //     // midle_Name =  userinfo.getMidle_Name();
    //     // birthday =  userinfo.getBirthday();
    //     // gender =  userinfo.getGender();
    //     // country =  userinfo.getCountry();
    //     // city =  userinfo.getCity();
    //     // contact_no =  userinfo.getContact_no();
    //     // address =  userinfo.getAddress();

    //     userinfo.setUser_id(user_id);
    //     userinfo.setEmail_Address(email_Address);
    //     userinfo.setPassword(password);
    //     userinfo.setFirst_Name(first_Name);
    //     userinfo.setLast_Name(last_Name);
    //     userinfo.setMidle_Name(midle_Name);
    //     userinfo.setBirthday(birthday);
    //     userinfo.setGender(gender);
    //     userinfo.setCountry(country);
    //     userinfo.setCity(city);
    //     userinfo.setContact_no(contact_no);
    //     userinfo.setAddress(address);


    //     System.out.println("saveProfileDataForUpdate email= " + email_Address);
    //     System.out.println("saveProfileDataForUpdate first name= " + first_Name);
    //     System.out.println("saveProfileDataForUpdate lastname= " + last_Name);
    //     System.out.println("saveProfileDataForUpdate midlename= " + midle_Name);
    //     System.out.println("saveProfileDataForUpdate birthday= " +birthday);
    //     System.out.println("saveProfileDataForUpdate gender= " +gender);
    //     System.out.println("saveProfileDataForUpdate country= " +country);
    //     System.out.println("saveProfileDataForUpdate city= " +city);
    //     System.out.println("saveProfileDataForUpdate contact= " +contact_no);
    //     System.out.println("saveProfileDataForUpdate address= " +address);
        
        
       


    //     System.out.println("regular email= " + email_Address);
    //     System.out.println("regular first name= " + first_Name);
    //     System.out.println("regular lastname= " + last_Name);
    //     System.out.println("regular midlename= " + midle_Name);
    //     System.out.println("regular birthday= " +birthday);
    //     System.out.println("regular gender= " +gender);
    //     System.out.println("regular country= " +country);
    //     System.out.println("regular city= " +city);
    //     System.out.println("regular contact= " +contact_no);
    //     System.out.println("regular address= " +address);


    //     System.out.println("regular user_company_name= " + user_company_name);
    //     System.out.println("regular company_duration_work= " + company_duration_work);
    //     System.out.println("regular position_worked= " + position_worked);
    //     System.out.println("regular year_worked= " + year_worked);
    //     System.out.println("regular salary= " + salary);

    //     return user_data_successfuly_added;


    // }





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

    public String getUser_company_name() {
        return this.user_company_name;
    }

    public void setUser_company_name(String user_company_name) {
        this.user_company_name = user_company_name;
    }

    public String getCompany_duration_work() {
        return this.company_duration_work;
    }

    public void setCompany_duration_work(String company_duration_work) {
        this.company_duration_work = company_duration_work;
    }

    public String getPosition_worked() {
        return this.position_worked;
    }

    public void setPosition_worked(String position_worked) {
        this.position_worked = position_worked;
    }

    public String getYear_worked() {
        return this.year_worked;
    }

    public void setYear_worked(String year_worked) {
        this.year_worked = year_worked;
    }

    public String getSalary() {
        return this.salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public int getUser_id_session() {
        return this.user_id_session;
    }

    public void setUser_id_session(int user_id_session) {
        this.user_id_session = user_id_session;
    }







    
} // end of UpdateSaveProfileDataAction