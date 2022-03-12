package org.inheritance.java;

class Hierarchy{
	
	void man() {
		System.out.println("He is walking with 2 legs");
	}
}
class Animal extends Hierarchy {
	 
	void tiger() {
		System.out.println("It is walking with 4 legs");
	}
}
class Birds extends Hierarchy {
	
	 void parrot() {
		 System.out.println("It is flying with wings");
	 }
}

public class TestInheritance3 {

	public static void main(String[] args) {
		
		Birds br = new Birds();
		br.man();
		br.parrot();
	}

}
