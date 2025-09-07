package com.ash.practice;

import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Config {
	@Bean(initMethod = "init")
	@Scope("singleton")
	public Employee Employee()
	{
		return new Employee();
	}

}
