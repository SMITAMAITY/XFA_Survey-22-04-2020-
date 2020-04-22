package com.lti.services;

import java.util.List;

import com.lti.models.CategoryDetails;

public interface ICategoryDetailsService {

	public  List<CategoryDetails> findAllCategoryDetails();
	
	
	public void addCategoryDetails(CategoryDetails categoryDetails);
}
