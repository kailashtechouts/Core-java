package org.java8.java;

interface Expression1{
	public String search(String name);
}
public class Lambda2 {

	public static void main(String[] args) {

		Expression1 exp1 = (name)->{
			return "Hello" +" " +name;
		};
		System.out.println(exp1.search("Agarwal"));
	}

}
