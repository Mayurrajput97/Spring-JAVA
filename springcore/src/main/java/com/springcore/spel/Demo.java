package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {

	@Value("#{5+5}")
	private int x;

	@Value("#{3+3}")
	private int y;

	// Calling SQRT method from java.lang.Math
	@Value("#{T(java.lang.Math).sqrt(25)}")
	private int z;

	// If we want the value Like E , PI from Math Class
	@Value("#{T(java.lang.Math).PI}")
	private double p;
	
	// Boolean Type 
	@Value("#{18>7}")
	private boolean isTrue;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	public double getP() {
		return p;
	}

	public void setP(double p) {
		this.p = p;
	}

	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", p=" + p + ", isTrue=" + isTrue + "]";
	}
}
