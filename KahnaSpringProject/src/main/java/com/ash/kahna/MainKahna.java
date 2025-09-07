package com.ash.kahna;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainKahna {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
		Student e1 = (Student) ctx.getBean(Student.class);
		Student e2 = (Student) ctx.getBean(Student.class);
		
		e1.setRoll(12);
		e1.setName("kahna");
		e1.setMarks(78);
			
    Scanner sc = new Scanner(System.in);
    int pinCode = sc.nextInt();
    String place = sc.next();
    int houseNo = sc.nextInt();
		
//		e2.setRoll(12);
//		e2.setName("kahna");
//		e2.setMarks(78);
//		e2.getAddress().setPinCode(47);
//		e2.getAddress().setHouseNo(72);
//		e2.getAddress().setPlace("Mungaoli");
		
		
		  
		System.out.println(e1);
		System.out.println(e2);
		
		if(e1==e2) {
			System.out.println("Same Object");
		}
		else
		{
			System.out.println("Different Object");
		}
	}

}
