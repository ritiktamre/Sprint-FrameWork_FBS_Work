package com.ash.practice;

public class Employee {
  int id;
  String name;
  double salary;
  Address address;
  
  public Employee() {
	// TODO Auto-generated constructor stub
}
  
  

public Employee(int id, String name, double salary, Address address) {
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

public void setAddress(Address address)
{
	this.address=address;
}

public Address getAddress()
{
	return address;
}

public void init()
{
	System.out.println("Init Used");
}

@Override
public String toString() {
	return "id=" + id + ", name=" + name + ", salary=" + salary + "Address:"+address;
}
  
  
}
