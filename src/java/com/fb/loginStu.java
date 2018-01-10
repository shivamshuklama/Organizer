/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fb;

import static com.opensymphony.xwork2.Action.ERROR;
import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
//import static javassist.CtMethod.ConstParameter.string;
//import net.sf.ehcache.hibernate.HibernateUtil;
import org.hibernate.Hibernate;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts2.ServletActionContext;
/**
 *
 * @author Shivam_Shukla <shivam_shukla at find_a_job.in>
 */
public class loginStu extends ActionSupport{

   

 

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

private String email,password;

    /**
     *
     * @return
     * @throws java.lang.Exception
     */
    @Override
    public String execute() throws Exception{
       
        int i=0;
          try{  Session s= HibernateUtil.getSessionFactory().openSession();
Student s1=(Student)s.get(Student.class,email);


    if(s1.getPassword().equals(password)){
        return SUCCESS;
        
    }
    else{
        return ERROR;
    }



}
catch(Exception e){
return SUCCESS;
}
 

}}