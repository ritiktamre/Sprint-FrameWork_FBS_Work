package com.ash.demo;

import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Config {
 @Bean
 @Scope("prototype")
	public Employee Employee(){
		 
	   Scanner sc = new Scanner(System.in);
	   int id = sc.nextInt();
	   String name = sc.next();
	   double salary = sc.nextDouble();
		return new Employee(id,name,salary);
	}
}
