package org.collectiontask17.java;
import java.util.*;

public class Task17 {
      Scanner sc = new Scanner(System.in);
      
	  HashMap<Integer, Float> children=new HashMap<>();    
      HashMap<Integer, String> children1=new HashMap<>(); 
      public void myMethod(int x){
    	  for(int i = 0; i<x; i++) {
    		  System.out.println("Enter register numbers and marks");
    		  children.put(sc.nextInt(), sc.nextFloat());
    	  }
      
      for(Integer i : children.keySet()){
   	   		if(children.get(i) >= 90){
   	   			children1.put(i, "Gold");
   	   		}
   	   		else if(children.get(i) >=80 && children.get(i) < 90) {
   	   			children1.put(i, "Silver");
   	   		}
   	   		else if(children.get(i) >=70 && children.get(i) < 80) {
   	   			children1.put(i, "Bronze");
   	   		}
   	   		else {
   	   			children1.put(i,"student is not eligible");
   	   			}
   	   	}
      System.out.println(children1);
      sc.close();
  }  
}  


