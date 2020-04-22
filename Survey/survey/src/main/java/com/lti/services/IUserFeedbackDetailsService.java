package com.lti.services;

import java.util.List;

import com.lti.models.UserFeedbackDetails;

public interface IUserFeedbackDetailsService {
	public  List<UserFeedbackDetails> findAllUserFeedbackDetails();
	
	
	public void addUserFeedbackDetails(UserFeedbackDetails userFeedbackDetails);
}
