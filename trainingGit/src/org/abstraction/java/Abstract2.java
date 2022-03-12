package org.abstraction.java;


abstract class Bike {
	
	   Bike() {
		   System.out.println("bike is new");
		   }  
	   
	   abstract void run();  
	   void changeGear() { 
		   System.out.println("gear has been changed");
		   }  
	 }  
  
	 class Honda extends Bike{  
	 void run() {
		 System.out.println("run with medium speed");
		 }  
	 }  
	 	  
	public  class Abstract2{  
	 public static void main(String args[]) {  
	  Bike obj = new Honda();  
	  obj.run();  
	  obj.changeGear();  
	 }  
	}  



