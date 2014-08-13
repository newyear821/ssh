package com.test.emailcollect.ServiceImp;

import com.test.emailcollect.Dao.EmailcollectDao;
import com.test.emailcollect.Service.EmailcollectService;

public class EmailcollectServiceImp implements EmailcollectService {
	
	private EmailcollectDao emailcollectDao;
	

	/**
	 * @param emailcollectDao the emailcollectDao to set
	 */
	public void setEmailcollectDao(EmailcollectDao emailcollectDao) {
		this.emailcollectDao = emailcollectDao;
	}


	public boolean saveEmail(String email) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

}
