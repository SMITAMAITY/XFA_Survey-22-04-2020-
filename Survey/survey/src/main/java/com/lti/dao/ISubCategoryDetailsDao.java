package com.lti.dao;

import java.util.List;

import com.lti.models.SubCategoryDetails;

public interface ISubCategoryDetailsDao {
	//Select details
	public List<SubCategoryDetails> readAllSubCategoryDetails();


	//Insert details
	public void createSubCategoryDetails(SubCategoryDetails subCategoryDetails);
}
