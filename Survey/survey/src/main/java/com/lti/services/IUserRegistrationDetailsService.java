package com.lti.services;

import java.util.List;

import com.lti.models.UserRegistrationDetails;

public interface IUserRegistrationDetailsService {
	public  List<UserRegistrationDetails> findAllUserRegistrationDetails();
	
	
	public void addUserRegistrationDetails(UserRegistrationDetails userRegistrationDetails);
}
