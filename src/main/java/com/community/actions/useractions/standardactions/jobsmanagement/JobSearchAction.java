package com.community.actions.useractions.standardactions.jobsmanagement;

import java.util.List;

import com.community.bean.jobsbean.Jobs;
import com.community.dao.jobsdao.JobMgmtDao;

public class JobSearchAction {

    List<Jobs> jobs;

    public String execute() throws Exception {


   
    String statuscode;
    
        searhalljobs();


        return statuscode = "go_to_post_job_page";
        
        
    
    }// end of execute



    public void searhalljobs(){

        jobs = JobMgmtDao.getAllJobs();
     

    }
    

    public List<Jobs> getJobs() {
        return this.jobs;
    }

    public void setJobs(List<Jobs> jobs) {
        this.jobs = jobs;
    }



}// end of jobSearchAction