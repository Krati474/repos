package com.artech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.artech.model.User;
import com.artech.repository.LoginRepository;

@Service
public class LoginService {
	@Autowired
	private LoginRepository loginRepo;
	
	public User validateUser(User user) {
		System.out.println("Inside UserService");
		System.out.println(user.getEmail());
		System.out.println(user.getPassword());
		loginRepo.verifyUser(user);
		return user;
	
	}
}
