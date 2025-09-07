package com.ash.demo;

import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Config1 {

//	@Bean(initMethod = "init")
//	@Scope("prototype")
	public Student Student()
	{
		return new Student();
	}
}
