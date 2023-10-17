package com.mindgate.service;

import com.mindgate.repository.loginRepository;
import com.mindgate.repository.loginRepositoryInterface;

public class loginService implements loginServiceInterface {

	private loginRepositoryInterface loginRepository = new loginRepository();

	@Override
	public String validateLoginDetails(String loginId, String password) {

		return loginRepository.validateLoginDetails(loginId, password);
	}

	@Override
	public int checkLoginCount() {
		return loginRepository.checkLoginCount();
	}
}
