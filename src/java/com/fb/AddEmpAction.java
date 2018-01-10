/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fb;

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
public class AddEmpAction extends ActionSupport{

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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

private String name,email,password;

    /**
     *
     * @return
     * @throws java.lang.Exception
     */
    @Override
    public String execute() throws Exception{
          try{  Session s= HibernateUtil.getSessionFactory().openSession();

    
   Student s1=new Student(name,email,password); 
s.save(s1);
  s.beginTransaction().commit();
return SUCCESS;
}
catch(Exception e){

return ERROR;
}
    

}}