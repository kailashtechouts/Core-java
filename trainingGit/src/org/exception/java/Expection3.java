package org.exception.java;

public class Expection3 {

	public static void main(String[] args) {
		
		try {
			int i =60/0;
			
		}
		catch(ArithmeticException ae) {
			
			System.out.println("arithmetic expression occurs");
		}
		finally {
			System.out.println("finally code will be executed without fail");
		}

	}

}
