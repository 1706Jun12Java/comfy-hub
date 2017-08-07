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
@Table(name="TRANSACTION_HIST")
public class TransactionHist implements Serializable {
	
	public TransactionHist(int transactionID, Listing listing, User user, Payment payment, LocalDate startDate,
			LocalDate endDate) {
		super();
		this.transactionID = transactionID;
		this.listing = listing;
		this.user = user;
		this.payment = payment;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -7939235912089585796L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="transactionSequence")
	@SequenceGenerator(allocationSize=1,name="transactionSequence",sequenceName="TRANSACTION_SEQ")
	@Column(name="TRANSACTION_ID")
	private int transactionID;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="LISTING_ID")
	private Listing listing; 
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="USER_ID")
	private User user; 
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="PAYMENT_ID")
	private Payment payment; 
	
	@Column(name="START_DATE")
	private LocalDate startDate; 
	
	@Column(name="END_DATE")
	private LocalDate endDate; 

	public TransactionHist() {
		// TODO Auto-generated constructor stub
	}

	public int getTransactionID() {
		return transactionID;
	}

	public void setTransactionID(int transactionID) {
		this.transactionID = transactionID;
	}

	public Listing getListing() {
		return listing;
	}

	public void setListing(Listing listing) {
		this.listing = listing;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
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

	@Override
	public String toString() {
		return "Transaction [transactionID=" + transactionID + ", listing=" + listing + ", user=" + user + ", payment="
				+ payment + ", startDate=" + startDate + ", endDate=" + endDate + "]";
	}

}
