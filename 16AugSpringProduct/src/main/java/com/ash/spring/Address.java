package com.ash.spring;

public class Address {
     int pincode;
     String place;
     String houseNo;
     
     public Address() {
		// TODO Auto-generated constructor stub
	}

	public Address(int pincode, String place, String houseNo) {
		super();
		this.pincode = pincode;
		this.place = place;
		this.houseNo = houseNo;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}

	@Override
	public String toString() {
		return "Address [pincode=" + pincode + ", place=" + place + ", houseNo=" + houseNo + "]";
	}
     
     
}
