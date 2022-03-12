package org.exception.java;

public class Exception2 {

	public static void main(String[] args) {
		
		try {
			int a[] = new int[5];
			a[7] = 40/0;
		}
		catch(ArithmeticException ae) {
			
			System.out.println("Arithmetic exception occur");
		}
		catch(ArrayIndexOutOfBoundsException aioobe) {
			
			System.out.println("Array index out of bonds occurs");
		}
		catch(Exception e) {
			
			System.out.println("parent exception occurs");
		}
			System.out.println("print remaining of the code");
	}

}
