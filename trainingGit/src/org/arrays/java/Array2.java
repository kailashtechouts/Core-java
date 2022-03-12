package org.arrays.java;

import java.util.Arrays;

public class Array2 {

	public static void main(String[] args) {
		
		String[] cars = {"volvo", "maruti", "tata", "jaguar", "audi"};
		
		System.out.println(cars.length);
		System.out.println(cars[4]);
		cars[2] = "Bmw";
		System.out.println(cars[2]);
		System.out.println("----------------------------------------------------");
		for(int i=0; i<cars.length; i++) {
			
			System.out.println(cars[i]);
		}
		System.out.println("-----------------------------------------------------");
		Arrays.sort(cars);
		System.out.println("sorted arrys" +Arrays.toString(cars));

	}

}
