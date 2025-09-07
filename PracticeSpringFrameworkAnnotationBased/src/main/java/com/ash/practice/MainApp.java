package com.ash.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {
	
		ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
		Employee e1 = (Employee) ctx.getBean("Employee");
		Employee e2 = (Employee) ctx.getBean("Employee");
		
		System.out.println(e1);
		System.out.println(e2);
		
		if(e1 == e2)
		{
			System.out.println("Same Object");
		}
		else
		{
			System.out.println("Different Object");
		}

	}

}
