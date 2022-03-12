package org.collectiontask2.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task2 {

	public static void main(String[] args) {
    String[] arr= new String[5];
    arr[0] = "king";
    arr[1] = "cool";
    arr[2] = "calm";
    arr[3] = "aggresive";
    arr[4] = "fighter";

    List al = Arrays.asList(arr);
    
    System.out.println(al);
    
    ArrayList l1 = new ArrayList();
    l1.add("ram");
	l1.add("laxman");
	l1.add("vinayak");
	l1.add("ganesh");
	l1.add("shiva");
	
	 Object[] String = l1.toArray();
	 System.out.println(l1);
	 }
	
	
	}


