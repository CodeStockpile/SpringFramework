package spring.mvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import spring.mvc.entity.Business;

@Controller
public class SendDataController {

	
/*
 * ---------------- using Model ----------------
 * 
 * */	
	@RequestMapping(path= "/users", method=RequestMethod.GET)
	public String sednData(Model model) {
	
		// Syntax
//		model(String, Object);  
		model.addAttribute("name","Surjeet");
		model.addAttribute("work", "No");
		
		
		List<String> user = new ArrayList<String>();
		user.add("Allen");
		user.add("Poli");
		user.add("koli");
		
		model.addAttribute("users", user);
		
		return "users";
	}
	
/*
 *  ------------------ using ModelAndView -------------------------------
 */
	
	@RequestMapping("mv")
	public ModelAndView mvData() {
		
		Business bsn = new  Business();
		bsn.setId(9);
		bsn.setAge(1);
		bsn.setName("Education");
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("users");   // setting the jsp page to render for data
		
		mv.addObject("business", bsn);
		
		return mv;
	}
	
	
}
