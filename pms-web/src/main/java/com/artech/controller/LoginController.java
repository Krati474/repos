package com.artech.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.artech.model.User;
import com.artech.service.LoginService;

@Controller
public class LoginController {
	
	@Autowired
	private LoginService loginserv;
	
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String showLogin(Map<String, Object> map) {
		System.out.println("inside Login Controller");
		map.put("User", new User());
		return "login";
	}
	@RequestMapping(value = "/servelogin", method = RequestMethod.POST)
	public String checkLogin(@ModelAttribute("User") User usr,  Map<String, Object> map) {
		System.out.println("inside LoginCheck method of Login Controller");
		map.put("UserLogin", new User());
		System.out.println(usr.getEmail());
		System.out.println(usr.getPassword());
		loginserv.validateUser(usr);
		return "login";
	}

}
