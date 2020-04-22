package com.lti.models;
import javax.persistence.*;
import java.util.*;

@Entity
@Table(name="sub_category_details")
public class SubCategoryDetails {
	
	@Id
	private int subCategoryId;
	
	private String subCategoryName;
	
	private float weightage;
	
	private float idealScore;
	
	private float idealRating;
	
	@OneToMany(targetEntity=QuestionDetails.class, cascade=CascadeType.ALL)
	@JoinColumn(name="subCategory_id",referencedColumnName="subCategoryId")
	private List<QuestionDetails> questionDetails;

	public int getSubCategoryId() {
		return subCategoryId;
	}

	public void setSubCategoryId(int subCategoryId) {
		this.subCategoryId = subCategoryId;
	}

	public String getSubCategoryName() {
		return subCategoryName;
	}

	public void setSubCategoryName(String subCategoryName) {
		this.subCategoryName = subCategoryName;
	}

	public float getWeightage() {
		return weightage;
	}

	public void setWeightage(float weightage) {
		this.weightage = weightage;
	}

	public float getIdealScore() {
		return idealScore;
	}

	public void setIdealScore(float idealScore) {
		this.idealScore = idealScore;
	}

	public float getIdealRating() {
		return idealRating;
	}

	public void setIdealRating(float idealRating) {
		this.idealRating = idealRating;
	}

	public List<QuestionDetails> getQuestionDetails() {
		return questionDetails;
	}

	public void setQuestionDetails(List<QuestionDetails> questionDetails) {
		this.questionDetails = questionDetails;
	}

	public SubCategoryDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SubCategoryDetails(int subCategoryId, String subCategoryName, float weightage, float idealScore,
			float idealRating, List<QuestionDetails> questionDetails) {
		super();
		this.subCategoryId = subCategoryId;
		this.subCategoryName = subCategoryName;
		this.weightage = weightage;
		this.idealScore = idealScore;
		this.idealRating = idealRating;
		this.questionDetails = questionDetails;
	}

	@Override
	public String toString() {
		return "SubCategoryDetails [subCategoryId=" + subCategoryId + ", subCategoryName=" + subCategoryName
				+ ", weightage=" + weightage + ", idealScore=" + idealScore + ", idealRating=" + idealRating
				+ ", questionDetails=" + questionDetails + "]";
	}
	
	
}


