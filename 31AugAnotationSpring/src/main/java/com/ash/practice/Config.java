package com.ash.practice;

import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Config {
	
	@Bean(initMethod = "init")
	@Scope("prototype")
	public Employee Employee()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Id :");
		int id = sc.nextInt();
		
		System.out.println("Enter the Name :");
		String name = sc.next();
		
		System.out.println("Enter the Salary :");
		double salary = sc.nextDouble();
		
		return new Employee(id,name,salary);
	}
}