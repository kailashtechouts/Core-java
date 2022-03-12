package org.java8.java;

interface Showable{  
    void show();  
}  
public class StaticMethod {
	 
	public static void showError() {
			
		        System.out.println("Hello, this is static method.");  
		    }  
	public static void main(String[] args) {

		        Showable s = StaticMethod::showError;  
		        s.show();  
		    }  
		}  


