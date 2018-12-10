package com.hibernate.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Payment {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="paymentID")
	private int id;
	
	@Column(name="userID")
	private int userID;
	
	@Column(name="serviceID")
	private int serviceID;
	
	@Column(name="paymentStatus")
	private String paymentStatus;
	
	@Column(name="serviceUsed")
	private Date serviceUsed;
	
	@Column(name="paymentDone")
	private Date paymentDone;
	
	
	public Payment() {
		
	}


	public Payment(int userID, int serviceID, String paymentStatus, Date serviceUsed, Date paymentDone) {
		this.userID = userID;
		this.serviceID = serviceID;
		this.paymentStatus = paymentStatus;
		this.serviceUsed = serviceUsed;
		this.paymentDone = paymentDone;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getUserID() {
		return userID;
	}


	public void setUserID(int userID) {
		this.userID = userID;
	}


	public int getServiceID() {
		return serviceID;
	}


	public void setServiceID(int serviceID) {
		this.serviceID = serviceID;
	}


	public String getPaymentStatus() {
		return paymentStatus;
	}


	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}


	public Date getServiceUsed() {
		return serviceUsed;
	}


	public void setServiceUsed(Date serviceUsed) {
		this.serviceUsed = serviceUsed;
	}


	public Date getPaymentDone() {
		return paymentDone;
	}


	public void setPaymentDone(Date paymentDone) {
		this.paymentDone = paymentDone;
	}


	
}
