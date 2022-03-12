package org.collectiontask3.java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Task3 {

	public static void main(String[] args) {

		HashMap<String,String> cc = new HashMap<>();
		cc.put("India","Delhi");
		cc.put("England","London");
		cc.put("Bangladesh","Dhaka");
		cc.put("UAE","Dubai");
		cc.put("USA","Washington DC");
		System.out.println("iterate using for each loop");
		for(String i : cc.keySet()) {
			System.out.println(i+ " "+cc.get(i));
		}
		
		 System.out.println("Iterating Hashmap using entry set");  
		   for(Map.Entry m : cc.entrySet()){    
		    System.out.println(m.getKey()+" "+m.getValue());
	}
		   System.out.println("hashmap using entryset in java iterator");
		   Iterator itr = cc.entrySet().iterator();
		   while(itr.hasNext()) {
			   System.out.println(itr.next());
		   }

}
}

