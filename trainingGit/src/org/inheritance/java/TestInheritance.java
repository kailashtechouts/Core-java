package org.inheritance.java;

class SingleTest {

	void maths() {
		System.out.println("maths exam is on monday");
	}
}
class TwoTest extends SingleTest{
	
	void science() {
		System.out.println("science exam is on tuesday");
	}
}
 public class TestInheritance {
	
	public static void main(String[] args) {
		
		TwoTest tt = new TwoTest();
		tt.science();
		tt.maths();
	}
}

