package com.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Service {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="serviceID")
	private int id;
	
	@Column(name="serviceName")
	private String serviceName;
	
	@Column(name="price")
	private double price;
	
	
	public Service() {
		
	}


	public Service(String serviceName, double price) {
		this.serviceName = serviceName;
		this.price = price;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getServiceName() {
		return serviceName;
	}


	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
}
