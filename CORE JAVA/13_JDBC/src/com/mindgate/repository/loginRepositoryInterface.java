package com.mindgate.repository;

import com.mindgate.domain.LoginDetails;

public interface loginRepositoryInterface {

	public String validateLoginDetails(String loginId,String password);
	
	public int checkLoginCount();
}
