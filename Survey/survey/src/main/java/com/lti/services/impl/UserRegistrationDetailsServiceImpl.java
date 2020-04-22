package com.lti.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.models.SubCategoryDetails;
import com.lti.models.UserRegistrationDetails;
import com.lti.repository.IUserRegistrationDetailsRepository;
import com.lti.services.IUserRegistrationDetailsService;

@Service
public class UserRegistrationDetailsServiceImpl implements IUserRegistrationDetailsService {

	@Autowired
	private IUserRegistrationDetailsRepository iUserRegistrationDetailsRepository;

	@Override
	public List<UserRegistrationDetails> findAllUserRegistrationDetails() {
		List<UserRegistrationDetails> users = new ArrayList<>();
		iUserRegistrationDetailsRepository.findAll().forEach(users::add);
		return users;
	}

	@Override
	public void addUserRegistrationDetails(UserRegistrationDetails userRegistrationDetails) {
		iUserRegistrationDetailsRepository.save(userRegistrationDetails);
		
		
	}
	


}
