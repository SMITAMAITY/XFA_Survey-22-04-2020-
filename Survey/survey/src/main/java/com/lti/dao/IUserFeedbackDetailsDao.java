package com.lti.dao;

import java.util.List;

import com.lti.models.UserFeedbackDetails;

public interface IUserFeedbackDetailsDao {
	//Select details
	public List<UserFeedbackDetails> readAllUserFeedbackDetails();


	//Insert details
	public void createUserFeedbackDetails(UserFeedbackDetails userFeedbackDetails);
}
