package org.assign1.java;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.OptionalDouble;
import java.util.OptionalInt;

/* Perform calculations such as count,sum,min,avg,max for given input of arrayList using Stream API*/
public class Task23 {
	
	int num;

	public static void main(String args[]) {
		
		ArrayList<Integer> prime = new ArrayList<>();
		prime.add(3);
		prime.add(5);
		prime.add(7);
		prime.add(9);
		prime.add(11);
		prime.add(73);
		OptionalInt max = prime
			      .stream()
			      .mapToInt(v ->v)
			      .max();
		System.out.println(max);
		 
		System.out.println("------------------------");
		
		OptionalInt min = prime
			      .stream()
			      .mapToInt(v ->v)
			      .min();
		System.out.println(min);
		
		System.out.println("---------------------------");
		
		int sum = prime
			      .stream()
			      .mapToInt(v ->v)
			      .sum();
		System.out.println(sum);
		
		System.out.println("------------------------------");
		
		long count = prime
			      .stream()
			      .mapToInt(v ->v)
			      .count();
		System.out.println(count);
		
		System.out.println("-------------------------------");
		
		OptionalDouble average = prime
			      .stream()
			      .mapToInt(v ->v)
			      .average();
		System.out.println(average);
	}
}
