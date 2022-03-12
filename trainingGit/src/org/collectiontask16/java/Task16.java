package org.collectiontask16.java;

import java.util.HashMap;
import java.util.Map;

public class Task16 {
	public static void main(String[] args) {

	  HashMap<String, Float> hm=new HashMap<String, Float>();    
	      
	      hm.put("selva", 75.6f);
	      hm.put("abi", 89.5f);
	      hm.put("ram", 40.0f);
	      System.out.println("Initial list of elements:" +hm);
	      
	       HashMap<String, String> hm1=new HashMap<String ,String>();  
	       for(String i : hm.keySet()){
	    	   if(hm.get(i) >60)
	    		   hm1.put(i, "pass");
	    	   else
	    		   hm1.put(i, "fail");
	       }
	       System.out.println(hm1);
	}
}
