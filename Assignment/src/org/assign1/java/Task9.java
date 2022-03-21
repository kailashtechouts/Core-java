package org.assign1.java;
import java.util.Iterator;
/*  Perform analysis on ListIterator and Iterator and provide your handson examples on each analysis.
 */
import java.util.LinkedList;
import java.util.ListIterator;

public class Task9 {

	public static void main(String[] args) {

		LinkedList cricket = new LinkedList();
		cricket.add("Virat");
		cricket.add("Rohit");
		cricket.add("SMith");
		cricket.add("Kane");
		cricket.add("Bhuvi");
		cricket.add("Sreeshanth");

		ListIterator<String> citr = cricket.listIterator();
		while (citr.hasNext()) {
			System.out.println(citr.next());
			
			System.out.println("----------------------------------------");
			
			Iterator<String> itr = cricket.iterator();
			while(itr.hasNext()) {
				  System.out.println(itr.next());
				}

		}
		
	}
}
