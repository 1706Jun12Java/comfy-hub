package com.comfyhub.dao;

import java.time.LocalDate;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import com.comfyhub.domain.District;
import com.comfyhub.domain.Listing;
import com.comfyhub.util.HibernateUtil;

public class ListingDaoImpl implements ListingDao{

	public ListingDaoImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Listing> searchListings(District district, LocalDate startDate, LocalDate endDate) {
		Session s = HibernateUtil.getSession(); 
		Criteria criteria = s.createCriteria(Listing.class).add( Restrictions.le("startDate",startDate)).add(Restrictions.ge("endDate",endDate)).add(Restrictions.eq("district",district.getDistrictName()));
		List results = criteria.list(); 
		return results;
	}

	@Override
	public void createListing(Listing listing) {
		// TODO Auto-generated method stub
		Session s = HibernateUtil.getSession(); 
		Transaction tx = s.beginTransaction();
		s.save(listing);
		tx.commit();
		s.close();
		
	}

}
