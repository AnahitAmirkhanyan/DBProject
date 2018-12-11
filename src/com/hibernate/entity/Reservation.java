package com.hibernate.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="reservation")
public class Reservation {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="resID")
	private int id;
	
	@Column(name="userID")
	private int userID;
	
	@Column(name="roomNumber")
	private String roomNumber;
	
	@Column(name="checkIn")
	private Date checkIn;
	
	@Column(name="checkOut")
	private Date checkOut;
	
	@Column(name="guestCount")
	private int guestCount;
	
	
	public Reservation() {
		
	}


	public Reservation(int userID, String roomNumber, Date checkIn, Date checkOut, int guestCount) {
		this.userID = userID;
		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		this.guestCount = guestCount;
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


	public String getRoomNumber() {
		return roomNumber;
	}


	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}


	public Date getCheckIn() {
		return checkIn;
	}


	public void setCheckIn(Date checkIn) {
		this.checkIn = checkIn;
	}


	public Date getCheckOut() {
		return checkOut;
	}


	public void setCheckOut(Date checkOut) {
		this.checkOut = checkOut;
	}


	public int getGuestCount() {
		return guestCount;
	}


	public void setGuestCount(int guestCount) {
		this.guestCount = guestCount;
	}
	
	
}
