package org.abstraction.java;

abstract class Jntu {
	abstract void study(); 
}
 class Dvr extends Jntu {
	 void study() {
		 System.out.println("it is a good campus");
		 
	 }
 }
 class Mallareddy extends Jntu {
	 void study() {
		 System.out.println("It has 5 campus");
	 }
 }
public class AbstractTest {

	public static void main(String[] args) {
		
		Jntu jt = new Dvr();
		jt.study();

	}

}
