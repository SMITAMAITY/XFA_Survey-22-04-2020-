package com.lti.services;

import java.util.List;

import com.lti.models.SubCategoryDetails;

public interface ISubCategoryDetailsService {
	public  List<SubCategoryDetails> findAllSubCategoryDetails();
	
	
	public void addSubCategoryDetails(SubCategoryDetails subCategoryDetails);
}
