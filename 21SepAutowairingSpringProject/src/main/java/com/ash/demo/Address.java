package com.ash.demo;

public class Address {

	int pincode;
	String loc;
	
	public Address() {
		// TODO Auto-generated constructor stub
	}

	public Address(int pincode, String loc) {
		super();
		this.pincode = pincode;
		this.loc = loc;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	@Override
	public String toString() {
		return "Address [pincode=" + pincode + ", loc=" + loc + "]";
	}
	
	
}
