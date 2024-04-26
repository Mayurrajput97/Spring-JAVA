package com.springcore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Javaconfig {
	
	@Bean
	public Mobile getMobile() {
		return new Mobile();
	}
	
	@Bean
	public Student getStudent() {

		Student student = new Student(getMobile());
		return student;
	}
}
