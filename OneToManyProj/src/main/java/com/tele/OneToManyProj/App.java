package com.tele.OneToManyProj;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Configuration con=new Configuration().configure().addAnnotatedClass(Teacher.class);
        Configuration con1=new Configuration().configure().addAnnotatedClass(Courses.class);
        
        SessionFactory ss=con.buildSessionFactory();
        Session s=ss.openSession();
        Courses c=new Courses();
        c.setCourse_id(01);
        c.setName("java");
        
        Courses c1=new Courses();
        c1.setCourse_id(02);
        c1.setName("Angular");
        
        Courses c2=new Courses();
        c2.setCourse_id(03);
        c2.setName("Hibernate");
        
        Teacher t1=new Teacher();
        t1.setName("Mrudala");
        t1.setT_id(01);
        t1.getCourses().add(c);
        t1.getCourses().add(c1);
        t1.getCourses().add(c2);
       
       
       Transaction t=s.beginTransaction();
       s.save(t1);
       t.commit();
       s.close();
       }
}
