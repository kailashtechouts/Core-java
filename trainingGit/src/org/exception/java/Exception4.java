package org.exception.java;

public class Exception4 {

	public static void main(String[] args) {

		try {
			
			try {
				System.out.println("divide with zero");
				int i =40/0;
			    }
			catch(ArithmeticException ae) {
				
				System.out.println(ae);
			   }
			     try {
				int a[] = new int[5];
				a[5] = 4;
			    }
			     catch(ArrayIndexOutOfBoundsException aioobe) {
				
				System.out.println(aioobe);
			    }
			    System.out.println("other comment");
		      }
	    catch(Exception e) {
			
			System.out.println("handle the main exception");
		}
		System.out.println("normal flow of execution");

	}

}
