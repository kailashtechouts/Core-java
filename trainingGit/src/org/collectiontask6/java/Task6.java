package org.collectiontask6.java;

import java.util.HashSet;

public class Task6 {

	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("sachin");
		hs.add("Dravid");
		hs.add("laxman");
		hs.add("jaffer");
		hs.add("ganguly");
		System.out.println(hs);
		
		String arr[] = new String[hs.size()];
        hs.toArray(arr);
  
        for (String i : arr)
            System.out.println(i);
    }

	}


