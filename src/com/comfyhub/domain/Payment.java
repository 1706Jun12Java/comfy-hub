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
@Table(name="PAYMENT")
public class Payment implements Serializable {
	
	public Payment(/*int paymentID, */double amount, String currency, String cardNumber, String cvc, int expMonth,
			int expYear, User user) {
		super();
		//this.paymentID = paymentID;
		this.amount = amount;
		this.currency = currency;
		this.cardNumber = cardNumber;
		this.cvc = cvc;
		this.expMonth = expMonth;
		this.expYear = expYear;
		this.user = user;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -1115859550465817631L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="paymentSequence")
	@SequenceGenerator(allocationSize=1,name="paymentSequence",sequenceName="PAYMENT_SEQ")
	@Column(name="PAYMENT_ID")
	private int paymentID;
	
	@Column(name="AMOUNT")
	private double amount; 
	
	@Column(name="CURRENCY")
	private String currency; 
	
	@Column(name="CARD_NUMBER")
	private String cardNumber; 
	
	@Column(name="CVC")
	private String cvc;
	
	@Column(name="EXP_MONTH")
	private int expMonth;
	
	@Column(name="EXP_YEAR")
	private int expYear;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="USER_ID")
	private User user; 
	
	public Payment() {
		// TODO Auto-generated constructor stub
	}

	public int getPaymentID() {
		return paymentID;
	}

	public void setPaymentID(int paymentID) {
		this.paymentID = paymentID;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getCvc() {
		return cvc;
	}

	public void setCvc(String cvc) {
		this.cvc = cvc;
	}

	public int getExpMonth() {
		return expMonth;
	}

	public void setExpMonth(int expMonth) {
		this.expMonth = expMonth;
	}

	public int getExpYear() {
		return expYear;
	}

	public void setExpYear(int expYear) {
		this.expYear = expYear;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Payment [paymentID=" + paymentID + ", amount=" + amount + ", currency=" + currency + ", cardNumber="
				+ cardNumber + ", cvc=" + cvc + ", expMonth=" + expMonth + ", expYear=" + expYear + ", user=" + user
				+ "]";
	}

}
