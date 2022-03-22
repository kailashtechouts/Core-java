package org.assign1.java;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

class ConsumerInterface{
	static void showlist(List<Integer> list) {
		List<Integer> modify = list.stream().filter(x-> (x<3 || x>7)).map(x->x).collect(Collectors.toList());
		modify.forEach(y->System.out.println(y));
	}
}
public class Task24 {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		Consumer<List<Integer>> ci = ConsumerInterface::showlist;
		ci.accept(numbers);
	}
	}



