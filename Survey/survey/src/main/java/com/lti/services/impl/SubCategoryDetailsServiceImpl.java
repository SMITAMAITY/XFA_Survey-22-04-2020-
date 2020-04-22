package com.lti.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.models.QuestionDetails;
import com.lti.models.SubCategoryDetails;
import com.lti.repository.IQuestionDetailsRepository;
import com.lti.repository.ISubCategoryDetailsRepository;
import com.lti.services.ISubCategoryDetailsService;

@Service
public class SubCategoryDetailsServiceImpl implements ISubCategoryDetailsService {

	@Autowired
	private ISubCategoryDetailsRepository iSubCategoryDetailsRepository;
	
	@Override
	public List<SubCategoryDetails> findAllSubCategoryDetails() {
		List<SubCategoryDetails> users = new ArrayList<>();
		iSubCategoryDetailsRepository.findAll().forEach(users::add);
		return users;
	}

	@Override
	public void addSubCategoryDetails(SubCategoryDetails subCategoryDetails) {
		iSubCategoryDetailsRepository.save(subCategoryDetails);
		
	}

}
