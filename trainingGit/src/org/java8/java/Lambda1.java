package org.java8.java;

interface Expression{
	public void read();
}
public class Lambda1 {

	public static void main(String[] args) {

		int page = 24;
		Expression exp = ()->{
			System.out.println("reading page number:" +page);
		};
		exp.read();
		}
	}

