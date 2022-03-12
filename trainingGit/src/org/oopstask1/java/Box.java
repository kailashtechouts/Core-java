package org.oopstask1.java;

public class Box {

	double l, b, h;

	Box(double l, double b, double h) {
		this.l = l;
		this.b = b;
		this.h = h;
	}

	public void area() {
		double area = 2 * ((l * b) + (b * h) + (l * h));
		System.out.println("Area of box:" + area);
	}

	public void volume() {
		double volume = l * b * h;
		System.out.println("volume of box:" + volume);
	}

}
