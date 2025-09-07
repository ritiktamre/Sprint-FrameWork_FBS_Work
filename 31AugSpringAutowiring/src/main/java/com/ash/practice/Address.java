package com.ash.practice;

public class Address {
	
	int houseNo;
	String place;
	
	public Address() {
		// TODO Auto-generated constructor stub
	}

	public Address(int houseNo, String place) {
		super();
		this.houseNo = houseNo;
		this.place = place;
	}

	public int getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", place=" + place + "]";
	}
	
	
}