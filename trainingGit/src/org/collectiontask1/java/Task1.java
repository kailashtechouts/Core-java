package org.collectiontask1.java;

import java.util.*;

public class Task1 {

	public static void main(String[] args) {
		
		ArrayList<String> al1 = new ArrayList<>();
		al1.add("ram");
		al1.add("laxman");
		al1.add("vinayak");
		al1.add("ganesh");
		al1.add("shiva");
		System.out.println(al1);
		
		HashSet<String> h1 = new HashSet<>();
		h1.add("sachin");
		h1.add("Dravid");
		h1.add("laxman");
		h1.add("jaffer");
		h1.add("ganguly");
		System.out.println(h1);
		
		HashMap<Integer,String> hm = new HashMap<>();
		hm.put(1,"zaheer");
		hm.put(2,"sreeshanth");
		hm.put(3,"nehra");
		hm.put(4,"kapil");
		hm.put(5,"balaji");
		System.out.println(hm);
		
		

	}

}
