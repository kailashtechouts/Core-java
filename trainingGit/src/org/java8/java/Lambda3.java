package org.java8.java;

interface Expression3{
	public int find(int a, int b);
}
public class Lambda3 {

	public static void main(String[] args) {
		
		Expression3 exp2 = (a,b)->(a + b);
		System.out.println(exp2.find(15,63));
		
	Expression3 exp21 = (int a, int b)->(a*b);
	System.out.println(exp21.find(15,20));
	}
}
