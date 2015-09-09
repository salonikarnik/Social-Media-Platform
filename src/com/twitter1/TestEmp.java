package com.twitter1;


import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class TestEmp {

	public static void main(String[] args) throws ParseException {
		
		AnnotationConfiguration config = new AnnotationConfiguration();
		config.addAnnotatedClass(User.class);
		config.configure("hibernate.cfg.xml");
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		
		new SchemaExport(config).create(true, true);
		
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.getCurrentSession();
		
		session.beginTransaction();
		
		User dan = new User("Danny","Targ","dar@gmail.com","111",format.parse("1991-02-03"),"Male","Valley","Osle","Merryweather","23460");
		session.save(dan);
		
		User sally = new User("Sally","Adams","sally34@gmail.com","222",format.parse("1993-05-06"),"Female","Creek","Springs","YellowTown","43567");
		session.save(sally);
		
		User frodo = new User("Frodo","Baggins","frodo_b@gmail.com","333",format.parse("1994-06-13"),"Male","Ridge","Riverdale","RedBrick","98054");
		session.save(frodo);
		
		User daphne = new User("Daphne","Dane","daph3@gmail.com","444",format.parse("1997-11-23"),"Female","Sprightly","Springs","Kingsville","87567");
		session.save(daphne);
		
		User fred = new User("Fred","Jones","freddyhi@gmail.com","555",format.parse("1995-10-16"),"Male","Riverdale","Landville","Ramstand","68903");
		session.save(fred);
		
		session.getTransaction().commit();
		session.close();
	

	}

}
