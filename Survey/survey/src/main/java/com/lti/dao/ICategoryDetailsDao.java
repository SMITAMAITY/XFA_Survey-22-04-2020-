package com.lti.dao;

import java.util.List;

import com.lti.models.CategoryDetails;

public interface ICategoryDetailsDao {
	//Select details
	public List<CategoryDetails> readAllCategoryDetails();
	
	
	//Insert details
	public void createCategoryDetails(CategoryDetails categoryDetails);
}
