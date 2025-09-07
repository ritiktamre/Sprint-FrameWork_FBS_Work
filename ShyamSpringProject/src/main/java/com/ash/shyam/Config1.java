package com.ash.shyam;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Config1 {
  
	@Scope("singleton")
	@Bean(initMethod = "init" )
	public Student Student()
	{
		return new Student();
	}
}
