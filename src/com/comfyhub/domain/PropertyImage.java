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
@Table(name="PROPERTY_IMAGE")
public class PropertyImage implements Serializable {

	public PropertyImage(int imageID, String url, Property property, String imageDescription) {
		super();
		this.imageID = imageID;
		this.url = url;
		this.property = property;
		this.imageDescription = imageDescription;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 3898063945459336096L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="imageSequence")
	@SequenceGenerator(allocationSize=1,name="imageSequence",sequenceName="IMAGE_SEQ")
	@Column(name="IMAGE_ID")
	private int imageID; 
	
	@Column(name="URL")
	private String url;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="PROPERTY_ID")
	private Property property; 
	
	@Column(name="IMAGE_DESCRIPTION")
	private String imageDescription; 
	
	public PropertyImage() {
		// TODO Auto-generated constructor stub
	}

	public int getImageID() {
		return imageID;
	}

	public void setImageID(int imageID) {
		this.imageID = imageID;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Property getProperty() {
		return property;
	}

	public void setProperty(Property property) {
		this.property = property;
	}

	public String getImageDescription() {
		return imageDescription;
	}

	public void setImageDescription(String imageDescription) {
		this.imageDescription = imageDescription;
	}

	@Override
	public String toString() {
		return "PropertyImage [imageID=" + imageID + ", url=" + url + ", property=" + property + ", imageDescription="
				+ imageDescription + "]";
	}

}
