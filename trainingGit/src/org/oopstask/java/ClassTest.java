package org.oopstask.java;

public class ClassTest {
	
	 public static void main(String args[]) {
		 
		 Shape s = new Shape();
		 Circle cir = new Circle();
		 Triangle tri = new Triangle();
		 Square sq = new Square();
		 cir.area(3.14d, 2.2d);
		 cir.perimeter(3.14d,5.4d);
		 tri.area(2.2f,4.6f);
		 tri.perimeter(6,4,10);
		 sq.area(16);
		 sq.perimeter(5);

}
}