package com.comfyhub.main;

import org.hibernate.Session;
import com.comfyhub.util.HibernateUtil;


public class Driver {

	public static void main(String[] args) {
		init();
	}
	
	static void init() {

		Session s = HibernateUtil.getSession();
		/*Transaction tx = s.beginTransaction();

		 create transient objects 

		Bat b1 = new Bat("Bob", 100, bt2, bc2);

		System.out.println(s.save(bt1));

		tx.commit();*/
		s.close();

	}
}
