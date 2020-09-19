package com.community.actions.useractions.standardactions.accountmanagement;

import com.community.bean.usersbean.RegisterInfo;
import com.community.bean.usersbean.ResetPasswordBean;
import com.community.bean.usersbean.User;
import com.community.dao.usersdao.standardao.UserMgmtDao;
import com.opensymphony.xwork2.ActionSupport;

public class RegisterUserAction extends ActionSupport {

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

	String message = "";

	String statuscode;
	String errormessage;

	// cacthes the request message for mapping and redirection to the struts.xml
	public String execute() throws Exception {

		

		// bean for userdata
		RegisterInfo userinfo = new RegisterInfo(email_Address,password,first_Name,last_Name,midle_Name,birthday,country,city,contact_no, address,gender);

		// bean for taking cehcking the email exsit
		ResetPasswordBean check_emailaddress = new ResetPasswordBean(email_Address);

		
		// checks if the email exist 
		boolean check_if_user_exist  =	UserMgmtDao.CheckEmailExist(check_emailaddress);
		
		if(check_if_user_exist)
		{
			System.out.println("The email is already registred");		
			errormessage = "This email has  been taken or Registred already";
            return  statuscode = "input";

		}else
		{
			// inserts the user data
			int Insert_user_data = UserMgmtDao.registerUser(userinfo);

			if(Insert_user_data >= 1)
				{
					System.out.println("condition have been met RegisterAction recieved The last id inserted is = "  + Insert_user_data);
					UserMgmtDao.registerUserIDWorkExperianceTable(Insert_user_data); // insetts extra user data 
					return statuscode = "registerusersuccess";
				}
				else
				{
					message = "error register something went wrong";
					return statuscode = "error_user_register";
				}

		}
		
		

	}
	



	public String getErrormessage() {
		return this.errormessage;
	}

	public void setErrormessage(String errormessage) {
		this.errormessage = errormessage;
	}



	public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
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
	
	
	
	public void validate() {
		

		if(email_Address.equals("")) {
			addFieldError("email_Address", "email address is required");
		}
		if(first_Name.equals("")) {
			addFieldError("first_Name", "First Name is required");
		}
		
		if(last_Name.equals("")) {
			addFieldError("last_Name", "last Name is required");
		}
		
		if(gender.equals("")) {
			addFieldError("gender", "gender Name is required");
		}
	
		if(birthday.equals("")) {
			addFieldError("birthday", "birday Name is required");
		}
		if(birthday.equals("")) {
			addFieldError("birthday", "birday Name is required");
		}
		
		
	}// end of validate
	
	
	
	
	
	

}
