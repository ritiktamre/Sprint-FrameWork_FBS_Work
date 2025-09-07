package com.ash.kahna;

import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Config {

	@Bean(initMethod = "init")
	@Scope("singleton")
	public Student Student()
	{		
		return new Student();
	}
}
