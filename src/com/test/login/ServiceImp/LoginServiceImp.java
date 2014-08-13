package com.test.login.ServiceImp;

import java.util.List;

import com.test.login.Dao.LoginDao;
import com.test.login.Model.AccountInfo;
import com.test.login.Service.LoginService;

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
