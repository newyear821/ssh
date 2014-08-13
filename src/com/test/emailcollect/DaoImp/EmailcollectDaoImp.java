package com.test.emailcollect.DaoImp;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.test.emailcollect.Dao.EmailcollectDao;
import com.test.emailcollect.Model.EmailInfo;

public class EmailcollectDaoImp implements EmailcollectDao {

	//成员化HibernateTemplate对象: 
	private HibernateTemplate hibernateTemplate;
	
	
	public void setSessionFactory(SessionFactory sessionFactory){
		this.hibernateTemplate = new HibernateTemplate(sessionFactory);
	}


	public boolean saveEmail(String email) throws Exception {
		// TODO Auto-generated method stub
		boolean res = false;
		EmailInfo emailinfo = new EmailInfo();
		emailinfo.setEmail(email);
		hibernateTemplate.save(emailinfo);
		return true;
	}

}
