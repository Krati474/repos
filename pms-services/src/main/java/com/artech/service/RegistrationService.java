package com.artech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.artech.model.User;
import com.artech.repository.RegisterRepository;

@Service
public class RegistrationService {
	
	@Autowired
	private RegisterRepository regisRepo;
	
	
	public User validateUser(User user) {
		System.out.println("Inside UserService");
		System.out.println(user.getEmail());
		System.out.println(user.getPassword());
		regisRepo.verifyUser(user);
		return user;
	
	}
}
