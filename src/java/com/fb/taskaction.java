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
public class taskaction extends ActionSupport {

    public String getTo_Do() {
        return To_Do;
    }

    public void setTo_Do(String To_Do) {
        this.To_Do = To_Do;
    }

    public String getDoing() {
        return doing;
    }

    public void setDoing(String doing) {
        this.doing = doing;
    }

    public String getDone() {
        return done;
    }

    public void setDone(String done) {
        this.done = done;
    }

    private String To_Do, doing, done, email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    

    /**
     *
     * @return @throws java.lang.Exception
     */
    @Override
    public String execute() throws Exception {
        try {
            Session s = HibernateUtil.getSessionFactory().openSession();
            Student s1 = (Student) s.get(Student.class, email);
            Task t1 = new Task(s1, To_Do, doing, done);

            s.save(t1);
            s.beginTransaction().commit();
            return SUCCESS;
        } catch (Exception e) {

            return ERROR;
        }

    }
}
