package com.twitter1;
/*import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;


public class TestFollowers extends TestEmp{

	public static void main(String[] args) {
		
		AnnotationConfiguration config = new AnnotationConfiguration();
		config.addAnnotatedClass(Tweets.class);
		config.configure("hibernate.cfg.xml");
		new SchemaExport(config).create(true, true);
		
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.getCurrentSession();
		
		session.beginTransaction();
		
		Followers dan = new Followers("dan","sally");
		session.save(dan);
		
		Followers dan2 = new Followers("dan","frodo");
		session.save(dan2);
		
		Followers sally = new Followers("sally","frodo");
		session.save(sally);
		
		Followers sally2 = new Followers("sally","daphne");
		session.save(sally2);
		
		Followers frodo = new Followers("frodo","sally");
		session.save(frodo);
		
		Followers frodo2 = new Followers("frodo","daphne");
		session.save(frodo2);
		
		Followers daphne = new Followers("daphne","fred");
		session.save(daphne);
		
		Followers fred = new Followers("fred","dan");
		session.save(fred);
		
		Followers fred2 = new Followers("fred","daphne");
		session.save(fred2);
		
		session.getTransaction().commit();
		session.close();

	}

}*/
