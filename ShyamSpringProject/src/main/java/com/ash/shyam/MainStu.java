package com.ash.shyam;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainStu {

	public static void main(String[] args) {
      
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the RollNo");
		int rollNo=sc.nextInt();
		
		System.out.println("Enter the Name");
		String name=sc.next();
		
		System.out.println("Enter the Marks");
		double marks=sc.nextDouble();
				
		ApplicationContext ctx = new AnnotationConfigApplicationContext(Config1.class);
		Student s1 = (Student) ctx.getBean("Student");
		Student s2 = (Student) ctx.getBean("Student");
		
		s1.setMarks(marks);
		s1.setName(name);
		s1.setRollNo(rollNo);
		
		s2.setMarks(marks);
		s2.setName(name);
		s2.setRollNo(rollNo);
		
		System.out.println(s2);
		System.out.println(s1);
		
		if(s1==s2)
		{
			System.out.println("Same");
		}
		
		else
		{
			System.out.println("Different");
		}
	}

}
