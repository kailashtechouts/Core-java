package org.oopstask.java;

public class Circle extends Shape {
	
	void area(double pi, double radius) {
		System.out.println("Area of circle:" +(pi*radius*radius));
	}
	void perimeter(double pi, double radius) {
		System.out.println("Perimeter of circle:" +(2*pi*radius));
	}
	

}
