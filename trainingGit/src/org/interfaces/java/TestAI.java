package org.interfaces.java;


interface Cricket{
	 void rohit();
	 void kohli();
	 void bhuvi();
	 void abd();
}
abstract class Golf implements Cricket {
	 public void abd() {
		 System.out.println("I am ab devilliers");
	 }
}
	 class Football extends Golf {
		 public void rohit() {
			 System.out.println("I am rohit sharma");
		 }
		 public void kohli() {
			 System.out.println("I am virat kohli");
		 }
		 public void bhuvi() {
			 System.out.println("I am bhuvaneshwar");
		 }
	 }
		 
public class TestAI {

public static void main(String[] args) {
	 Cricket c = new Football();
	 c.rohit();
	 c.kohli();
	 c.bhuvi();
	 c.abd();

}

}

