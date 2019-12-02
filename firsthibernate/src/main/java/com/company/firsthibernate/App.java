package com.company.firsthibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
       Configuration c=new Configuration();
       c.configure("hibernate.cfg.xml");
       
       SessionFactory sf=c.buildSessionFactory();
       Session s=sf.openSession();
       
       Product pro=new Product();
       
       pro.setId(1);
       pro.setName("samsung 32inch");
       pro.setPrice(23000);
       
       s.save(pro);
       
       Transaction t=s.beginTransaction();
       t.commit();
       System.out.println("saved successfully");
       
    }
}
