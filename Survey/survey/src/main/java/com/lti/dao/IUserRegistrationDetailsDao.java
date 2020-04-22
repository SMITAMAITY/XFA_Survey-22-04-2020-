package com.lti.dao;

import java.util.List;

import com.lti.models.UserRegistrationDetails;

public interface IUserRegistrationDetailsDao {
	//Select details
	public List<UserRegistrationDetails> readAllUserRegistrationDetails();


	//Insert details
	public void createUserRegistrationDetails(UserRegistrationDetails userRegistrationDetails);
}
