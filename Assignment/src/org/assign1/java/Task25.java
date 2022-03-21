package org.assign1.java;
import static java.util.stream.Collectors.toList;
import java.util.Arrays;
import java.util.List;

public class Task25 {

	public static void main(String[] args) {
		
			List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
			List<Integer> doubleArrayList = numbers.stream()
								                   .map(i -> i*2)
					        		               .collect(toList());
			System.out.println("Double values of ArrayList Integers: "+doubleArrayList);
		     }

	}


