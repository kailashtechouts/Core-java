package org.variable.java;

public class LocalStaticInstance {
	static int i = 4;
	public void myMethod(){
		int i;
	}
	public static void main(String args[]) {
		LocalStaticInstance lsi = new LocalStaticInstance();
		int i = 6;
		System.out.println(i);
	}

}
