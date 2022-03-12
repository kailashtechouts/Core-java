package org.collectiontask.java;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

public class Task10 {

	public static void main(String args[]) {
		
	    HashMap<String, Integer> mens = new HashMap<String, Integer>();
	    
	    mens.put("vishwanath", 32);
	    mens.put("yashwanth", 30);
	    mens.put("vinayak", 33);
	    
	    System.out.println(mens);
	
	try {
		
		FileOutputStream fos = new FileOutputStream("file");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(mens);
		fos.close();
		oos.close();
	}
	catch(Exception e) {
		System.out.println(e);
		}
	}
}
