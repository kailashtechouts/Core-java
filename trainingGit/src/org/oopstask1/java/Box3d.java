package org.oopstask1.java;

public class Box3d extends Box {
	
	int l, b, h;
	public Box3d(int l, int b, int h) {
		super(l, b, h);
		this.l = l;
		this.b = b;
		this.h = h;
	}
	 public void area1() {
		 int area = 2*((l*b)+(b*h)+(l*h));
		 System.out.println("Area of box3d:" +area);
	 }
	 public void volume1() {
		 int volume = l*b*h;
		 System.out.println("volume of box3d:" +volume);
	 }
	

}
