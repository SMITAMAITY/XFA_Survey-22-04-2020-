package com.lti.models;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name="question_details")
public class QuestionDetails {

	@Id
	private int questionId;
	
	private String questionDescription;
	
	@OneToMany(targetEntity=AnswerDetails.class, cascade=CascadeType.ALL)
	@JoinColumn(name="question_id",referencedColumnName="questionId")
	private List<AnswerDetails> answerDetails;

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getQuestionDescription() {
		return questionDescription;
	}

	public void setQuestionDescription(String questionDescription) {
		this.questionDescription = questionDescription;
	}

	public List<AnswerDetails> getAnswerDetails() {
		return answerDetails;
	}

	public void setAnswerDetails(List<AnswerDetails> answerDetails) {
		this.answerDetails = answerDetails;
	}

	public QuestionDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public QuestionDetails(int questionId, String questionDescription, List<AnswerDetails> answerDetails) {
		super();
		this.questionId = questionId;
		this.questionDescription = questionDescription;
		this.answerDetails = answerDetails;
	}

	@Override
	public String toString() {
		return "QuestionDetails [questionId=" + questionId + ", questionDescription=" + questionDescription
				+ ", answerDetails=" + answerDetails + "]";
	}
	
	
}
