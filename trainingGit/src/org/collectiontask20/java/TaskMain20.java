package org.collectiontask20.java;

import java.util.*;

public class TaskMain20 {

	public static void main(String args[]) {
	 	
		HashMap<String, String> tm = new HashMap<String, String>();
		String s="tamilnadu||chennai-karanataka||bengaluru-telangana||hyderabad";
		String arr[]=s.split("-");
		for (String i:arr) {
			String str[]=i.split("[||]");
			String state=str[0].trim();
			String capital=str[2].trim();
			tm.put(state, capital);
		}
		System.out.println(tm);
		
	}
}
