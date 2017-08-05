package com.artech.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;


import com.artech.model.User;

@Repository
public class LoginRepository {	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	public User verifyUser(User user) {
		System.out.println("Inside Repository");
		System.out.println(user.getEmail());
		System.out.println(user.getPassword());
		String email = user.getEmail();
		String pswd = user.getPassword();
		
		hibernateTemplate.saveOrUpdate(user);
			
		return user;
	}
}
