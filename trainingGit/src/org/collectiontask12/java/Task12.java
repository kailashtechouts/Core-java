package org.collectiontask12.java;

import java.io.*;
import java.util.*;

public class Task12 {

	public static void main(String args[]) {
		
		ArrayList<String> god = new ArrayList<>();
		god.add("ram");
		god.add("laxman");
		god.add("vinayak");
		god.add("ganesh");
		god.add("shiva");
		System.out.println(god);
		
		try {
			
			FileOutputStream fos = new FileOutputStream("file");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(god);
			fos.close();
			oos.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}
}
