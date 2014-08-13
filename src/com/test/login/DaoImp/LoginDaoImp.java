package com.test.login.DaoImp;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.test.login.Dao.LoginDao;
import com.test.login.Model.AccountInfo;

public class LoginDaoImp implements LoginDao{

	//成员化HibernateTemplate对象: 
	private HibernateTemplate hibernateTemplate;
	//提供注入HibernateTemplate对象的setSessionFactory()方法 
	public void setSessionFactory(SessionFactory sessionFactory){
		this.hibernateTemplate = new HibernateTemplate(sessionFactory);
	}
	//用户登录方法 
	public List loginUser(final AccountInfo user) throws Exception{
		
		List loginUser = (List) hibernateTemplate.execute(new HibernateCallback(){
			public Object doInHibernate(Session session) throws HibernateException, SQLException{
				Query q = session.createQuery("from AccountInfo u where u.accountName=? and u.accountPwd=?");
				q.setParameter(0,user.getAccountName());
				q.setParameter(1, user.getAccountPwd());
				return q.list();
			}
		});
		return loginUser;
	}
}
