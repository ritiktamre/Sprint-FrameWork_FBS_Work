package com.ash.practice;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Config.xml");
		Employee e1 = (Employee)ctx.getBean("Emp");
		Employee e2 = (Employee)ctx.getBean("Emp");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Id :");
		int id = sc.nextInt();
		
		System.out.println("Enter the Name :");
		String name = sc.next();
		
		System.out.println("Enter the Salary :");
		double salary = sc.nextDouble();
		
		e1.setId(id);
		e1.setName(name);
		e1.setSalary(salary);
		System.out.println(e1);
	
		
		
		e2.setId(id);
		e2.setName(name);
		e2.setSalary(salary);
		
		System.out.println(e2);
		if(e1 == e2)
		{
			System.out.println("Same Objects");
		}
		else
		{
			System.out.println("Different Objects");
		}
	}
}