package spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import spring.mvc.entity.User;

@Controller
public class ContactController {
	
	/*
	using @ModelAttribute at method level
	The @ModelAttribute annotation can also be used at the class level,
	where it applies to all the handler methods within the controller. 
	This can be useful for defining common model attributes across multiple request mappings. 
	These data will present in all the jsp pages.
	*/
	
	@ModelAttribute
	public void commonForAllMethod(Model model) {
		model.addAttribute("header", "The Businesss Strory");
		model.addAttribute("slogan", "Be Rich");
	}
	
	
	@RequestMapping("/contact")
	public String form() {
		return "conatct";
	}
	
	// ------------------- Using @RrequestParam -------------------------
/*
	@RequestMapping(path="contactForm", method = RequestMethod.POST)
	public String getForm(@RequestParam("email") String email, 
						@RequestParam("name") String name,
						@RequestParam("password") String password,
						@RequestParam(name="check", required=false) String check,
						Model model){

		model.addAttribute("userName", name);
		model.addAttribute("userEmail", email);
		model.addAttribute("password",  password);
		
		return "home";
	}
	
*/	
	
// ------------ USING MODEL WITH OBJECT ----------------------------	
	
/*
	@RequestMapping(path="contactForm", method = RequestMethod.POST)
	public String getForm(@RequestParam("email") String email, 
						@RequestParam("name") String name,
						@RequestParam("password") String password,
						@RequestParam(name="check", required=false) String check,
						Model model){

		User user = new User();
		user.setName(name);
		user.setEmail(email);
		user.setPassword(name);
	
		model.addAttribute("user", user);
		
		return "home";
	}
	
*/
	
//   ----------------  USING @ModelAttribute -------------------------------
	//  used to bind method parameters or method return values to model attributes.
	//It is typically used in Spring MVC applications to handle form data and populate model attributes.
	
	// using @ModelAttribute at method level
	@RequestMapping(path="contactForm", method = RequestMethod.POST)
	public String getForm(@ModelAttribute("user") User user, Model model){

		// performing ops
		return "home";
	}
	
	
}
