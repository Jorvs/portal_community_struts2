package com.community.actions.useractions.adminactions.accountmanagement;

import com.community.bean.usersbean.RegisterInfo;
import com.community.dao.usersdao.standardao.UserMgmtDao;
import com.opensymphony.xwork2.ActionSupport;

public class RegisterUserAction extends ActionSupport {

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

	// cacthes the request message for mapping and redirection to the struts.xml
	public String execute() throws Exception {
		// need a contructor on registerinfo with this variables
		RegisterInfo userinfo = new RegisterInfo(email_Address, password, first_Name, last_Name, midle_Name, birthday,
				country, city, contact_no, address, gender);
		// boolean isUserRegistered = false;

		String statuscode;

		int recInserted = UserMgmtDao.registerUser(userinfo);
        if(recInserted == 1)
        {
            return statuscode = "registerusersuccess";
        }
        else
        {
            return statuscode = "error_user_register";
        }

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
	
	
	
	// public void validate() {
		
	// 	if(first_Name.equals("")) {
	// 		addFieldError("first_Name", "First Name is required");
	// 	}
		
	// 	if(last_Name.equals("")) {
	// 		addFieldError("last_Name", "last Name is required");
	// 	}
		
	// 	if(gender.equals("")) {
	// 		addFieldError("gender", "gender Name is required");
	// 	}
	
	// 	if(birthday.equals("")) {
	// 		addFieldError("birthday", "birday Name is required");
	// 	}
		
	// }// end of validate
	
	
	
	
	
	

}
