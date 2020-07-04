package com.community.actions.useractions.standardactions.accountmanagement;

import com.community.bean.usersbean.LoginInfo;
import com.community.bean.usersbean.User;
import com.community.dao.usersdao.standardao.LoginDAO;
import com.community.dao.usersdao.standardao.UserMgmtDao;
import com.community.dbconnection.Session;
import com.opensymphony.xwork2.ActionSupport;

import org.apache.struts2.ServletActionContext;



public class LoginAction extends ActionSupport {

   
    
    // private SessionMap<String, Object> sessionMap;

    

    String email_Address;
    String password;
    int user_id;

    
    
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

    String statusCode;
    int user_id_session;
    int profile_id;
    
    

    public String execute() throws Exception{
        // boolean isUserValid = false;
       
            LoginInfo userInfo = new LoginInfo(email_Address,password);
          

                boolean isUserValid = LoginDAO.isUserValid(userInfo);
                if(isUserValid) 
                {       
                // gets the user id
                   
                    profile_id = UserMgmtDao.getUserId(userInfo); //gets the userid  that login 
                    System.out.println("the user idssssssss = " +  profile_id);

                    
                    // retriveProfileDataForOthers(profile_id); //retrives the data of the user id
                    ServletActionContext.getRequest().getSession().setAttribute("login_user", profile_id); //sets the user id to the session
                    
                    
                    // user_id_session =   (int)ServletActionContext.getRequest().getSession().getAttribute("login_user");
                    // System.out.println("from LoginAction user id from session = " + user_id_session); // does not work



                    // retriveProfileDataForOthers(profile_id);
                
                    return  statusCode = "loginsuccess";
                }else
                {
                    return  statusCode = "input";
                }

             
            
        }// end of execute function


        


        









        // public Object retriveProfileDataForOthers(int user_id){

        //     User user_data = UserMgmtDao.getUserDataByID(user_id);
            
    
        //     user_id = user_data.getUser_id();
        //     email_Address = user_data.getEmail_Address();
        //     password = user_data.getPassword();
        //     first_Name = user_data.getFirst_Name();
        //     last_Name = user_data.getLast_Name();
        //     midle_Name = user_data.getMidle_Name();
        //     birthday = user_data.getBirthday();
        //     gender = user_data.getGender();
        //     country = user_data.getCountry();
        //     city = user_data.getCity();
        //     contact_no = user_data.getContact_no();
        //     address = user_data.getAddress();


        //     user_company_name = user_data.getUser_company_name();
        //     company_duration_work = user_data.getCompany_duration_work();
        //     position_worked = user_data.getPosition_worked();
        //     year_worked = user_data.getYear_worked();
        //     salary = user_data.getSalary();

    
        //     return user_data;
        // }
        

       
       

    

    public int getUser_id_session() {
        return this.user_id_session;
    }

    public void setUser_id_session(int user_id_session) {
        this.user_id_session = user_id_session;
    }


    public int getProfile_id() {
        return this.profile_id;
    }

    public void setProfile_id(int profile_id) {
        this.profile_id = profile_id;
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







    // @Override
    // public String toString() {
    //     return "{" +
    //         " email_Address='" + getEmail_Address() + "'" +
    //         ", password='" + getPassword() + "'" +
    //         ", user_id='" + getUser_id() + "'" +
    //         ", first_Name='" + getFirst_Name() + "'" +
    //         ", last_Name='" + getLast_Name() + "'" +
    //         ", midle_Name='" + getMidle_Name() + "'" +
    //         ", birthday='" + getBirthday() + "'" +
    //         ", country='" + getCountry() + "'" +
    //         ", city='" + getCity() + "'" +
    //         ", contact_no='" + getContact_no() + "'" +
    //         ", address='" + getAddress() + "'" +
    //         ", gender='" + getGender() + "'" +
    //         "}";
    // }


    







public void validate() {
		
		if(email_Address.equals("")) {
			addFieldError("email_Address", "email address  is required");
        }
        
        if(password.equals("")) {
			addFieldError("password", "password is required");
        }
        
        // if(password.length() < 6) {
		// 	addFieldError("password", "password is required");
		// }

    }
    

}// end of LoginFunction