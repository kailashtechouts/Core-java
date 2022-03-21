package org.assign1.java;

interface Dancing{  
	void dance();  
}  
public class Task3 {

	public static void main(String args[]) {
		Dancing dg = new Dancing() {
			
			public void dance(){
				System.out.println("You know all dance forms");
				}  
		};  
		dg.dance();  
	}  
}  

