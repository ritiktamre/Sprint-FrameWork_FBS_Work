package com.ash.demo;

import java.util.Scanner;

public class Student {
  
	int roll;
	String name;
	double marks;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Student(int roll, String name, double marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}
	
//	public void init()
//	{
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter The RollNo :");
//		int rollNo =sc.nextInt();
//		
//		System.out.println("Enter the Name :");
//		String name=sc.next();
//		
//		System.out.println("Enter the Marks :");
//		double marks = sc.nextDouble();
//	}

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
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
	}
	
}
