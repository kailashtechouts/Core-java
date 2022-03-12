package org.inheritance.java;

 class MultipleTest {

	void run() {
		System.out.println("i am running");
	}
 }
		
class Multiple1 extends MultipleTest{
	
	void jog() {
		System.out.println("i am jogging");
	}
}
class Multiple2 extends Multiple1 {
	
	void walk() {
		System.out.println("I am walking");
	}
}
public class TestInheritance2{
	public static void main(String[] args) {
		
		Multiple2 m2 = new Multiple2();
		m2.walk();
		m2.jog();
		m2.run();
	}
}
 

