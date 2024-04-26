package com.springcore.config;


public class Student {
	
	private Mobile mobile;
	
	public Student(Mobile mobile) {
		super();
		this.mobile = mobile;
	}

	public Mobile getMobile() {
		return mobile;
	}

	public void setMobile(Mobile mobile) {
		this.mobile = mobile;
	}

	public void study() {
		this.mobile.display();
		System.out.println("I am Coding Java ");
	}
}
