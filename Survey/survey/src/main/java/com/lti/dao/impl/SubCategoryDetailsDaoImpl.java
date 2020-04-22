package com.lti.dao.impl;

import java.util.List;

import com.lti.dao.ISubCategoryDetailsDao;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lti.models.AnswerDetails;
import com.lti.models.SubCategoryDetails;

@Repository
public class SubCategoryDetailsDaoImpl implements ISubCategoryDetailsDao {

	@PersistenceContext
	@Autowired
	private EntityManager entityManager;

	public SubCategoryDetailsDaoImpl() {

	}
	@Override
	public List<SubCategoryDetails> readAllSubCategoryDetails() {
		String jpql = "From SubCategoryDetails";
		TypedQuery<SubCategoryDetails> tquery = entityManager.createQuery(jpql, SubCategoryDetails.class);
		System.out.println(tquery);
		return tquery.getResultList();
	}

	@Override
	public void createSubCategoryDetails(SubCategoryDetails subCategoryDetails) {
		// TODO Auto-generated method stub
		
	}

}
