package com.test.login.DAO;

import java.util.List;

import com.test.login.Model.AccountInfo;

public interface LoginDao {

	public List loginUser(final AccountInfo user) throws Exception;
}
