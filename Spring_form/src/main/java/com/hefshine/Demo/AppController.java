package com.hefshine.Demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {

	
	
	@RequestMapping("/")
	public String getBaseFile(Model m)
	
	{
		m.addAttribute("student",new Student() );
		return "enterStudentInfo.jsp";
	}
	
	@RequestMapping("abcd")
	public String readStudentData(@ModelAttribute Student s, Model m) 
	{
		m.addAttribute("Student", s);
		
		return "displayStudentInfo.jsp";
	}
	
	
	
	
}
