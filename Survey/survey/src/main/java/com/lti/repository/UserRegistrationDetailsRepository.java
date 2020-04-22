package com.lti.repository;

import org.springframework.data.repository.CrudRepository;

import com.lti.models.UserRegistrationDetails;

public interface UserRegistrationDetailsRepository extends CrudRepository<UserRegistrationDetails, Integer> {

}
