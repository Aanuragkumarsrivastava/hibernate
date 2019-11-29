package pack1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Client {

	public static void main(String[] args)
	{
		Configuration c=new Configuration();
		c.configure("hibernate.cfg.xml");
		
		SessionFactory sf=c.buildSessionFactory();
		
		Session s=sf.openSession();
		
		Product p=new Product();
		
		p.setId(3);
		p.setName("samsung 40inch");
		p.setPrice(40000);
		
		
		Transaction t=s.beginTransaction();
		
		s.save(p);
		
		t.commit();
		

	}

}
