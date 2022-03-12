package org.collectiontask18.java;

import java.util.ArrayList;
import java.util.Collections;

public class Task18 {
	static int i, j;
	static int mid;
	public static void main(String args[]) {
		
		ArrayList<String> people = new ArrayList<String>();
		people.add("Pavan");
		people.add("Hari");
		people.add("Shyam");
		people.add("Chakri");
		people.add("Raghu");
		people.add("Babu");
		people.add("kailash");
		Collections.sort(people);
		System.out.println(people);
		
	mid = (people.size()/2) + (people.size()%2) ;
		for( i =0; i<mid; i++) {
			System.out.println(people.get(i).toUpperCase());	
			}
			for(int j = mid; j<people.size(); j++){
				System.out.println(people.get(j).toLowerCase());
			}
			
		}
	}

