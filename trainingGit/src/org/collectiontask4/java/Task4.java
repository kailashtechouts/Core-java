package org.collectiontask4.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/*4. perform followiing operations on array list
a)How to Iterate ArrayList using Java ListIterator
b)Arraylist add element at specific index
c)Sort ArrayList in descending order
d)insert an element to ArrayList using ListIterator
e)Hsort arraylist of strings alphabetically java
f)Sort elements of Java ArrayList
g)replace an element at specified index arraylist
h)Search an element of Java ArrayList
i)Remove element from specified index ArrayList
j)Remove duplicates from arraylist without using collections*/
public class Task4 {

	public static void main(String[] args) {
		ArrayList<String> t4 = new ArrayList<>();
		t4.add("ram");
		t4.add("laxman");
		t4.add("vinayak");
		t4.add("ganesh");
		t4.add("shiva");
		System.out.println(t4);
		
		System.out.println("Arraylist using listiterator");
		ListIterator<String> iterator = t4.listIterator( );  
		while (iterator.hasNext())  
		{  
		String i = iterator.next();  
		System.out.println(i);  
		}
		System.out.println("--------------------------------------------------------");
		
		System.out.println("Arraylist add element at particular index");
		t4.add(3, "Hanuman");
		System.out.println(t4);
		
		System.out.println("--------------------------------------------------------");
		
		System.out.println("add element using list iterator");
		 List<String>  li = new ArrayList<>();  
	      Iterator<String> itr = null;  
	      li.add("Sai baba");         
	      itr = li.listIterator();     
	      while(itr.hasNext()){  
	          System.out.println(itr.next());  
	          
	          System.out.println("------------------------------------------------------------");
	          
	         System.out.println("sort arraylist in descending");
	         Collections.sort(t4, Collections.reverseOrder());
	         System.out.println("arraylist in descending order:" +t4);
	         
	         System.out.println("------------------------------------------------");
	         
	         System.out.println("sort arraylist element in alphabetic order");
	         Collections.sort(t4);
	         for(int i=0; i<t4.size(); i++)
	             System.out.println(t4.get(i));
	         
	         System.out.println("------------------------------------------------------");
	         
	         System.out.println("sort elements of arraylist");
	         Collections.sort(t4);
	         System.out.println(t4);
	         
	         System.out.println("---------------------------------------------------------");
	         
	         System.out.println("replace element using index");
	         t4.set(3, "Malhari");
	         System.out.println(t4);
	         
	         System.out.println("-------------------------------------------------------------");
	         
	         System.out.println("to remove an element");
	         t4.remove(4);
	         System.out.println(t4);
	         
	         System.out.println("---------------------------------------------------------");
	         
	         System.out.println("to search an array");
	         t4.contains("Malhari");
	         System.out.println(t4);
	      }   
		
	}

}
