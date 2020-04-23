package com.lti.services;

import java.util.List;

import com.lti.models.QuestionDetails;

public interface IQuestionDetailsService {
	public  List<QuestionDetails> findAllQuestionDetails();
	
	
	public void addQuestionDetails(QuestionDetails questionDetails);
	
	


	 public List<QuestionDetails> findAllQuestionDetailsByFirstCategory();
	 public List<QuestionDetails> findAllQuestionDetailsBySecondCategory();
	 public List<QuestionDetails> findAllQuestionDetailsByThirdCategory();
	 public List<QuestionDetails> findAllQuestionDetailsByFourthCategory();
}
