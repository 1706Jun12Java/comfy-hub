package com.comfyhub.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.comfyhub.domain.District;
import com.comfyhub.domain.Payment;
import com.comfyhub.domain.User;
import com.comfyhub.util.HibernateUtil;

public class PaymentDaoImpl implements PaymentDao{

	public PaymentDaoImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createPayment(Payment payment) {
		Session s = HibernateUtil.getSession(); 
		Transaction tx = s.beginTransaction();
		s.save(payment);
		tx.commit();
		s.close();	
	}

	@Override
	public List<Payment> getPayment(User user) {
		Session s = HibernateUtil.getSession();
		List<Payment> payments = user.getPayments();
		s.close();
		return payments;
	}

}
