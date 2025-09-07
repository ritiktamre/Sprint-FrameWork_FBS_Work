package com.ash.kahna;

public class Student {
   int roll;
   String name;
   double marks;
   Address address;
   
   
   public Student() {
	// TODO Auto-generated constructor stub
}

public Student(int roll, String name, double marks,Address address) {
	super();
	this.roll = roll;
	this.name = name;
	this.marks = marks;
	this.address = address;
}

public void init()
{
	System.out.println("Init Used");
}

public int getRoll() {
	return roll;
}

public void setRoll(int roll) {
	this.roll = roll;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public double getMarks() {
	return marks;
}

public void setMarks(double marks) {
	this.marks = marks;
}

public void setAddress(Address address)
{
	this.address=address;
}

public Address getAddress()
{
	return address;
}

@Override
public String toString() {
	return "roll=" + roll + ", name=" + name + ", marks=" + marks +", address ="+address ;
}



//public void setAddress(int pinCode, String place, int houseNo) {
//	// TODO Auto-generated method stub
//	
//}
   
   
}
