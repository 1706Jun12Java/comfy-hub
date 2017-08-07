package com.comfyhub.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.comfyhub.domain.*;
import com.comfyhub.util.*;


public class Driver {

	public static void main(String[] args) {
		System.out.println("main");
		init();
	}
	
	public static void init() {


		User u = new User("a", "b", "c", "d", "e"); 
		
		Session s = HibernateUtil.getSession(); 
		Transaction tx = s.beginTransaction();  
		System.out.println(s.save(u)); 
		tx.commit(); 
		s.close();

	}
}
