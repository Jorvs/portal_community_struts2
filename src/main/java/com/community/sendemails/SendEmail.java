package com.community.sendemails;

import java.util.Properties;
import java.util.Random;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import com.community.bean.usersbean.ResetPasswordBean;
import com.community.dao.usersdao.standardao.UserMgmtDao;

import org.apache.struts2.components.Password;

public class SendEmail {
    

    public String generateCode(){

        Random rnd = new Random();
        int code = rnd.nextInt(999999);

        

        return String.format("%06d", code);
       
        

        
    }// end fo genetateCode


    public boolean sendEmailForReset(ResetPasswordBean ResetPasswordBean){
        boolean test = false;

       final String fromEmail = "CommunityPortalJobs@gmail.com";
       final String emailpassword = "Yeah123456";
       String generated_code = generateCode(); 
       System.out.println( generated_code);

      


       String to_email_Address = ResetPasswordBean.getEmail_Address(); // where your gona send the email
       

        try {


       
            
            Properties prop = new Properties();


           


            prop.put("mail.smtp.auth", "true");
			prop.put("mail.smtp.starttls.enable", "true");
			prop.put("mail.smtp.host", "smtp.gmail.com");
			prop.put("mail.smtp.port", "587");





            System.out.println("form sendEmai.java print the vale of fromEmail = " + fromEmail );
            System.out.println("to sendEmai.java print the vale of emailpassword = " + emailpassword );
            System.out.println("to sendEmai.java print the vale of ToEmail  = " + to_email_Address );



            Session sess = Session.getInstance(prop,  new Authenticator(){  
                @Override
                protected PasswordAuthentication getPasswordAuthentication(){
                     return new PasswordAuthentication(fromEmail, emailpassword); 
                } 

            });

            Message mesg = new MimeMessage(sess);

            mesg.setFrom(new InternetAddress(fromEmail));
            mesg.setRecipient(Message.RecipientType.TO, new InternetAddress(to_email_Address));
            

            mesg.setSubject("user reset password verfication");
            mesg.setText("your temporary password is = " + generated_code );
            System.out.println("The generated code from the that is going to be send is = " + generated_code );
            UserMgmtDao.insertResetPassword(to_email_Address, generated_code);

            // Transport transport = sess.getTransport("smtps");

            Transport.send(mesg);

            test = true;

            } catch (Exception e) {
            e.printStackTrace();
        }




        return test;

    }// end pf sendEmailForReset



    public boolean sendEmailForAccountVerication(ResetPasswordBean ResetPasswordBean){
        boolean test = false;

       final String fromEmail = "CommunityPortalJobs@gmail.com";
       final String emailpassword = "Yeah123456";
       String generated_code = generateCode(); 
       System.out.println( generated_code);

      


       String to_email_Address = ResetPasswordBean.getEmail_Address(); // where your gona send the email
       

        try {


       
            
            Properties prop = new Properties();


           


            prop.put("mail.smtp.auth", "true");
			prop.put("mail.smtp.starttls.enable", "true");
			prop.put("mail.smtp.host", "smtp.gmail.com");
			prop.put("mail.smtp.port", "587");





            System.out.println("form sendEmai.java print the vale of fromEmail = " + fromEmail );
            System.out.println("to sendEmai.java print the vale of emailpassword = " + emailpassword );
            System.out.println("to sendEmai.java print the vale of ToEmail  = " + to_email_Address );



            Session sess = Session.getInstance(prop,  new Authenticator(){  
                @Override
                protected PasswordAuthentication getPasswordAuthentication(){
                     return new PasswordAuthentication(fromEmail, emailpassword); 
                } 

            });

            Message mesg = new MimeMessage(sess);

            mesg.setFrom(new InternetAddress(fromEmail));
            mesg.setRecipient(Message.RecipientType.TO, new InternetAddress(to_email_Address));
            

            mesg.setSubject("code Verfication account activation");
            mesg.setText(" thanks your for regestering your verfication code to activate: =" + generated_code );
            System.out.println("The generated code from the that is going to be send is = " + generated_code );
            UserMgmtDao.sendEmailForAccountVerication(to_email_Address, generated_code);// inserts the code or data to the database

            // Transport transport = sess.getTransport("smtps");

            Transport.send(mesg);

            test = true;

            } catch (Exception e) {
            e.printStackTrace();
        }




        return test;

    }// end pf sendEmailForReset

  


    


}// end of class file
