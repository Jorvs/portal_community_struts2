package com.community.dao.usersdao.admindao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.community.bean.usersbean.User;
import com.community.dbconnection.DConnection;

public class AdmnUserMgtmtDao {

    

    public static  List<User>  getAllUser(){
        List<User> userList = new ArrayList<User>();
        // boolean validStatus = false;
        Connection  conn = null;
        
        try{
            conn = DConnection.getConnectionToMySQL();
            String query = "SELECT "
                         + "`user_id`, `email_Address`, `first_Name`, `last_Name` " 
                         + "FROM user_table";
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            // System.out.println(rs);
            while(rs.next())
            {
                // if all tables where selected the number inside the parenthesis are there number if the table of the database
                User userObj = new User(rs.getInt(1), rs.getString(2),rs.getString(3), rs.getString(4));
                userList.add(userObj);
                // System.out.println(userList);
            }
            
        }catch(Exception e)
        {
            e.printStackTrace();
            System.err.println("SQL STATE: " + ((SQLException)e).getSQLState());
            System.err.println("SQL ERROR CODE: " + ((SQLException)e).getErrorCode());
        }finally
        {
            // try{
                DConnection.closeConnection(conn);
            //    }catch (Exception e){
                //    e.printStackTrace();
            //    }
        }// finally end
        
        return userList;
          

    }


   




            ///////////////////////////delete user /////////////////////////////


    public static int deleteUser(int user_id){

        int status = 0;
        Connection  conn = null;

        try{
        
            conn = DConnection.getConnectionToMySQL();
          String query = "DELETE " 
                       + "FROM user_table "
                       + "WHERE user_id = ? ";
           PreparedStatement ps = conn.prepareStatement(query);
           ps.setInt(1, user_id);
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

    }//end of deleteUser

    


    public static User getUserByID(int user_id){

             
    User userObj = null;
    // boolean validStatus = false;
    Connection  conn = null;
    
    try{
         conn = DConnection.getConnectionToMySQL();
       String query = "SELECT *  "
           + "FROM user_table  " 
           + "LEFT JOIN " 
           + "profile_work_experiance_table " 
           + "ON user_table.user_id = profile_work_experiance_table.user_id "
           + "WHERE " 
           + "user_table.user_id = ?";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setInt(1, user_id);

        ResultSet rs = ps.executeQuery();
        System.out.println(ps);
        System.out.println(rs);
        while(rs.next())
        {
            // if all tables where selected the number inside the parenthesis are there number if the table of the database
            userObj = new User(rs.getInt(1), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getString(13),rs.getString(14),      rs.getString(17),rs.getString(18),rs.getString(19),rs.getString(20),rs.getString(21));
           
            System.out.println("/////////////////////////////////////// Admngmt query for retrive data  to the txtbox ");
            System.out.println("user id:  " + rs.getInt(1));
            System.out.println("email: " + rs.getString(4));
            System.out.println("password: " + rs.getString(5));
            System.out.println("First Name: " + rs.getString(6));
            System.out.println("Last Name: " + rs.getString(7));
            System.out.println("Midle Name: " +  rs.getString(8));
            System.out.println("Birthday: " + rs.getString(9));
            System.out.println("Gender: " + rs.getString(10));
            System.out.println("Country: " + rs.getString(11));
            System.out.println("City: " + rs.getString(12));
            System.out.println("Contact No: " + rs.getString(13));
            System.out.println("Adress: " + rs.getString(14));

            System.out.println("Company Name: " + rs.getString(17));
            System.out.println("Duration of worked: " + rs.getString(18));
            System.out.println("Position Worked: " + rs.getString(19));
            System.out.println("Year Worked: " + rs.getString(20));
            System.out.println("Salary: " + rs.getString(21));

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





// update userprofile
	public static int updateUser(User userinfo) {
        int status =0;
        
        Connection  conn = null;

        try{
        
            conn = DConnection.getConnectionToMySQL();
          String query = "UPDATE user_table  SET " 
                     
                        +    "email_Address = ?, " 
                        +    "password = ?, "
                        +    "first_Name = ?, "
                        +    "last_Name = ?, "
                        +    "midle_Name = ?, "
                        +    "birthday = ?, "
                        +    "country = ?, "
                        +    "city = ?, "
                        +    "contact_no = ?, "
                        +    "address = ?, "
                        +    "gender = ? " 
                     
                        +    "WHERE user_id = ?  ";
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
           // where condition target id
           ps.setInt(12, userinfo.getUser_id());

           System.out.println("/////////////////////////////////////// Admngmt query to update of user data ");
           System.out.println("email: " + userinfo.getEmail_Address());
           System.out.println("password: " + userinfo.getPassword());
           System.out.println("first Name: " + userinfo.getFirst_Name());
           System.out.println("lastName: " +  userinfo.getLast_Name());
           System.out.println("midle name: " +  userinfo.getMidle_Name());
           System.out.println("birthday: " +  userinfo.getBirthday());
           System.out.println("Country: " + userinfo.getCountry());
           System.out.println("City: " + userinfo.getCity());
           System.out.println("Contact No: " + userinfo.getContact_no());
           System.out.println("Adress: " + userinfo.getAddress());
           System.out.println("gender: " + userinfo.getGender());
           System.out.println("user id: " + userinfo.getUser_id());
            
           
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

	}// end of updateUser

   

}// end of UserMgmtDao