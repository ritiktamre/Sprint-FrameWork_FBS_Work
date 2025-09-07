package com.ash.demo;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
       ApplicationContext ctx = new AnnotationConfigApplicationContext(Config1.class);
       Student s1 = (Student) ctx.getBean("Student");
       System.out.println(s1);
	}
	

}
