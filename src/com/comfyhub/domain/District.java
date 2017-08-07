package com.comfyhub.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="DISTRICT")
public class District implements Serializable {
	
	public District(int districtID, String districtName) {
		super();
		this.districtID = districtID;
		this.districtName = districtName;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 2305281332885460904L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="districtSequence")
	@SequenceGenerator(allocationSize=1,name="districtSequence",sequenceName="DISTRICT_SEQ")
	@Column(name="DISTRICT_ID")
	private int districtID;
	
	@Column(name="DISTRICT_NAME")
	private String districtName;

	public District() {
		// TODO Auto-generated constructor stub
	}

	public int getDistrictID() {
		return districtID;
	}

	public void setDistrictID(int districtID) {
		this.districtID = districtID;
	}

	public String getDistrictName() {
		return districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	@Override
	public String toString() {
		return "District [districtID=" + districtID + ", districtName=" + districtName + "]";
	}

}
