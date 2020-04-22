package com.lti.repository;

import java.util.Locale.Category;

import org.springframework.data.repository.CrudRepository;

import com.lti.models.CategoryDetails;


public interface CategoryDetailsRepository extends CrudRepository<CategoryDetails, Integer> {

}
