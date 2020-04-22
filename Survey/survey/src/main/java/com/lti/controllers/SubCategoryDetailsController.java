package com.lti.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lti.models.SubCategoryDetails;
import com.lti.services.impl.SubCategoryDetailsServiceImpl;

@RestController
@CrossOrigin
public class SubCategoryDetailsController {
	@Autowired //how spring will know that it is a dependency
	private SubCategoryDetailsServiceImpl subCategoryDetailsServiceImpl;
	
	@RequestMapping(value ="/SubCategoryDetails", method = RequestMethod.GET)
	public List<SubCategoryDetails> getPlayers(){
		return subCategoryDetailsServiceImpl.findAllSubCategoryDetails();
	}
	
	@RequestMapping(value ="/SubCategoryDetails", method = RequestMethod.POST)
	public void savePlayer(@RequestBody SubCategoryDetails subCategoryDetails) {
		subCategoryDetailsServiceImpl.addSubCategoryDetails(subCategoryDetails);
	}
}
