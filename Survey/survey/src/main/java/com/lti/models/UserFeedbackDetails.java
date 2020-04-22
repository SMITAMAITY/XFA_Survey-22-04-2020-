package com.lti.models;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name="user_feedback_details")
public class UserFeedbackDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userFeedbackDetailsId;
	
	private int questionId;
	
	private int answerId;
	
	private int categoryId;
	
	private float actualRating;
	
	private int userId;

	public int getUserFeedbackDetailsId() {
		return userFeedbackDetailsId;
	}

	public void setUserFeedbackDetailsId(int userFeedbackDetailsId) {
		this.userFeedbackDetailsId = userFeedbackDetailsId;
	}

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public int getAnswerId() {
		return answerId;
	}

	public void setAnswerId(int answerId) {
		this.answerId = answerId;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public float getActualRating() {
		return actualRating;
	}

	public void setActualRating(float actualRating) {
		this.actualRating = actualRating;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public UserFeedbackDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserFeedbackDetails(int userFeedbackDetailsId, int questionId, int answerId, int categoryId,
			float actualRating, int userId) {
		super();
		this.userFeedbackDetailsId = userFeedbackDetailsId;
		this.questionId = questionId;
		this.answerId = answerId;
		this.categoryId = categoryId;
		this.actualRating = actualRating;
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "UserFeedbackDetails [userFeedbackDetailsId=" + userFeedbackDetailsId + ", questionId=" + questionId
				+ ", answerId=" + answerId + ", categoryId=" + categoryId + ", actualRating=" + actualRating
				+ ", userId=" + userId + "]";
	}

	

	


}
