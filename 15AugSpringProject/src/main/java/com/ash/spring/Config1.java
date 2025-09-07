package com.ash.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Config1 {
	
	@Bean(initMethod = "init")
	@Scope("prototype")
	public Employee Employee() {
		return new Employee();
	}
}