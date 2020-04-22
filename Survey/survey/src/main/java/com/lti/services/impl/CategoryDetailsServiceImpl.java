package com.lti.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.models.AnswerDetails;
import com.lti.models.CategoryDetails;
import com.lti.repository.IAnswerDetailsRepository;
import com.lti.repository.ICategoryDetailsRepository;
import com.lti.services.ICategoryDetailsService;

@Service
public class CategoryDetailsServiceImpl implements ICategoryDetailsService {

	@Autowired
	private ICategoryDetailsRepository iCategoryDetailsRepository;
	
	@Override
	public List<CategoryDetails> findAllCategoryDetails() {
		List<CategoryDetails> users = new ArrayList<>();
		iCategoryDetailsRepository.findAll().forEach(users::add);
		return users;
	}

	@Override
	public void addCategoryDetails(CategoryDetails categoryDetails) {
		iCategoryDetailsRepository.save(categoryDetails);
		
	}

}
