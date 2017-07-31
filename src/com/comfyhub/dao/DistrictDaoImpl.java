package com.comfyhub.dao;

import java.util.List;

import org.hibernate.Session;

import com.comfyhub.domain.District;
import com.comfyhub.util.HibernateUtil;

public class DistrictDaoImpl implements DistrictDao{

	public DistrictDaoImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<District> getAllDistricts() {
		// TODO Auto-generated method stub
		Session s = HibernateUtil.getSession(); 
		List<District> districts = new ArrayList<District>(); 
		districts = s.createQuery("from District").list();
		return districts;
	}

}
