package pack1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Deleteop {

	public static void main(String[] args)
	{
		Configuration c=new Configuration();
		c.configure();
		
		SessionFactory sf=c.buildSessionFactory();
		
		Session s=sf.openSession();
		
		Transaction t=s.beginTransaction();
		
		Product p=(Product)s.get(Product.class,102);
		
		if(p!=null)
		{
		s.delete(p);
		}
		t.commit();
		
	}
}
