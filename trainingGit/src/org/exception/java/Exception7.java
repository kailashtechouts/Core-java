package org.exception.java;

public class Exception7 {

	public static int divide(int x, int y) throws ArithmeticException {
		
		int divide =x/y;
		return divide;
		
	}
	public static void main(String[] args) {
		Exception7 ep7 = new Exception7();
		
		try {
			System.out.println(ep7.divide(70, 0));
		}
		catch(ArithmeticException ae) {
			System.out.println(ae);
		}
			System.out.println("read remaining program");
	}

}
