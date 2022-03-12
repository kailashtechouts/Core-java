package org.collectiontask8.java;

import java.util.Iterator;
import java.util.TreeMap;

public class Task8 {

	public static void main(String[] args) {
		

	    TreeMap<String, Integer> t8 = new TreeMap<String, Integer>();
	    
	    t8.put("Chetan", 32);
	    t8.put("Indrajit", 30);
	    t8.put("Shreyas", 33);
	    t8.put("Prashanth", 27);
	    
	    Iterator <String> it = t8.keySet().iterator();       
	    while(it.hasNext())   {  
	    String  key=(String)it.next();  
	    System.out.println("name: "+key+"     age: "+t8.get(key));  
	    	}  
	    }  
	}

