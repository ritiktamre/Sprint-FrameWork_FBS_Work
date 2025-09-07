package com.asd.radhe;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEmp {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(Config1.class);
		Employee e1 = (Employee) ctx.getBean("Employee");
	
		
	    System.out.println(e1);
	    
	    
	}

}
