package spring.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import spring.mvc.entity.User;
import spring.mvc.service.UserService;

@Controller
public class UserContoller {

	@Autowired
	private UserService service;
	
	@RequestMapping(path ="user", method=RequestMethod.POST)	
	public String formData(@ModelAttribute("user") User user, Model model) {
		this.service.saveUser(user); 
		return "index";
	}
}
