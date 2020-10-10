package com.community.dao.usersdao.standardao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.community.bean.usersbean.LoginInfo;
import com.community.bean.usersbean.RegisterInfo;
import com.community.bean.usersbean.ResetPasswordBean;
import com.community.bean.usersbean.User;
import com.community.dbconnection.DConnection;

import org.apache.struts2.components.Password;


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

    // int status = 0;
    int generatedKey = 0;
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
       PreparedStatement ps = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
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
       ps.executeUpdate();

        ResultSet rs = ps.getGeneratedKeys();
        // int generatedKey = 0;
            if (rs.next()) {
                generatedKey = rs.getInt(1);
            }
 
System.out.println("From the fuction dao  Inserted record's ID: " + generatedKey);
       
      
     
       
   }catch(Exception e)
   {
       e.printStackTrace();
       System.err.println("SQL STATE: " + ((SQLException)e).getSQLState());
       System.err.println("SQL ERROR CODE: " + ((SQLException)e).getErrorCode());
   }finally
   {
       
         DConnection.closeConnection(conn);
      
    }// finally end
   
    return generatedKey;
}// end of RegisterUser accounts


public static int registerUserIDWorkExperianceTable(int recInserted){

    // int status = 0;
    int generatedKey = 0;
    Connection  conn = null;

    try{
    
        conn = DConnection.getConnectionToMySQL();
      String query = "INSERT INTO profile_work_experiance_table " 
                    +   "("
                    +   "user_id" 
                    +   ")"
                    +   "VALUES (?) ";
       PreparedStatement ps = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
       ps.setInt(1, recInserted);
      
       
       System.out.println(ps);
       ps.executeUpdate();

        ResultSet rs = ps.getGeneratedKeys();
        // int generatedKey = 0;
            if (rs.next()) {
                generatedKey = rs.getInt(1);
            }
 
        System.out.println("last Id insert on  work experiance table " + generatedKey);
       
      
     
       
   }catch(Exception e)
   {
       e.printStackTrace();
       System.err.println("SQL STATE: " + ((SQLException)e).getSQLState());
       System.err.println("SQL ERROR CODE: " + ((SQLException)e).getErrorCode());
   }finally
   {
       
         DConnection.closeConnection(conn);
      
    }// finally end
   
    return generatedKey;
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
       String query = "SELECT *  "
           + "FROM user_table  " 
           + "LEFT JOIN " 
           + "profile_work_experiance_table ON user_table.user_id = profile_work_experiance_table.user_id "
           + " WHERE " 
           + "user_table.user_id = ?";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setInt(1, user_id);

        ResultSet rs = ps.executeQuery();
        System.out.println(ps);
        System.out.println(rs);
        while(rs.next())
        {
            // if all tables where selected the number inside the parenthesis are there number if the table of the database
            userObj = new User(rs.getString(4),rs.getString(6), rs.getString(7), rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getString(13),rs.getString(14),      rs.getString(17),rs.getString(18),rs.getString(19),rs.getString(20),rs.getString(21));
           
            System.out.println("/////////////////////////////////////// Usermgmt query ");
           
            System.out.println("email: " + rs.getString(4));
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






// retrive profile work experiance when the user views his own profile
public static User getProfileWorkExperianceDataById(int user_id){

        
    User userObj = null;
    // boolean validStatus = false;
    Connection  conn = null;
    
    try{
        conn = DConnection.getConnectionToMySQL();
        String query = "SELECT * " 
                     + "FROM profile_work_experiance_table " 
                     + "WHERE user_id = ? ";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setInt(1, user_id);

        ResultSet rs = ps.executeQuery();
        // System.out.println(rs);
        while(rs.next())
        {
            // if all tables where selected the number inside the parenthesis are there number if the table of the database
             userObj = new User(rs.getString(3),rs.getString(4), rs.getString(5), rs.getString(6),rs.getString(7));
            
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








// update user profile data
	public static int updateUserProfileData(User  userinfo,int user_id_session) {
        int status = 0;
        int adddata = 0;
        int updateresult = 0;
        
        // User userinfo = new User();

        Connection  conn = null;

        try{

       
            
        
          conn = DConnection.getConnectionToMySQL();
          String query1 = "UPDATE user_table  SET " 
                     
                        +    "email_Address = ?, " 
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
           PreparedStatement ps = conn.prepareStatement(query1);
          
           ps.setString(1,  userinfo.getEmail_Address());
           ps.setString(2,  userinfo.getFirst_Name());
           ps.setString(3,  userinfo.getLast_Name());
           ps.setString(4,  userinfo.getMidle_Name());
           ps.setString(5,  userinfo.getBirthday());
           ps.setString(6,  userinfo.getCountry());
           ps.setString(7,  userinfo.getCity());
           ps.setString(8,  userinfo.getContact_no());
           ps.setString(9, userinfo.getAddress());
           ps.setString(10, userinfo.getGender());
           // where condition target id
           ps.setInt(11, user_id_session);


           ////////////////////Insert addtional data of work experaince to another table///////////////////

           

          String query2 = "UPDATE  profile_work_experiance_table " 
                        +   "SET "
                      
                        +    "user_company_name = ?, " 
                        +    "company_duration_work = ?, "
                        +    "position_worked = ?, "
                        +    "year_worked = ?, "
                        +    "salary = ? "
                      
                       
                        +    "WHERE user_id = ? ";

           PreparedStatement ps1 = conn.prepareStatement(query2);
          
           ps1.setString(1, userinfo.getUser_company_name());
           ps1.setString(2, userinfo.getCompany_duration_work());
           ps1.setString(3, userinfo.getPosition_worked());
           ps1.setString(4, userinfo.getYear_worked());
           ps1.setString(5, userinfo.getSalary());
           ps1.setInt(6, user_id_session);
            System.out.println(ps);
            System.out.println(ps1);



            status = ps.executeUpdate();
            adddata = ps1.executeUpdate();



           // if there  is 1 table udpdated it results to a true
            if(status == 1 || adddata == 1){
                updateresult = 1;
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
       
     return updateresult;

    }// end of updateUser
    



    // check if the email already exist in the database
     public static boolean CheckEmailExist(ResetPasswordBean ResetPasswordBean) throws Exception {
       
       
       
        boolean validStatus = false;
        Connection conn = null;
       
  

        try{
            conn = DConnection.getConnectionToMySQL();
            String query = "SELECT * FROM user_table WHERE email_Address = ? ";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, ResetPasswordBean.getEmail_Address());
            
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







 // for reseting the password by inserting a new password
 public static int sendEmailForAccountVerication(String email_Address, String code ){
    
    // int status = 0;
    int generatedKey = 0;
    int status = 0;
    Connection  conn = null;

      try{

     conn = DConnection.getConnectionToMySQL();
      String query = "INSERT INTO " 
                    + " activation_table " 
                    +   "("
                    +   "email_Address, " 
                    +   "activation_code, " 
                    +   "activated " 
                    +   ")"
                    +   "VALUES (?,?,?) ";
       PreparedStatement ps = conn.prepareStatement(query);
      
       ps.setString(1,  email_Address );
       ps.setString(2,  code );
       ps.setInt(3,  0 );
       
      
       // where condition target email_Address
       
       System.out.println("userMmgt email address =  " + email_Address );

       System.out.println("query exucted in Usermgmt for password reset = " + ps );


        status = ps.executeUpdate();
       



       // if there  is 1 table udpdated it results to a true
        if(status == 1 ){
            System.out.println("The update password was sucesfuly updated in UserMgmt ");
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
   
 return status;

}// end of updateUser







// insert reset password from email
public static int insertResetPassword(String email_Address, String code ){

    // int status = 0;
    int generatedKey = 0;
    int status = 0;
    Connection  conn = null;

    try{

      conn = DConnection.getConnectionToMySQL();
      String query = "UPDATE user_table  SET " 
                   +    "password = ? " 
                   +    "WHERE email_Address = ?  ";
       PreparedStatement ps = conn.prepareStatement(query);
      
       ps.setString(1,  code );
       System.out.println("userMgmt password = " + code );
      
       // where condition target email_Address
       ps.setString(2, email_Address );
       System.out.println("userMmgt email address =  " + email_Address );

       System.out.println("query exucted in Usermgmt for password reset = " + ps );


        status = ps.executeUpdate();
       



       // if there  is 1 table udpdated it results to a true
        if(status == 1 ){
            System.out.println("The update password was sucesfuly updated in UserMgmt ");
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
   
 return status;

}// end of insertResetPassword










 // check if the account has been verified
 public static boolean checkIfEmailHasBeenVerified(ResetPasswordBean ResetPasswordBean) throws Exception {
       
       
       
    boolean validStatus = false;
    Connection conn = null;
   


    try{
        conn = DConnection.getConnectionToMySQL();
        String query = "SELECT * " 
                     + "FROM activation_table " 
                     + "WHERE " 
                     + "email_Address = ? " 
                     + "AND "
                     + "activated = 0 ";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setString(1, ResetPasswordBean.getEmail_Address());
        
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

}// end of checkIfEmailHasBeenVerified function













// check if the activation code mathches the email address
public static boolean checkIfEmailAndCodeMatches(ResetPasswordBean ResetPasswordBean) throws Exception {
       
       
       
    boolean validStatus = false;
    Connection conn = null;
   


    try{
        conn = DConnection.getConnectionToMySQL();
        String query = "SELECT * " 
                     + "FROM activation_table " 
                     + "WHERE " 
                     + "email_Address = ? " 
                     + "AND "
                     + "activation_code = ? ";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setString(1, ResetPasswordBean.getEmail_Address() );
        ps.setString(2, ResetPasswordBean.getCode() );
        
        System.out.println(ps);
        ResultSet rs = ps.executeQuery();
         System.out.println(rs);
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

}// end of checkIfEmailAndCodeMatches function





// insert registration verfication code 
public static int changeVerficationStatus(String email_Address ){

    // int status = 0;
    int generatedKey = 0;
    int status = 0;
    Connection  conn = null;

    try{

      conn = DConnection.getConnectionToMySQL();
      String query = "UPDATE activation_table  SET " 
                   +    "activated = 1 " 
                   +    "WHERE email_Address = ?  ";
       PreparedStatement ps = conn.prepareStatement(query);
      
       
      
       // where condition target email_Address
       ps.setString(1, email_Address );
       System.out.println("userMmgt email address =  " + email_Address );

       System.out.println("query exucted in Usermgmt for password reset = " + ps );


        status = ps.executeUpdate();
       



       // if there  is 1 table udpdated it results to a true
        if(status == 1 ){
            System.out.println("The update password was sucesfuly updated in UserMgmt ");
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
   
 return status;

}// end of changeVerficationStatus









// inserts the manualy change password
public static int updaterUserPassword(String user_id_from_session, String password ){

    // int status = 0;
    int generatedKey = 0;
    int status = 0;
    Connection  conn = null;

    try{

      conn = DConnection.getConnectionToMySQL();
      String query = "UPDATE user_table  SET " 
                   +    "password = ? " 
                   +    "WHERE user_id = ?  ";
       PreparedStatement ps = conn.prepareStatement(query);
      
       ps.setString(1,  password );
       System.out.println("userMgmt password = " + password );
      
       // where condition target email_Address
       ps.setString(2, user_id_from_session );
       System.out.println("userMmgt user_id =  " + user_id_from_session);

       System.out.println("query exucted in Usermgmt for password reset = " + ps );


        status = ps.executeUpdate();
       



       // if there  is 1 table udpdated it results to a true
        if(status == 1 ){
            System.out.println("The update password was sucesfuly updated in UserMgmt ");
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
   
 return status;

}// end of updaterUserPassword














}////////////////////////////////////////// end of UserMgmtDao