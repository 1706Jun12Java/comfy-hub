package com.comfyhub.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.comfyhub.domain.Payment;
import com.comfyhub.domain.TransactionHist;
import com.comfyhub.domain.User;
import com.comfyhub.util.HibernateUtil;

public class TransactionDaoImpl implements TransactionDao {

	public TransactionDaoImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<TransactionHist> getTransactions(User user) {
		Session s = HibernateUtil.getSession();
		List<TransactionHist> transactions = user.getTransactions();
		s.close();
		return transactions;
	}

	@Override
	public void createTransaction(TransactionHist transaction) {
		Session s = HibernateUtil.getSession(); 
		Transaction tx = s.beginTransaction();
		s.save(transaction);
		tx.commit();
		s.close();	
	}

}
