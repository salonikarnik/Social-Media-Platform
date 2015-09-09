package com.twitter1;
/*import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;


public class TestTweets {

	public static void main(String[] args) throws ParseException {
		AnnotationConfiguration config = new AnnotationConfiguration();
		config.addAnnotatedClass(Tweets.class);
		config.configure("hibernate.cfg.xml");
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		new SchemaExport(config).create(true, true);
		
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.getCurrentSession();
		
		session.beginTransaction();
		
		Tweets dan = new Tweets("Well played game",format.parse("2015-01-10 00:20:01"));
		session.save(dan);
		
		Tweets sally = new Tweets("Lovely Day Outside :)",format.parse("2015-02-03 12:10:30"));
		session.save(sally);
		
		Tweets frodo = new Tweets("Excited! :D",format.parse("2015-03-25 00:20:01"));
		session.save(frodo);
		
		Tweets daphne = new Tweets("Waiting for next episode of Arrow",format.parse("2015-04-18 00:20:01"));
		session.save(daphne);
		
		Tweets fred = new Tweets("Good night everyone! :)",format.parse("2015-04-11 00:20:01"));
		session.save(fred);
		
		session.getTransaction().commit();
		session.close();
	}

}*/
