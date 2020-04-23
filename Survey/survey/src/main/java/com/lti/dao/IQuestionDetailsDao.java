package com.lti.dao;

import java.util.List;

import com.lti.models.QuestionDetails;

public interface IQuestionDetailsDao {
	
//Select details
public List<QuestionDetails> readAllQuestionDetails();


//Insert details
public void createQuestionDetails(QuestionDetails questionDetails);

public List<QuestionDetails> readQuestionDetailsByFirstCategory();
public List<QuestionDetails> readQuestionDetailsBySecondCategory();
public List<QuestionDetails> readQuestionDetailsByThirdCategory();
public List<QuestionDetails> readQuestionDetailsByFourthCategory();

}