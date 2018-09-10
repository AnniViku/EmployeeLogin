package com.accenture.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.accenture.employeeBo.EmployeeDetails;
import com.accenture.employeeBo.EmployeeLogin;
import com.accenture.employeeCommand.EmployeeCommand;
import com.accenture.employeeService.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService service;

	@RequestMapping(value="/login.htm")
	public String employeeLogging(Model model,@ModelAttribute("empCmd") EmployeeCommand empCmd){
		return "login";
	}

	@RequestMapping(value="/login.htm",method=RequestMethod.POST)
	public String userLoging(Model model,@ModelAttribute("empCmd")EmployeeCommand empCmd){

		EmployeeLogin loginBo=null;

		//store form data to the command Object
		EmployeeCommand cmd=empCmd;
		
		loginBo=new EmployeeLogin();


		//copy the form data to the bo Object
		loginBo.setId(cmd.getId());
		loginBo.setUserName(cmd.getUserName());
		

		//call the service method
		String log=service.userLogin(loginBo);
		
		String result=loginBo.getUserName()+" with userId "+loginBo.getId()+"  "+log;
		Integer id=loginBo.getId();

		//add the attribute to the model
		model.addAttribute("result", result);
		model.addAttribute("id",id);


		return"home";
	}
	
	@RequestMapping(value="/personal.htm",method=RequestMethod.GET)
	public String processForm(Model model,@RequestParam("id") int id){
		
		System.out.println(id);
		EmployeeDetails details=service.fetchRow(id);
		model.addAttribute("details", details);
		
		return "personalProfile";
	}
	
	
}
