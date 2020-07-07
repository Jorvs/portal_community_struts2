package com.community.dao.postdao.standardao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.community.bean.jobsbean.Jobs;
import com.community.dbconnection.DConnection;


public class JobsMgmtDao {

    

// used for registering Job information table
public  int registerJobsinformation(Jobs jobsinfo,int user_id_session){

    // int status = 0;
    int generatedKey = 0;
    Connection  conn = null;

    try{
    
        conn = DConnection.getConnectionToMySQL();
      String query = "INSERT INTO " 
                    +   "job_information_table " 
                    +   "("
                    +    "job_title," 
                    +    "job_description,"
                    +    "job_salary, "
                    +    "type_of_work, "
                    +    "job_location, "
                    +    "qualifications, "
                    +    "country, "
                    +    "city, "
                    +    "address, "
                    +    "user_id "
                    +    ")"
                    +    " VALUES (?,?,?,?,?,?,?,?,?,?) ";
       PreparedStatement ps = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
       ps.setString(1, jobsinfo.getJob_title());
       ps.setString(2, jobsinfo.getJob_description());
       ps.setString(3, jobsinfo.getJob_salary());
       ps.setString(4, jobsinfo.getType_of_work());
       ps.setString(5, jobsinfo.getJob_location());
       ps.setString(6, jobsinfo.getQualifications());
       ps.setString(7, jobsinfo.getCountry());
       ps.setString(8, jobsinfo.getCity());
       ps.setString(9, jobsinfo.getAddress());
       ps.setInt(10, user_id_session); 
       
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





    public static int registerJobsForPosting(int recInserted,Jobs jobs_posting ,int user_id_session){

        // int status = 0;
        int generatedKey = 0;
        Connection  conn = null;
    
        try{
        
            conn = DConnection.getConnectionToMySQL();
          String query  =   "INSERT INTO " 
                        +   "post_jobs_table " 
                        +   "("
                        +   "job_information_id, " 
                        +   "posted_jobs, " 
                        +   "user_id " 
                        +   ")"
                        +   "VALUES (?,?,?) ";
           PreparedStatement ps = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
           ps.setInt(1, recInserted);
           ps.setString(2, jobs_posting.getPosted_jobs());
           ps.setInt(3, user_id_session);
           
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
    


}