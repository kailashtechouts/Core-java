package org.collections.java;

import java.util.*;
import java.util.TreeSet;
class TreeSet1 {

	public static void main(String[] args) {

		TreeSet<String> Footballplayers = new TreeSet<String>();
		Footballplayers.add("kaka");
		Footballplayers.add("ronaldhino");
		Footballplayers.add("messi");
		Footballplayers.add("pogba");
		Footballplayers.add("ronaldo");
		Footballplayers.add("neymar");
		
		System.out.println(Footballplayers);
		
		Footballplayers.remove("messi");
		System.out.println(Footballplayers);
		
		Footballplayers.pollFirst();
		System.out.println(Footballplayers);
		Footballplayers.pollLast();
		System.out.println(Footballplayers);
		LinkedHashSet<String> Footballplayers1 = new LinkedHashSet<String>();
		Footballplayers1.add("greizzman");
		Footballplayers1.add("kane");
		Footballplayers1.add("david");
		Footballplayers1.addAll(Footballplayers1);
		System.out.println(Footballplayers1);
		
		System.out.println(Footballplayers1.size());
		
		Footballplayers1.removeAll(Footballplayers1);
		System.out.println(Footballplayers);
		
		Footballplayers.removeIf(str->str.contains("kaka"));
		System.out.println(Footballplayers);
		Footballplayers.clear();
		System.out.println(Footballplayers);
		
	}
}
		
	
