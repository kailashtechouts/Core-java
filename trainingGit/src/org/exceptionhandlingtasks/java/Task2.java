package org.exceptionhandlingtasks.java;

public class Task2 {

	public static void main(String[] args) {
		
		try {
		int[] i = new int[10];
		i[12] = 90/0;
	}
		catch(ArithmeticException ae) {
			
			System.out.println("Occuring Arithmetic Expression");
		}
		catch(ArrayIndexOutOfBoundsException aioobe) {
			
			System.out.println("Occuring of Array Index Exception");
		}
		catch(Exception e) {
			System.out.println("Main Exception");
		}
		System.out.println("Enter remaining code of program ");
    }
}
