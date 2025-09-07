package com.asd.radhe;

import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Config1 {

	@Bean
	public Employee Employee()
	{
	
		return new Employee();
	}
}
