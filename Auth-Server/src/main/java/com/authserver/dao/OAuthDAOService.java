package com.authserver.dao;

import org.springframework.stereotype.Component;

import com.authserver.model.UserEntity;

@Component
public interface OAuthDAOService {
	
	public UserEntity getUserDetails(String emailId);

}
