package com.lti.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lti.models.QuestionDetails;
import com.lti.services.impl.QuestionDetailsServiceImpl;

@RestController
@CrossOrigin
public class QuestionDetailsController {
	@Autowired //how spring will know that it is a dependency
	private QuestionDetailsServiceImpl questionDetailsServiceImpl;
	
	@RequestMapping(value ="/QuestionDetails", method = RequestMethod.GET)
	public List<QuestionDetails> getQuestionDetails(){
		return questionDetailsServiceImpl.findAllQuestionDetails();
	}
	
	@RequestMapping(value ="/QuestionDetails", method = RequestMethod.POST)
	public void savePlayer(@RequestBody QuestionDetails questionDetails) {
		questionDetailsServiceImpl.addQuestionDetails(questionDetails);
	}
	
	
	@RequestMapping(value ="/QuestionDetails/EndUserDevice", method = RequestMethod.GET)
	public List<QuestionDetails> getQuestionDetailsByFirstCategory(){
		return questionDetailsServiceImpl.findAllQuestionDetailsByFirstCategory();
	}
	
	@RequestMapping(value ="/QuestionDetails/Collaboration", method = RequestMethod.GET)
	public List<QuestionDetails> getQuestionDetailsBySecondCategory(){
		return questionDetailsServiceImpl.findAllQuestionDetailsBySecondCategory();
	}
	@RequestMapping(value ="/QuestionDetails/SmartService", method = RequestMethod.GET)
	public List<QuestionDetails> getQuestionDetailsByThirdCategory(){
		return questionDetailsServiceImpl.findAllQuestionDetailsByThirdCategory();
	}
	@RequestMapping(value ="/QuestionDetails/SecureConnectivity", method = RequestMethod.GET)
	public List<QuestionDetails> getQuestionDetailsByFouthCategory(){
		return questionDetailsServiceImpl.findAllQuestionDetailsByFourthCategory();
	}
	
	
//	@RequestMapping(value ="/QuestionDetails/{id}")
//	public QuestionDetails getPlayerById(@PathVariable int id) {
//		return questionDetailsServiceImpl.getPlayer(id);
//	}
}
