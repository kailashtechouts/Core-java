package org.exceptionhandlingtasks.java;


class PhoneValidException extends Exception {
	
	public PhoneValidException(String str) {
		
		super(str);
	}
}
public class Task3 {
	 

	 static void validate(int age) throws PhoneValidException {
		 
		 if(age < 15) {
	
		 throw new PhoneValidException("Given Employee is not found");
         }
		 else {
			 System.out.println("Welcome to office");
		 }
	 }
	 
public static void main(String[] args) {

	try {
		validate(10);
	}
	catch(PhoneValidException ieie) {
		
		System.out.println("caught the exception");
	System.out.println("Exception Occured" +ieie);
}
System.out.println("Print remaining code...");
 }
}


