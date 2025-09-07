package com.ash.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Config.xml");
		Employee e1 = (Employee)ctx.getBean("Emp");
		Employee e2 = (Employee)ctx.getBean("Emp");
		System.out.println(e2);
		System.out.println(e1);
		
		if(e1==e2)
		{
			System.out.println("Same Objects");
		}
		else
		{
			System.out.println("Different objects");
		}
	}
}