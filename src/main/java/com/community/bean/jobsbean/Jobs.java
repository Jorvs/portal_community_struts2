package com.community.bean.jobsbean;


public class Jobs {



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





    ///////////////////////////////// used for posting or registering a Job information
    public Jobs(String job_title, String job_description, String job_salary, String type_of_work, String job_location, String qualifications, String country, String city, String address) {

       
        this.job_title = job_title;
        this.job_description = job_description;
        this.job_salary = job_salary;
        this.type_of_work = type_of_work;
        this.job_location = job_location;
        this.qualifications = qualifications;
        this.country = country;
        this.city = city;
        this.address = address;

     }

     /////////////////////////////////////////// used for posting a job
     public Jobs(String posted_jobs) {
       
        this.posted_jobs = posted_jobs;
    }


    ////////////////////////////////////////////////used for jobs searchs

    public Jobs(int job_information_id ,String job_description ,String job_title,String job_salary,String type_of_work){

        this.job_information_id = job_information_id;
        this.job_description = job_description;
        this.job_title = job_title;
        this.job_salary = job_salary;
        this.type_of_work = type_of_work;

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





    @Override
    public String toString() {
        return "{" +
            " job_information_id='" + getJob_information_id() + "'" +
            ", user_id='" + getUser_id() + "'" +
            ", job_title='" + getJob_title() + "'" +
            ", job_time_stamp='" + getJob_time_stamp() + "'" +
            ", job_description='" + getJob_description() + "'" +
            ", job_salary='" + getJob_salary() + "'" +
            ", type_of_work='" + getType_of_work() + "'" +
            ", job_location='" + getJob_location() + "'" +
            ", qualifications='" + getQualifications() + "'" +
            ", country='" + getCountry() + "'" +
            ", city='" + getCity() + "'" +
            ", address='" + getAddress() + "'" +
            ", post_jobs_Id='" + getPost_jobs_Id() + "'" +
            ", posted_jobs='" + getPosted_jobs() + "'" +
            "}";
    }


}