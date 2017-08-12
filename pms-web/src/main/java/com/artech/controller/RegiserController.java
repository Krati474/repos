package com.artech.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.maven.model.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.artech.model.User;
import com.artech.service.RegistrationService;
import com.artech.validator.RegisterValidatior;

@Controller
public class RegiserController {
	
	@Autowired 
	private RegistrationService regServ;
	
	
	@Autowired
	private RegisterValidatior regisvalid;
	
	
	@RequestMapping(value="/register", method = RequestMethod.GET)
	public String showLogin(Map<String, Object> map) {
		System.out.println("inside Registration Controller");
		map.put("User", new User());
		return "register";
	}
	
	@RequestMapping(value = "/serveRegister", method = RequestMethod.POST)
	public String checkRegister(@ModelAttribute("User") User user,  Map<String, Object> map, BindingResult result) {
		System.out.println("inside Registration check  method of Registration Controller");
		/*if(user != null && !user.equals(null)) {*/
		
			regisvalid.validate(user, result);
			System.out.println("returned from validation");	
			
			if(result.hasErrors()) {
				System.out.println("has Errors");
				return "register";
				
			}else {
				map.put("User", new User());
				System.out.println(user.getEmail());
				System.out.println(user.getPassword());
				regServ.validateUser(user);
				return "register";
			}		
		
	}

}
