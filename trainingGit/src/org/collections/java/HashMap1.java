package org.collections.java;


import java.util.HashMap;

public class HashMap1 {
  public static void main(String[] args) {

   
    HashMap<String, Integer> Names = new HashMap<String, Integer>();
    
    Names.put("John", 32);
    Names.put("Steve", 30);
    Names.put("Angie", 33);

    for (String i : Names.keySet()) {
      System.out.println("key: " + i + " value: " + Names
    		  .get(i));
    }
  }
}
