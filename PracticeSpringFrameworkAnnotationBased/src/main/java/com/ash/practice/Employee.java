package com.ash.practice;

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
		
       Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the ID :");
		this.id = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the Name :");
		this.name = sc.next();
		sc.nextLine();
		
		System.out.println("Enter the Salary :");
		this.salary = sc.nextDouble();
		return;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}
