package com.comfyhub.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {
	
	private static SessionFactory sf = null;
	
	private static SessionFactory sessionFactory(String filename) {
		Configuration c = new Configuration().configure(filename);
		ServiceRegistry sr = new StandardServiceRegistryBuilder().applySettings(
				c.getProperties()).build();
		return c.buildSessionFactory(sr);
	}

	public static Session getSession() {
		if (sf==null){
			sf = sessionFactory("hibernate.cfg.xml");
		} 
		return sf.openSession();
	}
}