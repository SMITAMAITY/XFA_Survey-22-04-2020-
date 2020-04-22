package com.lti.dao.impl;

import java.util.List;

import com.lti.dao.IUserFeedbackDetailsDao;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lti.models.AnswerDetails;
import com.lti.models.UserFeedbackDetails;

@Repository
public class UserFeedbackDetailsDaoImpl implements IUserFeedbackDetailsDao {
	@PersistenceContext
	@Autowired
	private EntityManager entityManager;

	public UserFeedbackDetailsDaoImpl() {

	}
	@Override
	public List<UserFeedbackDetails> readAllUserFeedbackDetails() {
		String jpql = "From UserFeedbackDetails";
		TypedQuery<UserFeedbackDetails> tquery = entityManager.createQuery(jpql, UserFeedbackDetails.class);
		System.out.println(tquery);
		return tquery.getResultList();
	}

	@Override
	public void createUserFeedbackDetails(UserFeedbackDetails userFeedbackDetails) {
		// TODO Auto-generated method stub
		
	}

}
