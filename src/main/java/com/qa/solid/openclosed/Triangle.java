package com.qa.solid.openclosed;

public class Triangle implements Shape {

	private double height;
	private double base;
	
	public Triangle(double height, double base) {
		this.height = height;
		this.base = base;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	@Override
	public double calculateArea() {
		return 0.5 * this.getBase() * this.getHeight();
	}

}
