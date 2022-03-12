package org.java8.java;

interface Drinking{
	void softdrink(String name);
}
public class FunctionalInterface1 implements Drinking {
	public void softdrink(String name) {
		System.out.println(name);
	}

	public static void main(String[] args) {
		FunctionalInterface1 fi1 = new FunctionalInterface1();
		fi1.softdrink("Tata glucose");
	}

}
