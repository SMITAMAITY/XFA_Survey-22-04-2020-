package com.lti.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lti.models.CategoryDetails;
import com.lti.services.impl.CategoryDetailsServiceImpl;

@RestController
@CrossOrigin
public class CategoryDetailsController {
	@Autowired //how spring will know that it is a dependency
	private CategoryDetailsServiceImpl categoryDetailsServiceImpl;
	
	@RequestMapping(value ="/CategoryDetails", method = RequestMethod.GET)
	public List<CategoryDetails> getPlayers(){
		return categoryDetailsServiceImpl.findAllCategoryDetails();
	}
	
	@RequestMapping(value ="/CategoryDetails", method = RequestMethod.POST)
	public void savePlayer(@RequestBody CategoryDetails categoryDetails) {
		categoryDetailsServiceImpl.addCategoryDetails(categoryDetails);
	}
}
