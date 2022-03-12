package org.collections.java;
import java.util.*;
import java.util.Collection;
public class LinkedList1 {

	public static void main(String args[]) {
		
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		
		list1.add(15);
		list1.add(29);
		list1.add(46);
		list1.add(55);
		
		System.out.println(list1);
		list1.addFirst(25);
		System.out.println(list1);
		list1.addLast(100);
		System.out.println(list1);
		System.out.println(list1.getFirst());
		System.out.println(list1.getLast());
		list1.removeFirst();
		list1.removeLast();
		System.out.println(list1);

		Collections.sort(list1);
		System.out.println(list1);
	}
}
