package org.collections.java;

import java.util.*;
import java.util.LinkedHashSet;
class LinkedHashSet1 {

	public static void main(String[] args) {

		LinkedHashSet<String> cricketplayers = new LinkedHashSet<String>();
		cricketplayers.add("Kapil");
		cricketplayers.add("Dravid");
		cricketplayers.add("Dhoni");
		cricketplayers.add("Kohli");
		cricketplayers.add("Rohit");
		cricketplayers.add("krunal");
		
		System.out.println(cricketplayers);
		
		cricketplayers.remove("Dhoni");
		System.out.println(cricketplayers);
		
		LinkedHashSet<String> cricketplayers1 = new LinkedHashSet<String>();
		cricketplayers1.add("Hardik");
		cricketplayers1.add("KL Rahul");
		cricketplayers1.add("Sreeshanth");
		cricketplayers1.addAll(cricketplayers1);
		System.out.println(cricketplayers);
		
		cricketplayers.removeAll(cricketplayers1);
		System.out.println(cricketplayers);
		
		cricketplayers.removeIf(str->str.contains("krunal"));
		System.out.println(cricketplayers);
		cricketplayers.clear();
		System.out.println(cricketplayers);
		System.out.println("Is the set empty: " + cricketplayers.isEmpty());
		
		
	
		
		}

}
