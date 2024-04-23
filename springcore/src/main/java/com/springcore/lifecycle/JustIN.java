package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class JustIN implements InitializingBean,DisposableBean {
	private double prize;

	public double getPrize() {
		return prize;
	}

	public void setPrize(double prize) {
		this.prize = prize;
	}

	public JustIN() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "JustIN [prize=" + prize + "]";
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Taking JUSTIN");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Hehe");
	}
	
}
