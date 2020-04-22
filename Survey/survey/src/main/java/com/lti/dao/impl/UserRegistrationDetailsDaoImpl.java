package com.lti.dao.impl;

import java.util.List;

import com.lti.dao.IUserRegistrationDetailsDao;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lti.models.AnswerDetails;
import com.lti.models.UserRegistrationDetails;

@Repository
public class UserRegistrationDetailsDaoImpl implements IUserRegistrationDetailsDao {
	@PersistenceContext
	@Autowired
	private EntityManager entityManager;

	public UserRegistrationDetailsDaoImpl() {

	}
	@Override
	public List<UserRegistrationDetails> readAllUserRegistrationDetails() {
		String jpql = "From UserRegistrationDetails";
		TypedQuery<UserRegistrationDetails> tquery = entityManager.createQuery(jpql, UserRegistrationDetails.class);
		System.out.println(tquery);
		return tquery.getResultList();
	}

	@Override
	public void createUserRegistrationDetails(UserRegistrationDetails userRegistrationDetails) {
		// TODO Auto-generated method stub
		
	}

}
