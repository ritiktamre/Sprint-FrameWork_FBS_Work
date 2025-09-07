package com.ash.spring;

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
	
	public void setId(int id)
	{
		this.id=id;
		
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public void setSalary(double salary)
	{
		this.salary=salary;
	}
	
	public int getId()
	{
		return id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getSalary()
	{
		return salary;
	}
	
	public void init()
	{
		System.out.println("Init Used");
	}
	
	public String toString()
	{
		return "Id :"+id + ", Name :"+name+ ", Salary :"+salary;
	}
}