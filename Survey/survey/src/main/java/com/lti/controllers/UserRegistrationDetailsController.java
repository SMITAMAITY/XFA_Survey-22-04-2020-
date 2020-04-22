package com.lti.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lti.models.UserRegistrationDetails;
import com.lti.services.impl.UserRegistrationDetailsServiceImpl;

@RestController
@CrossOrigin
public class UserRegistrationDetailsController {

	@Autowired //how spring will know that it is a dependency
	private UserRegistrationDetailsServiceImpl userRegistrationDetailsServiceImpl;
	
	@RequestMapping(value ="/UserRegistrationDetails", method = RequestMethod.GET)
	public List<UserRegistrationDetails> getPlayers(){
		return userRegistrationDetailsServiceImpl.findAllUserRegistrationDetails();
	}
	
	@RequestMapping(value ="/UserRegistrationDetails", method = RequestMethod.POST)
	public void savePlayer(@RequestBody UserRegistrationDetails userRegistrationDetails) {
		userRegistrationDetailsServiceImpl.addUserRegistrationDetails(userRegistrationDetails);
	}
}
