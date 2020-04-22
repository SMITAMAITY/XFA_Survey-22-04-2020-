package com.lti.models;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name="user_registration_details")
public class UserRegistrationDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;
	
	private String fullName;

	private String companyName;
	
	private String email;
	
	private String jobRole;

	private int totalUserOrg;

	private String countryRegion;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getJobRole() {
		return jobRole;
	}

	public void setJobRole(String jobRole) {
		this.jobRole = jobRole;
	}

	public int getTotalUserOrg() {
		return totalUserOrg;
	}

	public void setTotalUserOrg(int totalUserOrg) {
		this.totalUserOrg = totalUserOrg;
	}

	public String getCountryRegion() {
		return countryRegion;
	}

	public void setCountryRegion(String countryRegion) {
		this.countryRegion = countryRegion;
	}

	public UserRegistrationDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserRegistrationDetails(int userId, String fullName, String companyName, String email, String jobRole,
			int totalUserOrg, String countryRegion) {
		super();
		this.userId = userId;
		this.fullName = fullName;
		this.companyName = companyName;
		this.email = email;
		this.jobRole = jobRole;
		this.totalUserOrg = totalUserOrg;
		this.countryRegion = countryRegion;
	}

	@Override
	public String toString() {
		return "UserRegistrationDetails [userId=" + userId + ", fullName=" + fullName + ", companyName=" + companyName
				+ ", email=" + email + ", jobRole=" + jobRole + ", totalUserOrg=" + totalUserOrg + ", countryRegion="
				+ countryRegion + "]";
	}





}
