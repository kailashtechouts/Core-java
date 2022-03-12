package org.java8.java;

import java.util.function.BiFunction;

class Adding{  
	public static int add(int a, int b){  
	return a + b;  
	}  
	public static float sub(float a, int b) {
		return a - b;
	}
	public static float mul(float a, float b) {
		return a * b;
	}
	}  
public class StaticBiFunction {

	public static void main(String[] args) { 
			BiFunction<Integer, Integer, Integer>adder = Adding::add;  
			BiFunction<Float, Integer, Float>adder1 = Adding::sub;  
			BiFunction<Float, Float, Float>adder2 = Adding::mul;  
			int result = adder.apply(10, 20);  
			float result1 = adder1.apply(20.5f, 8);  
			float result2 = adder2.apply(10.4f, 20.4f);  
			System.out.println(result);  
			System.out.println(result1);  
			System.out.println(result2);  
			}  
	}  
