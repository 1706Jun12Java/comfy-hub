package com.comfyhub.dao;

import java.time.LocalDate;
import java.util.List;

import com.comfyhub.domain.District;
import com.comfyhub.domain.Listing;

public interface ListingDao {

	public List<Listing> searchListings(District district, LocalDate startDate, LocalDate endDate); 
	public void createListing(Listing listing); 
	
}
