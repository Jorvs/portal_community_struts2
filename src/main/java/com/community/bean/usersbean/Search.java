package com.community.bean.usersbean;

public class Search {
    

    String search_name;


     // used in searches 
     public Search(String search_name)
     {
         this.search_name = search_name;
 
     }









    public String getSearch_name() {
        return this.search_name;
    }

    public void setSearch_name(String search_name) {
        this.search_name = search_name;
    }

    @Override
    public String toString() {
        return "{" +
            " search_name='" + getSearch_name() + "'" +
            "}";
    }




}// end of Search