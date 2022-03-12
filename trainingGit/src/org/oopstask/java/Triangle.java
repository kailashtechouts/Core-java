package org.oopstask.java;

public class Triangle extends Shape {
	
	void area(float breadth, float height) {
		System.out.println("Area of triangle:" +((breadth*height/2)));
	}
	void perimeter(int a, int b, int c) {
		System.out.println("Perimeter of triangle:" +(a+b+c));
	}
	

}
