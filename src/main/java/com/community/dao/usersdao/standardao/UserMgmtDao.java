package com.community.dao.usersdao.standardao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.community.bean.usersbean.LoginInfo;
import com.community.bean.usersbean.RegisterInfo;
import com.community.bean.usersbean.Search;
import com.community.bean.usersbean.User;
import com.community.dbconnection.DConnection;

public class UserMgmtDao {




    public static User searchUserData(int user_id){
       
        User userObj = null;
        
        // boolean validStatus = false;
        Connection  conn = null;
        
        try{
             conn = DConnection.getConnectionToMySQL();
           String query = "SELECT "
                        + "user_id, first_Name, last_Name, email_Address " 
                        + "FROM user_table " 
                        + "WHERE user_id = ? ";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, user_id);

            ResultSet rs = ps.executeQuery();
            // System.out.println(rs);
            while(rs.next())
            {
                // if all tables where selected the number inside the parenthesis are there number if the table of the database
                 userObj = new User(rs.getInt(1), rs.getString(2),rs.getString(3),rs.getString(5));
               
                // System.out.println(userList);
            }
        }catch(Exception e)
        {
            e.printStackTrace();
            System.err.println("SQL STATE: " + ((SQLException)e).getSQLState());
            System.err.println("SQL ERROR CODE: " + ((SQLException)e).getErrorCode());
        }finally
        {
            
                DConnection.closeConnection(conn);
           
         }// finally end
        
         return userObj;


    }// end  searchUserdata


        // used for seacrching users in the navbar
    public static List<User> searchUser(String search){

    List<User> user_search = new ArrayList<User>();

    User userObj = null;
    // boolean validStatus = false;
    Connection  conn = null;
    
    try{
        conn = DConnection.getConnectionToMySQL();
        String query =  "SELECT "
                        + "user_id, first_Name, last_Name, email_Address " 
                        + "FROM user_table " 
                        + "WHERE "
                        + "CONCAT_WS(first_Name ,last_Name, email_Address) "
                        + "LIKE   ? ";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setString(1, "%" + search + "%");
        // System.out.println(ps);

        ResultSet rs = ps.executeQuery();
        // System.out.println(rs);
        while(rs.next())
        {
            // if all tables where selected the number inside the parenthesis are there number if the table of the database
            userObj = new User(rs.getInt(1), rs.getString(2),rs.getString(3),rs.getString(4) );
            user_search.add(userObj);
            // System.out.println(userObj);
           
           
        }
    }catch(Exception e)
    {
        e.printStackTrace();
        System.err.println("SQL STATE: " + ((SQLException)e).getSQLState());
        System.err.println("SQL ERROR CODE: " + ((SQLException)e).getErrorCode());
    }finally
    {
        
            DConnection.closeConnection(conn);
       
     }// finally end
    
     return user_search;

    

}// emd of searchUser


// used for registration of users
public static int registerUser(RegisterInfo userinfo){

    int status = 0;
    Connection  conn = null;

    try{
    
        conn = DConnection.getConnectionToMySQL();
      String query = "INSERT INTO user_table " 
                    +   "("
                    +    "email_Address," 
                    +    "password,"
                    +    "first_Name, "
                    +    "last_Name, "
                    +    "midle_Name, "
                    +    "birthday, "
                    +    "country, "
                    +    "city, "
                    +    "contact_no, "
                    +    "address, "
                    +    "gender " 
                    +    ")"
                    +    " VALUES (?,?,?,?,?,?,?,?,?,?,?) ";
       PreparedStatement ps = conn.prepareStatement(query);
       ps.setString(1, userinfo.getEmail_Address());
       ps.setString(2, userinfo.getPassword());
       ps.setString(3, userinfo.getFirst_Name());
       ps.setString(4, userinfo.getLast_Name());
       ps.setString(5, userinfo.getMidle_Name());
       ps.setString(6, userinfo.getBirthday());
       ps.setString(7, userinfo.getCountry());
       ps.setString(8, userinfo.getCity());
       ps.setString(9, userinfo.getContact_no());
       ps.setString(10, userinfo.getAddress());
       ps.setString(11, userinfo.getGender());
       
       System.out.println(ps);
       status = ps.executeUpdate();
       
      
     
       
   }catch(Exception e)
   {
       e.printStackTrace();
       System.err.println("SQL STATE: " + ((SQLException)e).getSQLState());
       System.err.println("SQL ERROR CODE: " + ((SQLException)e).getErrorCode());
   }finally
   {
       
         DConnection.closeConnection(conn);
      
    }// finally end
   
    return status;
}// end of RegisterUser accounts





 // this function is used in welcome thanks page afther registering
 public static User showUserData(int user_id){
       
    User userObj = null;
    // boolean validStatus = false;
    Connection  conn = null;
    
    try{
         conn = DConnection.getConnectionToMySQL();
       String query = "SELECT "
                    + "user_id, first_Name, last_Name, email_Address " 
                    + "FROM user_table " 
                    + "WHERE user_id = ? ";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setInt(1, user_id);

        ResultSet rs = ps.executeQuery();
        // System.out.println(rs);
        while(rs.next())
        {
            // if all tables where selected the number inside the parenthesis are there number if the table of the database
             userObj = new User(rs.getInt(1), rs.getString(2),rs.getString(3),rs.getString(5));
           
            // System.out.println(userList);
        }
    }catch(Exception e)
    {
        e.printStackTrace();
        System.err.println("SQL STATE: " + ((SQLException)e).getSQLState());
        System.err.println("SQL ERROR CODE: " + ((SQLException)e).getErrorCode());
    }finally
    {
        
            DConnection.closeConnection(conn);
       
     }// finally end
    
     return userObj;


}




