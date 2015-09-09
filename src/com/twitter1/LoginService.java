package com.twitter1;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import com.sun.jersey.spi.dispatch.RequestDispatcher;

@Path("/LoginService")
public class LoginService extends HttpServlet{

	@POST
	@Produces(javax.ws.rs.core.MediaType.TEXT_HTML)
	public static String display(@FormParam("email") String email, @FormParam("password") String password)
	{
		  AnnotationConfiguration config = new AnnotationConfiguration();
		  
		  config.addAnnotatedClass(User.class);
		  SessionFactory factory= config.configure().buildSessionFactory();
		  
		  Session session = factory.getCurrentSession();
		  session.beginTransaction();
		  
		  String queryString = "from User where email = :email";
		  
		  org.hibernate.Query query = session.createQuery(queryString);
		  
		  query.setString("email", email);
		  Object queryResult = query.uniqueResult();
		  User user = (User)queryResult;
		  session.getTransaction().commit();
		  
		  //HttpSession httpSession = new HttpServletRequest().getSession();
		  
		  if(user == null)
		  {
			  return "<meta http-equiv=" + "refresh" + "content=" + "0; url=http://localhost:8080/Twitter/index.jsp" + " />";
		  }
		  
		  else
			  return "<p>Valid User</p>"; 
	}
}
