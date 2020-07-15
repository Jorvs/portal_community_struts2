package com.community.actions.useractions.adminactions.accountmanagement;

import java.util.List;

import com.community.bean.usersbean.User;
import com.community.dao.usersdao.admindao.AdmnUserMgtmtDao;
import com.opensymphony.xwork2.ActionSupport;

public class HomePageDataPapulateAction extends ActionSupport {
    
    List<User> users;
    


    public String execute(){

        displayAdminUsers();

        String statusCode = "loginsuccess";
        
        return statusCode;

    }

    public void displayAdminUsers(){
        users = AdmnUserMgtmtDao.getAllUser();





        
    }




    public List<User> getUsers() {
        return this.users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }


}