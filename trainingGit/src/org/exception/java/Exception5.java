package org.exception.java;

public class Exception5 {
		
	public static void confirm(int age) {
		
		if(age<18) {
			
			throw new ArithmeticException("He is not eligible to vote");
		}
		else {
			System.out.println("He is eligible to vote");
		}
	}
	public static void main(String[] args) {
		
		confirm(15);
		System.out.println("print remaining code");

	}

}
