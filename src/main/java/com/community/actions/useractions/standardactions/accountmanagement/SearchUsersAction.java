package com.community.actions.useractions.standardactions.accountmanagement;


import com.community.dao.usersdao.standardao.UserMgmtDao;
import com.opensymphony.xwork2.ActionSupport;

public class SearchUsersAction extends ActionSupport {


    String search_name;
    Object users;
    

   
    
    public String execute(){

        
       // display the search users
        displaySearchUsers();
        

        

        String statusCode = "searchusersuccess";
        
        return statusCode;

    }// end of execute


    // function for seaarch and passing it to an object
    public Object displaySearchUsers() {
        
         users = UserMgmtDao.searchUser(search_name);
        // System.out.println(users_data);

        return users;

 }




    public String getSearch_name() {
        return this.search_name;
    }

    public void setSearch_name(String search_name) {
        this.search_name = search_name;
    }




  

    public Object getUsers() {
        return this.users;
    }

    public void setUsers(Object users) {
        this.users = users;
    }


}