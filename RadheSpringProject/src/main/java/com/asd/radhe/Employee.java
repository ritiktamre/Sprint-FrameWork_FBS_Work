package com.asd.radhe;

import java.util.Scanner;

public class Employee {
   
	int id;
	String name;
	double salary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
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
	
	public void init()
	{
		System.out.println("Init Method Initilized");
Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the id");
		this.id = sc.nextInt();
		
		System.out.println("Enter the Name");
		this.name = sc.next();
		
		System.out.println("Enter the Salary");
		this.salary = sc.nextDouble();
		
		
	}
	
	public void destroy()
	{
		System.out.println("Destroed Run");
	}

	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", salary=" + salary ;
	}
	
	
}
