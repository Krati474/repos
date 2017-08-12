package com.artech.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.artech.model.User;

@Component
public class RegisterValidatior implements Validator {

	public boolean supports(Class<?> clazz) {
		return User.class.isAssignableFrom(clazz);
	}

	public void validate(Object target, Errors errors) {
		User user = (User)target;
		/*
		errors.rejectValue("firstname", "error_1", null, "Please Enter FirstName");
		errors.rejectValue("lastname", "error_1", null, "Please Enter LastName");
		errors.rejectValue("email", "error_1", null, "Please Enter Email");
		errors.rejectValue("password", "error_1", null, "Please Enter Password");*/
		
		ValidationUtils.rejectIfEmpty(errors, "firstname", "error_1", "Please Enter First Name");
		ValidationUtils.rejectIfEmpty(errors, "lastname", "error_2", "Please Enter Last Name");
		ValidationUtils.rejectIfEmpty(errors, "email", "error_3", "Please Enter Email");
		ValidationUtils.rejectIfEmpty(errors, "password", "error_4", "Please Enter Password");
		
		/*if(user.getEmail() != null && user.getEmail().trim().length() > 0) {
			
		}*/
		
	}

}
