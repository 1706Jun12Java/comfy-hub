package com.comfyhub.dao;

import java.util.List;

import com.comfyhub.domain.Payment;
import com.comfyhub.domain.User;

public interface PaymentDao {
	
	public void createPayment(Payment payment); 
	public List<Payment> getPayment(User user);

}
