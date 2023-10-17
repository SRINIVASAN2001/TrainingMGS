package com.mindgate.service;

import com.mindgate.domain.LoginDetails;

public interface loginServiceInterface {

	public String validateLoginDetails(String loginId, String password);

	public int checkLoginCount();
}
