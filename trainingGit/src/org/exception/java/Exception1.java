package org.exception.java;

public class Exception1 {

	public static void main(String[] args) {
		
		try {
			int i = 20/0;
			
		}
		catch(ArithmeticException ae) {
			
			System.out.println(ae);
		}
			System.out.println("print remaning program");
	}

}
