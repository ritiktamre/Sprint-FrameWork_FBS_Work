package com.ash.kahna;

public class Address {
 
	int pinCode;
	String place;
	int houseNo;
	
	public Address() {
		// TODO Auto-generated constructor stub
	}

	public Address(int pinCode, String place, int houseNo) {
		super();
		this.pinCode = pinCode;
		this.place = place;
		this.houseNo = houseNo;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public int getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}

	@Override
	public String toString() {
		return "pinCode=" + pinCode + ", place=" + place + ", houseNo=" + houseNo ;
	}
	
	
}
