package com.community.dao.usersdao.standardao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.community.bean.usersbean.RegisterInfo;
import com.community.dbconnection.DConnection;

public class RegisterDao {

    // checks if the user is already registerd
    public static boolean isUserRegistered(RegisterInfo registerInfo) throws Exception {
        boolean validStatus = false;
        Connection conn = null;
        
        
        try{
            conn = DConnection.getConnectionToMySQL();
           String query = ("SELECT * FROM user_table WHERE email_Address = ? AND password = ? ");
            PreparedStatement ps = conn.prepareStatement(query);
           ps.setString(1, registerInfo.getEmail_Address());
           ps.setString(2, registerInfo.getPassword());
                 
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                validStatus = true;
                // make a fuctions here that rigister the users
            }
            
        }catch(Exception e)
        {
            e.printStackTrace();
            System.err.println("SQL STATE: " + ((SQLException)e).getSQLState());
            System.err.println("SQL ERROR CODE: " + ((SQLException)e).getErrorCode());
        }finally
        {
            DConnection.closeConnection(conn);
        }
           
        return validStatus;



        


    

	
     
        
	}// end of isUserRegister
    
}// end for RegisterDao