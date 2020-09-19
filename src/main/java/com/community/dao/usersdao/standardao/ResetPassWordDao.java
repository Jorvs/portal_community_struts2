package com.community.dao.usersdao.standardao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.community.bean.usersbean.ResetPasswordBean;
import com.community.dbconnection.DConnection;

public class ResetPassWordDao {
    

//     public static boolean CheckEmailExist(ResetPasswordBean ResetPasswordBean) throws Exception {
       
       
       
//         boolean validStatus = false;
//         Connection conn = null;
       
  

//         try{
//             conn = DConnection.getConnectionToMySQL();
//             String query = "SELECT * FROM user_table WHERE email_Address = ? ";
//             PreparedStatement ps = conn.prepareStatement(query);
//             ps.setString(1, ResetPasswordBean.getEmail_Address());
            
//         //    System.out.println(ps);
//             ResultSet rs = ps.executeQuery();
//             // System.out.println(rs);
//             while(rs.next())
//             {
//                 validStatus = true;

//             }
            
//         }catch(Exception e)
//         {
//             e.printStackTrace();
//             System.err.println("SQL STATE: " + ((SQLException)e).getSQLState());
//             System.err.println("SQL ERROR CODE: " + ((SQLException)e).getErrorCode());
//         }finally
//         {
//             DConnection.closeConnection(conn);
//         }
//             return validStatus;
    
//    }// end of isUserValid function

}
