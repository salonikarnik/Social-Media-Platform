import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;


public class TestAll {

	public static void main(String[] args) throws ParseException 
	{
		AnnotationConfiguration config = new AnnotationConfiguration();
		config.addAnnotatedClass(User.class);
		config.addAnnotatedClass(Tweets.class);
		config.addAnnotatedClass(Followers.class);
		config.addAnnotatedClass(Following.class);
		config.configure("hibernate.cfg.xml");
		
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat formatTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:SS");	
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
		
		
		
		Tweets dan1 = new Tweets("Well played game",formatTime.parse("2015-01-10 02:20:01"),"dan");
		session.save(dan1);
		
		Tweets sally1 = new Tweets("Lovely Day Outside :)",formatTime.parse("2015-02-03 12:10:30"),"sally");
		session.save(sally1);
		
		Tweets frodo1 = new Tweets("Excited! :D",formatTime.parse("2015-03-25 03:20:01"),"frodo");
		session.save(frodo1);
		
		Tweets daphne1 = new Tweets("Waiting for next episode of Arrow",formatTime.parse("2015-04-18 09:20:01"),"daphne");
		session.save(daphne1);
		
		Tweets fred1 = new Tweets("Good night everyone! :)",formatTime.parse("2015-04-11 10:20:01"),"fred");
		session.save(fred1);
		
		Followers dan2= new Followers("dan","sally");
		session.save(dan2);
		Followers dan3= new Followers("dan","daphne");
		session.save(dan3);
		Followers dan4= new Followers("dan","fred");
		session.save(dan4);
		
		Followers sally2= new Followers("sally","frodo");
		session.save(sally2);
		Followers sally3= new Followers("sally","fred");
		session.save(sally3);
		
		Followers fred2= new Followers("fred","daphne");
		session.save(fred2);
		Followers fred3= new Followers("fred","frodo");
		session.save(fred3);
		Followers daphne4= new Followers("daphne","fred");
		session.save(daphne4);
		
		Followers daphne5= new Followers("daphne","sally");
		session.save(daphne5);
		Followers frodo2= new Followers("frodo","dan");
		session.save(frodo2);
		
		Following dan5=new Following("dan","sally");
		session.save(dan5);
		Following dan6=new Following("dan","fred");
		session.save(dan6);
		Following dan7=new Following("dan","daphne");
		session.save(dan7);
		Following dan8=new Following("dan","frodo");
		session.save(dan8);
		
		Following sally4=new Following("sally","fred");
		session.save(sally4);
		Following sally5=new Following("sally","daphne");
		session.save(sally5);
		
		Following frodo5=new Following("frodo","fred");
		session.save(frodo5);
		Following frodo6=new Following("frodo","sally");
		session.save(frodo6);
		
		session.getTransaction().commit();
		session.close();

	}

}
