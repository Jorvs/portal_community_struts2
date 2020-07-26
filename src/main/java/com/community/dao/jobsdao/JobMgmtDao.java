package com.community.dao.jobsdao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.community.bean.jobsbean.Jobs;
import com.community.dbconnection.DConnection;

public class JobMgmtDao {
    


    public static  List<Jobs>  getAllJobs(){
        List<Jobs> jobList = new ArrayList<Jobs>();
        // boolean validStatus = false;
        Connection  conn = null;
        
        try{
            conn = DConnection.getConnectionToMySQL();
            String query = "SELECT "
                         + "`job_information_id`, `job_description`, `job_title`, `job_salary`, `type_of_work` " 
                         + "FROM " 
                         + "job_information_table ";
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            // System.out.println(rs);
            while(rs.next())
            {
                // if all tables where selected the number inside the parenthesis are there number if the table of the database
                Jobs jobsObj = new Jobs(rs.getInt(1), rs.getString(2),rs.getString(3), rs.getString(4),rs.getString(4));
                jobList.add(jobsObj);
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
        
        return jobList;

    }

}// end of JobMmtmtDao