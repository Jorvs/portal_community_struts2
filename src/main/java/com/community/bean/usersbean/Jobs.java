package com.community.bean.usersbean;


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
String posted_Jobs;





    public Jobs(int job_information_id, int user_id, String job_title, String job_time_stamp, String job_description, String job_salary, String type_of_work, String job_location, String qualifications, String country, String city, String address) {

        this.job_information_id = job_information_id;
        this.user_id = user_id;
        this.job_title = job_title;
        this.job_time_stamp = job_time_stamp;
        this.job_description = job_description;
        this.job_salary = job_salary;
        this.type_of_work = type_of_work;
        this.job_location = job_location;
        this.qualifications = qualifications;
        this.country = country;
        this.city = city;
        this.address = address;


    }









}