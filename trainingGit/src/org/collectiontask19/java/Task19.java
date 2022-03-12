package org.collectiontask19.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class Task19 {

	public static void main(String[] args) {

			ArrayList<Integer> numbers = new ArrayList<Integer>();
			numbers.add(70);
			numbers.add(45);
			numbers.add(100);
			numbers.add(88);
			numbers.add(70);
			numbers.add(62);
			numbers.add(45);
			System.out.println(numbers);
			
			TreeSet<Integer> numbers1 = new TreeSet<>();
			numbers1.addAll(numbers);
			System.out.println(numbers1);
			 Iterator i=numbers1.descendingIterator();  
	         while(i.hasNext())  
	         {  
	             System.out.println(i.next());  
	         }  
	           
	 }  


	}


