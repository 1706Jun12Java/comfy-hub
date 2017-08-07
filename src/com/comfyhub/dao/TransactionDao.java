package com.comfyhub.dao;

import java.util.List;

import com.comfyhub.domain.Payment;
import com.comfyhub.domain.TransactionHist;
import com.comfyhub.domain.User;

public interface TransactionDao {

	public List<TransactionHist> getTransactions(User user);
	public void createTransaction(TransactionHist transaction);
}