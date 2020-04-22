package com.lti.models;
import javax.persistence.*;
import java.util.*;

@Entity
@Table(name="category_details")
public class CategoryDetails {

	@Id
	private int categoryId;
	
	private String categoryDescription;
	
	private float finalIdealRating;
	
	@OneToMany(targetEntity=SubCategoryDetails.class, cascade=CascadeType.ALL)
	@JoinColumn(name="category_id",referencedColumnName="categoryId")
	private List<SubCategoryDetails> subCategoryDetails;

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryDescription() {
		return categoryDescription;
	}

	public void setCategoryDescription(String categoryDescription) {
		this.categoryDescription = categoryDescription;
	}

	public float getFinalIdealRating() {
		return finalIdealRating;
	}

	public void setFinalIdealRating(float finalIdealRating) {
		this.finalIdealRating = finalIdealRating;
	}

	public List<SubCategoryDetails> getSubCategoryDetails() {
		return subCategoryDetails;
	}

	public void setSubCategoryDetails(List<SubCategoryDetails> subCategoryDetails) {
		this.subCategoryDetails = subCategoryDetails;
	}

	public CategoryDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CategoryDetails(int categoryId, String categoryDescription, float finalIdealRating,
			List<SubCategoryDetails> subCategoryDetails) {
		super();
		this.categoryId = categoryId;
		this.categoryDescription = categoryDescription;
		this.finalIdealRating = finalIdealRating;
		this.subCategoryDetails = subCategoryDetails;
	}

	@Override
	public String toString() {
		return "CategoryDetails [categoryId=" + categoryId + ", categoryDescription=" + categoryDescription
				+ ", finalIdealRating=" + finalIdealRating + ", subCategoryDetails=" + subCategoryDetails + "]";
	}

	
	
}
