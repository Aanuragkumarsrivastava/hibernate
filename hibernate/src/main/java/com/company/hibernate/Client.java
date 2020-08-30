package com.company.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Client 
{

	public static void main(String[] args)
	{
		Configuration c=new Configuration();
		
		c.configure();
		
		@SuppressWarnings("deprecation")
		SessionFactory sf=c.buildSessionFactory();
		
		Session s=sf.openSession();
		
		Transaction t=s.beginTransaction();
		
		College obj=new College();
		obj.setCollegename("Oxford");
		obj.setCity("London");
		
		s.save(obj);
		t.commit();
		sf.close();

	}

}
