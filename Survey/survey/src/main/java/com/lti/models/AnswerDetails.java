package com.lti.models;
import javax.persistence.*;
import java.util.*;

@Entity
@Table(name="answer_details")
public class AnswerDetails {
	@Id
	private int answerId;
	
	private String answerDescription;
	
	private float weightage;
	
	private float actualScore;
	
	private float actualRating;

	public int getAnswerId() {
		return answerId;
	}

	public void setAnswerId(int answerId) {
		this.answerId = answerId;
	}

	public String getAnswerDescription() {
		return answerDescription;
	}

	public void setAnswerDescription(String answerDescription) {
		this.answerDescription = answerDescription;
	}

	public float getWeightage() {
		return weightage;
	}

	public void setWeightage(float weightage) {
		this.weightage = weightage;
	}

	public float getActualScore() {
		return actualScore;
	}

	public void setActualScore(float actualScore) {
		this.actualScore = actualScore;
	}

	public float getActualRating() {
		return actualRating;
	}

	public void setActualRating(float actualRating) {
		this.actualRating = actualRating;
	}

	public AnswerDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AnswerDetails(int answerId, String answerDescription, float weightage, float actualScore,
			float actualRating) {
		super();
		this.answerId = answerId;
		this.answerDescription = answerDescription;
		this.weightage = weightage;
		this.actualScore = actualScore;
		this.actualRating = actualRating;
	}

	@Override
	public String toString() {
		return "AnswerDetails [answerId=" + answerId + ", answerDescription=" + answerDescription + ", weightage="
				+ weightage + ", actualScore=" + actualScore + ", actualRating=" + actualRating + "]";
	}
	
	
	
	
	
}
