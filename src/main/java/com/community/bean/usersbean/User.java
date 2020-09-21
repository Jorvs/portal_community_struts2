package com.community.bean.usersbean;

import java.nio.channels.SeekableByteChannel;

public class User {

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

    // addtional variable for update profile

    String user_company_name;
    String company_duration_work;
    String position_worked;
    String year_worked;
    String salary;


    




    
    


    // used for the welcome page afther registration
    public User(int user_id, String email_Address, String first_Name, String last_Name) {
        this.user_id = user_id;
        this.email_Address = email_Address;
        this.first_Name = first_Name;
        this.last_Name = last_Name;
    }

    public User(String user_company_name,String company_duration_work,String position_worked,String year_worked,String salary){


        this.user_company_name = user_company_name;
        this.company_duration_work = company_duration_work;
        this.position_worked = position_worked;
        this.year_worked = year_worked;
        this.salary = salary;
    }

   
    // used for update the account of a registered user
    public User(String email_Address, String password, String first_Name, String last_Name, String midle_Name, String birthday, String country, String city, String contact_no, String address, String gender, String user_company_name,String company_duration_work, String position_worked,String year_worked,String salary) {

        this.email_Address = email_Address;
        this.password = password;
        this.first_Name = first_Name;
        this.last_Name = last_Name;
        this.midle_Name = midle_Name;
        this.birthday = birthday;
        this.country = country;
        this.city = city;
        this.contact_no = contact_no;
        this.address = address;
        this.gender = gender;

        this.user_company_name = user_company_name;
        this.company_duration_work = company_duration_work;
        this.position_worked = position_worked;
        this.year_worked = year_worked;
        this.salary = salary;

        
    }

    // used for registering a  a new user(not sure yet)
    public User(int user_id, String email_Address, String password, String first_Name, String last_Name, String midle_Name, String birthday, String country, String city, String contact_no, String address, String gender)
     {
        this.user_id = user_id;
        this.email_Address = email_Address;
        this.password = password;
        this.first_Name = first_Name;
        this.last_Name = last_Name;
        this.midle_Name = midle_Name;
        this.birthday = birthday;
        this.country = country;
        this.city = city;
        this.contact_no = contact_no;
        this.address = address;
        this.gender = gender;
    }

   
     // used for view and update user profile data and work experiance
     public User(String email_Address, String first_Name, String last_Name, String midle_Name, String birthday, String gender , String country, String city, String contact_no, String address,  String user_company_name,String company_duration_work, String position_worked,  String year_worked,  String salary )
     {
        
        this.email_Address = email_Address; 
        this.first_Name = first_Name;
        this.last_Name = last_Name;
        this.midle_Name = midle_Name;
        this.birthday = birthday;
        this.gender = gender;
        this.country = country;
        this.city = city;
        this.contact_no = contact_no;
        this.address = address;

      
        

        this.user_company_name = user_company_name;
        this.company_duration_work = company_duration_work;
        this.position_worked = position_worked;
        this.year_worked = year_worked;
        this.salary = salary;
        
    }


    // this is use for view the data before update
    public User(String email_Address,   String first_Name, String last_Name, String midle_Name, String birthday, String country, String city, String contact_no, String address,String gender)
    {
       
       
        
       
       this.email_Address = email_Address;
       this.first_Name = first_Name;
       this.last_Name = last_Name;
       this.midle_Name = midle_Name;
       this.birthday = birthday;
       this.gender = gender;
       this.country = country;
       this.city = city;
       this.contact_no = contact_no;
       this.address = address;

       

    }
 // used for view user profile data and work experiance for admin 
    public User(int user_id ,String email_Address,String password ,String first_Name, String last_Name, String midle_Name, String birthday, String gender , String country, String city, String contact_no, String address,  String user_company_name,String company_duration_work, String position_worked,  String year_worked,  String salary )
    {
        this.user_id = user_id;
        this.email_Address = email_Address; 
        this.password = password;
        this.first_Name = first_Name;
        this.last_Name = last_Name;
        this.midle_Name = midle_Name;
        this.birthday = birthday;
        this.gender = gender;
        this.country = country;
        this.city = city;
        this.contact_no = contact_no;
        this.address = address;

        this.user_company_name = user_company_name;
        this.company_duration_work = company_duration_work;
        this.position_worked = position_worked;
        this.year_worked = year_worked;
        this.salary = salary;
        
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








    @Override
    public String toString() {
        return "{" +
            " user_id='" + getUser_id() + "'" +
            ", email_Address='" + getEmail_Address() + "'" +
            ", password='" + getPassword() + "'" +
            ", first_Name='" + getFirst_Name() + "'" +
            ", last_Name='" + getLast_Name() + "'" +
            ", midle_Name='" + getMidle_Name() + "'" +
            ", birthday='" + getBirthday() + "'" +
            ", country='" + getCountry() + "'" +
            ", city='" + getCity() + "'" +
            ", contact_no='" + getContact_no() + "'" +
            ", address='" + getAddress() + "'" +
            ", gender='" + getGender() + "'" +
            ", user_company_name='" + getUser_company_name() + "'" +
            ", company_duration_work='" + getCompany_duration_work() + "'" +
            ", position_worked='" + getPosition_worked() + "'" +
            ", year_worked='" + getYear_worked() + "'" +
            ", salary='" + getSalary() + "'" +
            "}";
    }
   


}// end of user file
