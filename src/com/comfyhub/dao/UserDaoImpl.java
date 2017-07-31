package com.comfyhub.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.comfyhub.domain.User;
import com.comfyhub.util.HibernateUtil;

public class UserDaoImpl implements UserDao{

	public UserDaoImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createUser(User user) {
		Session s = HibernateUtil.getSession(); 
		Transaction tx = s.beginTransaction();
		System.out.println("saving user...");
		System.out.println(s.save(user));
		tx.commit();
		s.close();	
	}

/*	@Override
	public boolean getUserById(User user) {
		// TODO Auto-generated method stub
		return false;
	}
*/
}