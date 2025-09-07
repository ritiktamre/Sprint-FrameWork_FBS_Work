package com.ash.spring;


import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Id :");
		int id = sc.nextInt();
		
		System.out.println("Enter the Name :");
		String name = sc.next();
		
		System.out.println("Enter the Salary :");
		double salary = sc.nextDouble();
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(Config1.class);
		Employee e1 = (Employee) ctx.getBean("Employee");
		Employee e2 = (Employee) ctx.getBean("Employee");
		e1.setId(id);
		e1.setName(name);
		e1.setSalary(salary);
		
	
		
		System.out.println(e1);
		System.out.println(e2);
		
		if(e1==e2)
		{
			System.out.println("Same Objects");
		}
		else
		{
			System.out.println("Different Objects");
		}
	}
}