// gets the user data when other user views the profile
public static User getUserDataByID(int user_id){

        
    User userObj = null;
    // boolean validStatus = false;
    Connection  conn = null;
    
    try{
         conn = DConnection.getConnectionToMySQL();
       String query = "SELECT * " 
                    + "FROM user_table " 
                    + "WHERE user_id = ? ";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setInt(1, user_id);

        ResultSet rs = ps.executeQuery();
        // System.out.println(rs);
        while(rs.next())
        {
            // if all tables where selected the number inside the parenthesis are there number if the table of the database
            userObj = new User(rs.getString(4),rs.getString(6), rs.getString(7), rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getString(13),rs.getString(14));
            
           
            // System.out.println(userList);
        }
    }catch(Exception e)
    {
        e.printStackTrace();
        System.err.println("SQL STATE: " + ((SQLException)e).getSQLState());
        System.err.println("SQL ERROR CODE: " + ((SQLException)e).getErrorCode());
    }finally
    {
        
            DConnection.closeConnection(conn);
       
     }// finally end
    
     return userObj;
}// end of getUserByID






public static int getUserId(LoginInfo userInfo) throws Exception {

    // boolean validStatus = false;

    int id_retrived = 0;
    Connection conn = null;
   


    try{
        conn = DConnection.getConnectionToMySQL();
       String query = "SELECT user_id " 
                    + "FROM user_table " 
                    + "WHERE  " 
                    + "email_Address = ? AND password = ? ";
        PreparedStatement ps = conn.prepareStatement(query);
       ps.setString(1, userInfo.getEmail_Address());
       ps.setString(2, userInfo.getPassword());
    //    System.out.println(ps);
        ResultSet rs = ps.executeQuery();
        // System.out.println(rs);
        while(rs.next())
        {
            id_retrived = (rs.getInt(1));
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
        return  id_retrived;

}// end of getUSerId





// retrive profile data when the user views his own profile
public static User getProfileDataById(int user_id){

        
    User userObj = null;
    // boolean validStatus = false;
    Connection  conn = null;
    
    try{
        conn = DConnection.getConnectionToMySQL();
        String query = "SELECT * " 
                     + "FROM user_table " 
                     + "WHERE user_id = ? ";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setInt(1, user_id);

        ResultSet rs = ps.executeQuery();
        // System.out.println(rs);
        while(rs.next())
        {
            // if all tables where selected the number inside the parenthesis are there number if the table of the database
             userObj = new User(rs.getString(4),rs.getString(6), rs.getString(7), rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getString(13),rs.getString(14));
            
            // System.out.println(userList);
        }
    }catch(Exception e)
    {
        e.printStackTrace();
        System.err.println("SQL STATE: " + ((SQLException)e).getSQLState());
        System.err.println("SQL ERROR CODE: " + ((SQLException)e).getErrorCode());
    }finally
    {
        
            DConnection.closeConnection(conn);
       
     }// finally end
    
     return userObj;
}// end of getUserByID






}// end of UserMgmtDao