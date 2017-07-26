package com.comfyhub.domain;

import java.io.Serializable;

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
@Table(name="PROPERTY_RENT")
public class Property implements Serializable {
	
	public Property(int propertyID, String streetAddress, int size, float xCoord, float yCoord, District district) {
		super();
		this.propertyID = propertyID;
		this.streetAddress = streetAddress;
		this.size = size;
		this.xCoord = xCoord;
		this.yCoord = yCoord;
		this.district = district;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 4977081966196822969L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="propertySequence")
	@SequenceGenerator(allocationSize=1,name="propertySequence",sequenceName="PROPERTY_SEQ")
	@Column(name="PROPERTY_ID")
	private int propertyID;
	
	@Column(name="STREET_ADDRESS")
	private String streetAddress; 
	
	@Column(name="ROOM_SIZE")
	private int size; 
	
	@Column(name="X_COORD")
	private float xCoord; 
	
	@Column(name="Y_COORD")
	private float yCoord; 

	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="DISTRICT_ID")
	private District district; 

	public Property() {
		// TODO Auto-generated constructor stub
	}

	public int getPropertyID() {
		return propertyID;
	}

	public void setPropertyID(int propertyID) {
		this.propertyID = propertyID;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public float getxCoord() {
		return xCoord;
	}

	public void setxCoord(float xCoord) {
		this.xCoord = xCoord;
	}

	public float getyCoord() {
		return yCoord;
	}

	public void setyCoord(float yCoord) {
		this.yCoord = yCoord;
	}

	public District getDistrict() {
		return district;
	}

	public void setDistrict(District district) {
		this.district = district;
	}

	@Override
	public String toString() {
		return "Property [propertyID=" + propertyID + ", streetAddress=" + streetAddress + ", size=" + size
				+ ", xCoord=" + xCoord + ", yCoord=" + yCoord + ", district=" + district + "]";
	}

}
