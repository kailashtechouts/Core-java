package org.java8.java;

interface Thinking{  
    void think();  
}  
public class InstanceMethod {
	public void thinkSomething(){  
        System.out.println("Hello, this is instance method.");  
    }  

	public static void main(String[] args) {
 
		        InstanceMethod methodReference = new InstanceMethod(); 
		           Thinking th = methodReference::thinkSomething; 
		            th.think();  
		            Thinking th2 = new InstanceMethod()::thinkSomething;  
		            
		            th2.think();  
		  }  
}  

		   