package com.community.actions.useractions.standardactions.accountmanagement;

import com.community.bean.usersbean.User;
import com.community.dao.usersdao.admindao.AdmnUserMgtmtDao;
import com.community.dao.usersdao.standardao.UserMgmtDao;
import com.opensymphony.xwork2.ActionSupport;

public class ViewOtherUserAction extends ActionSupport {


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

    String user_company_name;
    String company_duration_work;
    String position_worked;
    String year_worked;
    String salary;
    

   
    
    public String execute(){

        
       retriveProfileDataForOthers();

        

        String statusCode = "viewprofile";
        
        return statusCode;

    }// end of execute

    

    public Object retriveProfileDataForOthers(){

        User user_data = UserMgmtDao.getUserDataByID(user_id);

        // user_id = user_data.getUser_id();
        email_Address = user_data.getEmail_Address();
        first_Name = user_data.getFirst_Name();
        last_Name = user_data.getLast_Name();
        midle_Name = user_data.getMidle_Name();
        birthday = user_data.getBirthday();
        gender = user_data.getGender();
        country = user_data.getCountry();
        city = user_data.getCity();
        contact_no = user_data.getContact_no();
        address = user_data.getAddress();


        user_company_name = user_data.getUser_company_name();
        company_duration_work = user_data.getCompany_duration_work();
        position_worked = user_data.getPosition_worked();
        year_worked = user_data.getYear_worked();
        salary = user_data.getSalary();


        // System.out.println("view other profile action");
        // System.out.println("email address:  " + email_Address);
        // System.out.println("First Name:  " + first_Name);
        // System.out.println("Last Name:  " + last_Name);
        // System.out.println("Midle Name:  " + midle_Name);
        // System.out.println("Birthday:  " + birthday);
        // System.out.println("Gender:  " + gender);
        // System.out.println("Country:  " + country);
        // System.out.println("City:  " + city);
        // System.out.println("Contact no:  " + contact_no);
        // System.out.println("Address:  " + address);

        // System.out.println("Company Name:  " + user_company_name);
        // System.out.println("Company Duration Work:  " + company_duration_work);
        // System.out.println("Position Worked:  " + position_worked);
        // System.out.println("Year Worked:  " + year_worked);
        // System.out.println("Salary:  " + salary);

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

    






}// end of ViewOtherUserAction