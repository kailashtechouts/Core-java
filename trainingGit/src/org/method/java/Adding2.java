package org.method.java;

 class AddingTwo {

	static int add(int a, int b) {
		return a + b;
	}
	static double add(double a, double b) {
		return a + b;
	}
 }	
    class Adding2{
		
	public static void main(String[] args) {
		System.out.println(AddingTwo.add(10, 20));
		System.out.println(AddingTwo.add(9.4, 14.3));
	}

}
