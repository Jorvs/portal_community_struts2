package com.community.interceptors;

import javax.print.event.PrintJobListener;

import com.community.actions.useractions.standardactions.accountmanagement.LoginAction;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

import org.apache.struts2.ServletActionContext;

import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;

public class LoginInterceptors implements Interceptor {

    @Override
    public void destroy() {
        // TODO Auto-generated method stub
            System.out.println("destroy() called");
    }

    @Override
    public void init() {
        // TODO Auto-generated method stub
        System.out.println("init() called");
    }

    @Override
    public String intercept(ActionInvocation invocation) throws Exception {
        // TODO Auto-generated method stub
        Object  user = ServletActionContext.getRequest().getSession().getAttribute("login_user");
        if(user == null)
        {
            if(invocation.getAction().getClass().equals(LoginAction.class)){
                return invocation.invoke();
            }
            return "input";
        }
        return invocation.invoke();
    }
    
}