package com.community.dao.usersdao.standardao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.community.bean.usersbean.LoginInfo;
import com.community.dbconnection.DConnection;


public class  LoginDAO{

    
    // checks if the user is a a registered user.
    public static boolean isUserValid(LoginInfo userInfo) throws Exception {
        boolean validStatus = false;
        Connection conn = null;
       
  

        try{
            conn = DConnection.getConnectionToMySQL();
            String query = "SELECT * FROM user_table WHERE email_Address = ? AND password = ? ";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, userInfo.getEmail_Address());
            ps.setString(2, userInfo.getPassword());

        //    System.out.println(ps);
            ResultSet rs = ps.executeQuery();
            // System.out.println(rs);
            while(rs.next())
            {
                validStatus = true;

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
    
   }// end of isUserValid function


   




   

} // end of LoginDao function