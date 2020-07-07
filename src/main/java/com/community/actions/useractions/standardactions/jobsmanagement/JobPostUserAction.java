package com.community.actions.useractions.standardactions.jobsmanagement;

import com.community.bean.jobsbean.Jobs;
import com.community.dao.postdao.standardao.JobsMgmtDao;

import org.apache.struts2.ServletActionContext;

public class JobPostUserAction {

    
int job_information_id;
int user_id;
String job_title;
String job_time_stamp;
String job_description;
String job_salary;
String type_of_work;
String job_location;
String qualifications;
String country;
String city;
String address;

int post_jobs_Id;
String posted_jobs;

String message = "";
int user_id_session;
    

    public String execute() throws Exception {
        // need a contructor on registerinfo with this variables
    Jobs jobs_info = new Jobs(job_title,job_description,job_salary,type_of_work,job_location, qualifications, country, city, address);
    Jobs jobs_posting = new Jobs(posted_jobs);
    JobsMgmtDao jobsMgmt = new JobsMgmtDao();

    // boolean isUserRegistered = false;
    // User welcome_obj = null;
    String statuscode;
    
        user_id_session = (int)ServletActionContext.getRequest().getSession().getAttribute("login_user"); // stores the session id
        int recInserted = jobsMgmt.registerJobsinformation(jobs_info,user_id_session); // register the  job information and returns the job information_id
     
        if(recInserted >= 1)
        {
            System.out.println("condition have been met psot of job succes recieved The last id inserted is = "  + recInserted);
            int	posted_job = jobsMgmt.registerJobsForPosting(recInserted,jobs_posting,user_id_session);
            
            return statuscode = "job_have_been_posted";
        }
        else
        {
            message = "error register something went wrong";
            return statuscode = "error";
        }
    
    }



    public int getJob_information_id() {
        return this.job_information_id;
    }

    public void setJob_information_id(int job_information_id) {
        this.job_information_id = job_information_id;
    }

    public int getUser_id() {
        return this.user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getJob_title() {
        return this.job_title;
    }

    public void setJob_title(String job_title) {
        this.job_title = job_title;
    }

    public String getJob_time_stamp() {
        return this.job_time_stamp;
    }

    public void setJob_time_stamp(String job_time_stamp) {
        this.job_time_stamp = job_time_stamp;
    }

    public String getJob_description() {
        return this.job_description;
    }

    public void setJob_description(String job_description) {
        this.job_description = job_description;
    }

    public String getJob_salary() {
        return this.job_salary;
    }

    public void setJob_salary(String job_salary) {
        this.job_salary = job_salary;
    }

    public String getType_of_work() {
        return this.type_of_work;
    }

    public void setType_of_work(String type_of_work) {
        this.type_of_work = type_of_work;
    }

    public String getJob_location() {
        return this.job_location;
    }

    public void setJob_location(String job_location) {
        this.job_location = job_location;
    }

    public String getQualifications() {
        return this.qualifications;
    }

    public void setQualifications(String qualifications) {
        this.qualifications = qualifications;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPost_jobs_Id() {
        return this.post_jobs_Id;
    }

    public void setPost_jobs_Id(int post_jobs_Id) {
        this.post_jobs_Id = post_jobs_Id;
    }

    public String getPosted_jobs() {
        return this.posted_jobs;
    }

    public void setPosted_jobs(String posted_jobs) {
        this.posted_jobs = posted_jobs;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getUser_id_session() {
        return this.user_id_session;
    }

    public void setUser_id_session(int user_id_session) {
        this.user_id_session = user_id_session;
    }








}