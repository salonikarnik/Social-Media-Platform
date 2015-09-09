package com.twitter1;
import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.servlet.ModelAndView;
//import org.springframework.ui.ModelMap;

@Controller
public class UserController {

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {
	   return "login";
	   }

	@RequestMapping(value = "/uservalidation/{email}/{password}", method = RequestMethod.POST)
	public String user() {
	   return "success";
	   }
}





