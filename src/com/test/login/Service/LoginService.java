package com.test.login.Service;

import java.util.List;

import com.test.login.Model.AccountInfo;

public interface LoginService {

	public List loginUser(final AccountInfo user) throws Exception;
	
}
