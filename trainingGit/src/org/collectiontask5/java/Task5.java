package org.collectiontask5.java;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task5 {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Mango");
		ll.add("Apple");
		ll.add("Pomegrande");
		ll.add("Orange");
		ll.add("Gauva");
		
	System.out.println(ll);
	
	 List<String> aList = new ArrayList<String>(ll);
     System.out.println("The ArrayList elements are: ");
     for (Object i : aList) {
         System.out.println(i);
     	}
	}
}

