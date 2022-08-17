package com.qa.solid.openclosed;

public class AreaCalculator {

//  We would need to add separate methods for EVERY shape!
	
//	public double calculateAreaRectangle(Rectangle rect) {
//		return rect.getWidth() * rect.getLength();
//	}
//	
//	public double calculateAreaCircle(Circle circ) {
//		return circ.getRadius() * circ.getRadius() * Math.PI;
//	}
//	
//	public double calculateAreaTriangle(Triangle tri) {
//		return 0.5 * tri.getBase() * tri.getHeight();
//	}
	
	// This never needs to change
	// It works for ALL shapes
	// Therefore it is now CLOSED for modification.
	public double calculateArea(Shape shape) {
		return shape.calculateArea();
	}
	
}
