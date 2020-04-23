package com.lti.services.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.IQuestionDetailsDao;
import com.lti.dao.impl.QuestionDetailsDaoImpl;
import com.lti.models.QuestionDetails;
import com.lti.repository.IQuestionDetailsRepository;
import com.lti.services.IQuestionDetailsService;

@Service
public class QuestionDetailsServiceImpl implements IQuestionDetailsService {

	@Autowired
	private IQuestionDetailsRepository iQuestionDetailsRepository;
	
	@Autowired
	private IQuestionDetailsDao dao;
	
	@Override
	public List<QuestionDetails> findAllQuestionDetails() {
		List<QuestionDetails> users = new ArrayList<>();
		iQuestionDetailsRepository.findAll().forEach(users::add);
		return users;
	}

	@Override
	public void addQuestionDetails(QuestionDetails questionDetails) {
		iQuestionDetailsRepository.save(questionDetails);
		
	}

	@Override
	public List<QuestionDetails> findAllQuestionDetailsByFirstCategory() {
		
		return dao.readQuestionDetailsByFirstCategory();
	}

	@Override
	public List<QuestionDetails> findAllQuestionDetailsBySecondCategory() {
		return dao.readQuestionDetailsBySecondCategory();
	}

	@Override
	public List<QuestionDetails> findAllQuestionDetailsByThirdCategory() {
		return dao.readQuestionDetailsByThirdCategory();
	}

	@Override
	public List<QuestionDetails> findAllQuestionDetailsByFourthCategory() {
		return dao.readQuestionDetailsByFourthCategory();
	}



//	@Override
//	public List<QuestionDetails> findAllQuestionDetailsByCategory(int categoryId) {
//		List<QuestionDetails> users = new ArrayList<>();
//		iQuestionDetailsRepository.findAll().forEach(users::add);
//		return users;
//	}
	
//	public QuestionDetails getPlayer(int id) {
//		Optional<QuestionDetails> optionalPlayer = iQuestionDetailsRepository.findById(id);
//			if(optionalPlayer.isPresent()) {
//				return optionalPlayer.get();
//			}
//		
//		return null;
//	}

}
