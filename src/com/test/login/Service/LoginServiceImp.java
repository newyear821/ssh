package com.test.login.Service;

import java.util.List;

import com.test.login.DAO.LoginDao;
import com.test.login.Model.AccountInfo;

public class LoginServiceImp implements LoginService{
	
	private LoginDao loginDao;
	
	public void setLoginDao(LoginDao lDao){
		this.loginDao = lDao;
	}

	public List loginUser(AccountInfo user) throws Exception {
		// TODO Auto-generated method stub
		List res = loginDao.loginUser(user);
		return res;
	}

}
