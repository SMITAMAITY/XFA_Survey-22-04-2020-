package com.lti.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lti.dao.IQuestionDetailsDao;
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

//	@Override
//	public List<QuestionDetails> readQuestionDetailsByFirstCategory(int categoryId) {
//		String jpql = "select c from CategoryDetails c where categoryId=1";
//		
//		
//		
////		String jpql ="select  "
////				+ "q.questionDescription, a.answerDescription\r\n" + 
////				"from\r\n" + 
////				"CategoryDetails c join SubCategoryDetails s "
////				+ "join QuestionDetails q join AnswerDetails a\r\n" + 
////				"on\r\n" + 
////				"c.categoryId = s.category_id"
////				+ " and a.question_id = q.questionId "
////				+ "and s.subCategoryId = q.subCategory_id where c.categoryId = 1";
//		
//
//		Query tquery = entityManager.createQuery(jpql, QuestionDetails.class);
////		tquery.setParameter(1, categoryId);
//		
//		System.out.println(tquery);
//		return tquery.getResultList();
//		
//		
//
//	}
	
	
	@Override
	public List<QuestionDetails> readQuestionDetailsByFirstCategory() {
		String jpql = "From CategoryDetails where categoryId = 1";
		Query tquery = entityManager.createQuery(jpql);
		System.out.println(tquery);
		return tquery.getResultList();
	}
//	@Override
//	public List<QuestionDetails> readQuestionDetailsBySecondCategory() {
//		String jpql = "From QuestionDetails";
//		TypedQuery<QuestionDetails> tquery = entityManager.createQuery(jpql, QuestionDetails.class);
//		System.out.println(tquery);
//		return tquery.getResultList();
//	}
//	@Override
//	public List<QuestionDetails> readQuestionDetailsByThirdCategory() {
//		String jpql = "From QuestionDetails";
//		TypedQuery<QuestionDetails> tquery = entityManager.createQuery(jpql, QuestionDetails.class);
//		System.out.println(tquery);
//		return tquery.getResultList();
//	}
//	@Override
//	public List<QuestionDetails> readQuestionDetailsByFourthCategory() {
//		String jpql = "From QuestionDetails";
//		TypedQuery<QuestionDetails> tquery = entityManager.createQuery(jpql, QuestionDetails.class);
//		System.out.println(tquery);
//		return tquery.getResultList();
//	}
	@Override
	public List<QuestionDetails> readQuestionDetailsBySecondCategory() {
		String jpql = "From CategoryDetails where categoryId = 2";
		Query tquery = entityManager.createQuery(jpql);
		System.out.println(tquery);
		return tquery.getResultList();
	}
	@Override
	public List<QuestionDetails> readQuestionDetailsByThirdCategory() {
		String jpql = "From CategoryDetails where categoryId = 3";
		Query tquery = entityManager.createQuery(jpql);
		System.out.println(tquery);
		return tquery.getResultList();
	}
	@Override
	public List<QuestionDetails> readQuestionDetailsByFourthCategory() {
		String jpql = "From CategoryDetails where categoryId = 4";
		Query tquery = entityManager.createQuery(jpql);
		System.out.println(tquery);
		return tquery.getResultList();
	}
		
	}


