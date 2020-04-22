package com.lti.dao.impl;

import java.util.List;

import com.lti.dao.IQuestionDetailsDao;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lti.models.AnswerDetails;
import com.lti.models.QuestionDetails;

@Repository
public class QuestionDetailsDaoImpl implements IQuestionDetailsDao {

	@PersistenceContext
	@Autowired
	private EntityManager entityManager;

	public QuestionDetailsDaoImpl() {

	}
	@Override
	public List<QuestionDetails> readAllQuestionDetails() {
		String jpql = "From QuestionDetails";
		TypedQuery<QuestionDetails> tquery = entityManager.createQuery(jpql, QuestionDetails.class);
		System.out.println(tquery);
		return tquery.getResultList();
	}

	@Override
	public void createQuestionDetails(QuestionDetails questionDetails) {
		// TODO Auto-generated method stub
		
	}

}
