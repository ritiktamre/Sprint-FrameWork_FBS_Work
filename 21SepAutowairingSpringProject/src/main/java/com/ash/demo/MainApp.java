package com.ash.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
	
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Config.xml");
		SalesManager s1 = (SalesManager)ctx.getBean("Em");
		
		System.out.println(s1);

	}

}
