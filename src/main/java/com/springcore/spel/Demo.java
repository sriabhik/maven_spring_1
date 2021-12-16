package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component

public class Demo {
	@Value("#{22+11}")//this expression get solve and assigned to x(spel)
	private int x;
	
	@Value("#{2+5+3+4}")
	private int y;
	
	@Value("#{ T(java.lang.Math).sqrt(25)}")//using static method
	private double z;
	
	@Value("#{ T(java.lang.Math).E}")//using variable
	private double E;
	public double getE() {
		return E;
	}



	public void setE(double e) {
		E = e;
	}



	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", E=" + E + "]";
	}
	
	
	
	public double getZ() {
		return z;
	}



	public void setZ(double z) {
		this.z = z;
	}



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
	
}
