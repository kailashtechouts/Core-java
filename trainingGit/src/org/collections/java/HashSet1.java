package org.collections.java;
import java.util.*;
import java.util.HashSet;
class HashSet1 {

	public static void main(String[] args) {

		HashSet<String> fruits = new HashSet();
		fruits.add("Mango");
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Gauva");
		fruits.add("Orange");
		fruits.add("Watermelon");
		
		System.out.println(fruits);
		
		fruits.remove("Banana");
		System.out.println(fruits);
		
		HashSet<String> fruits1 = new HashSet<String>();
		fruits1.add("Pineapple");
		fruits1.add("Strawberry");
		fruits.add("Blackberry");
		fruits.addAll(fruits1);
		System.out.println(fruits);
		
		fruits.removeAll(fruits1);
		System.out.println(fruits);
		
		fruits.removeIf(str->str.contains("Watermelon"));
		System.out.println(fruits);
		fruits.clear();
		
		
	
	}

}
