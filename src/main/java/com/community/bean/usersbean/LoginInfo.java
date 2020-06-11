package com.community.bean.usersbean;

public class LoginInfo {
	
	String email_Address;
	String password;
	

	
	public LoginInfo(int i) {
		// TODO  generate construction stub
		
	} 
	
	public LoginInfo(String email_Address, String password) {
		 super();
		this.email_Address = email_Address;
		this.password = password;
		
		
	}



	
	
	public String getEmail_Address() {
		return email_Address;
	}

	public void setEmail_Address(String email_Address) {
		this.email_Address = email_Address;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String toString() {
		return "LogInfo[ email_Address=" + email_Address +", password=" + password +" ]";
	}
	
	
	

}
