package org.oopstasks.java;

interface Test {
	
	void square();
}
class Arithmetic implements Test {
	
	public void square() {
		System.out.println("This is square number");
	}
}
public class ToTestInt {

	public static void main(String[] args) {
		
		Arithmetic ar = new Arithmetic();
		ar.square();
	}

}
