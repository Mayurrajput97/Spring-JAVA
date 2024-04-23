package com.springcore.lifecycle;

public class Just {
	private double prize;

	public double getPrize() {
		return prize;
	}

	public void setPrize(double prize) {
		System.out.println("Setting Property");
		this.prize = prize;
	}

	public Just() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Just [prize=" + prize + "]";
	}
	
	public void init() {
		System.out.println("Inside init method");
	}
	
	public void destroy() {
		System.out.println("Inside Destroy method");
	}
}
