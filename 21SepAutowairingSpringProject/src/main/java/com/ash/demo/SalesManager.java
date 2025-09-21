package com.ash.demo;

import org.springframework.beans.factory.annotation.Autowired;

public class SalesManager {
  
	int id;
	String name;
	double salary;
	@Autowired
	Address address;
	
	public SalesManager() {
		// TODO Auto-generated constructor stub
	}

	public SalesManager(int id, String name, double salary, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "SalesManager [id=" + id + ", name=" + name + ", salary=" + salary +  ", Address ="+address ;
	}
	
	
	
}
