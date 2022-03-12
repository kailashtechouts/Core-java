package org.collections.java;
import java.util.*;
import java.util.Collections;
public class ArrayList1 {
	
	public static void main(String args[]) {
		
		ArrayList<String> bikes = new ArrayList<String>();
		bikes.add("honda");
		bikes.add("passion");
		bikes.add("royal enfield");
		bikes.add("bmw");
		bikes.add("ninja");
		bikes.add("harley");
		
		System.out.println(bikes);
		bikes.set(1, "java");
		bikes.remove(3);
		
		System.out.println(bikes);
		System.out.println(bikes.size());
		System.out.println(bikes.get(3));

		Collections.sort(bikes);
		for(String i : bikes) {
			System.out.println(i);
			
		}
		}
	}


