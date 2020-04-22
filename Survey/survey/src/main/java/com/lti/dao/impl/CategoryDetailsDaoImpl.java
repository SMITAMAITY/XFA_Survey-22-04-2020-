package com.lti.dao.impl;

import java.util.List;

import com.lti.dao.ICategoryDetailsDao;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lti.models.AnswerDetails;
import com.lti.models.CategoryDetails;

@Repository
public class CategoryDetailsDaoImpl implements ICategoryDetailsDao {

	@PersistenceContext
	@Autowired
	private EntityManager entityManager;

	public CategoryDetailsDaoImpl() {

	}
	@Override
	public List<CategoryDetails> readAllCategoryDetails() {
		String jpql = "From CategoryDetails";
		TypedQuery<CategoryDetails> tquery = entityManager.createQuery(jpql, CategoryDetails.class);
		System.out.println(tquery);
		return tquery.getResultList();
	}

	@Override
	public void createCategoryDetails(CategoryDetails categoryDetails) {
		// TODO Auto-generated method stub
		
	}

}
