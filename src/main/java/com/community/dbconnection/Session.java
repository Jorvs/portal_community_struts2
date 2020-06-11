package com.community.dbconnection;

import java.util.Map;


import org.apache.struts2.dispatcher.SessionMap;


public class Session {


    public SessionMap<String, Object> sessionMap;



    

    


    // @Override
    public void setSession(Map<String, Object> map) {
        sessionMap = (SessionMap<String, Object>) map;
        

    }// end of setSession
    

    public String logout() {
		
		sessionMap.remove("userId");
		sessionMap.invalidate();
		
        return "LOGOUT";
        
	}// end of logout
    
}// end of session