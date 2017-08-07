package com.comfyhub.domain;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="LISTING")
public class Listing implements Serializable {
	
	public Listing(int listingID, Property property, LocalDate startDate, LocalDate endDate, double price,
			String ownersNotes, boolean childrenAllowed, boolean smokingAllowed, boolean petsAllowed, boolean kitchen) {
		super();
		this.listingID = listingID;
		this.property = property;
		this.startDate = startDate;
		this.endDate = endDate;
		this.price = price;
		this.ownersNotes = ownersNotes;
		this.childrenAllowed = childrenAllowed;
		this.smokingAllowed = smokingAllowed;
		this.petsAllowed = petsAllowed;
		this.kitchen = kitchen;
	}


	/**
	 * 
	 */
	private static final long serialVersionUID = 4644094051012160155L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="listingSequence")
	@SequenceGenerator(allocationSize=1,name="listingSequence",sequenceName="LISTING_SEQ")
	@Column(name="LISTING_ID")
	private int listingID;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="PROPERTY_ID")
	private Property property; 
	
	@Column(name="START_DATE")
	private LocalDate startDate;
	
	@Column(name="END_DATE")
	private LocalDate endDate;
	
	@Column(name="PRICE")
	private double price; 
	
	@Column(name="OWNERS_NOTES")
	private String ownersNotes;
	
	@Column(name="CHILDREN_ALLOWED")
	private boolean childrenAllowed; 
	
	@Column(name="SMOKING_ALLOWED")
	private boolean smokingAllowed; 
	
	@Column(name="PETS_ALLOWED")
	private boolean petsAllowed; 
	
	@Column(name="KITCHEN")
	private boolean kitchen; 
	

	public Listing() {
		// TODO Auto-generated constructor stub
	}


	public int getListingID() {
		return listingID;
	}


	public void setListingID(int listingID) {
		this.listingID = listingID;
	}


	public Property getProperty() {
		return property;
	}


	public void setProperty(Property property) {
		this.property = property;
	}


	public LocalDate getStartDate() {
		return startDate;
	}


	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}


	public LocalDate getEndDate() {
		return endDate;
	}


	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String getOwnersNotes() {
		return ownersNotes;
	}


	public void setOwnersNotes(String ownersNotes) {
		this.ownersNotes = ownersNotes;
	}


	public boolean isChildrenAllowed() {
		return childrenAllowed;
	}


	public void setChildrenAllowed(boolean childrenAllowed) {
		this.childrenAllowed = childrenAllowed;
	}


	public boolean isSmokingAllowed() {
		return smokingAllowed;
	}


	public void setSmokingAllowed(boolean smokingAllowed) {
		this.smokingAllowed = smokingAllowed;
	}


	public boolean isPetsAllowed() {
		return petsAllowed;
	}


	public void setPetsAllowed(boolean petsAllowed) {
		this.petsAllowed = petsAllowed;
	}


	public boolean isKitchen() {
		return kitchen;
	}


	public void setKitchen(boolean kitchen) {
		this.kitchen = kitchen;
	}


	@Override
	public String toString() {
		return "Listing [listingID=" + listingID + ", property=" + property + ", startDate=" + startDate + ", endDate="
				+ endDate + ", price=" + price + ", ownersNotes=" + ownersNotes + ", childrenAllowed=" + childrenAllowed
				+ ", smokingAllowed=" + smokingAllowed + ", petsAllowed=" + petsAllowed + ", kitchen=" + kitchen + "]";
	}

}
