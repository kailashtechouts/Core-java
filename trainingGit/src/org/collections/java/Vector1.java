package org.collections.java;
import java.util.*;

public class Vector1 {
	
	public static void main(String args[]) {
		
		Vector<String> animals = new Vector<String>();
		animals.add("Lion");
	    animals.add("Tiger");
	    animals.add("Leopard");
	    animals.add("cheeta");
	    animals.add(null);
	    animals.add("black panther");
	    
	    System.out.println(animals);
	    animals.addElement("Horse");
	    animals.addElement(null);
	    System.out.println(animals);
	    
	    animals.removeElement("cheeta");
	    System.out.println(animals);
	    animals.removeElementAt(4);
	    System.out.println(animals);
	    
	    animals.clone();
	    System.out.println(animals);
	    
	    System.out.println(animals.size());
	    System.out.println(animals.capacity());
	    
	    
	    animals.contains(null);
	    System.out.println(animals);
	    animals.containsAll(animals);
	    System.out.println(animals);
	     animals.clear();
	    System.out.println(animals);
	    
	}

}
