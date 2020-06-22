package com.trainingcentre.entity;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	
	private String detailedaddress;
	
	private String city;
	
	private String state;
	
	private int pincode;
	
	public Address() {
		
	}
	public Address(String detailedaddress, String city, String state,int pincode) {
		
		this.detailedaddress=detailedaddress;
		this.city=city;
		this.state=state;
		this.pincode=pincode;
	}
	
	


	public String getDetailedaddress() {
		return detailedaddress;
	}

	public void setDetailedaddress(String detailedaddress) {
		this.detailedaddress = detailedaddress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

}
