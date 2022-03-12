package org.javaio.java;

import java.io.File;
import java.io.FileReader;

public class File3 {

	public static void main(String args[]) {
		try {
		
		File f1 = new File("D:\\test", "testout2.txt");
		FileReader fr = new FileReader(f1);
		int i = 789;
		while((i=fr.read())!=-1)    
	          System.out.print((char)i);  
	          fr.close();    
		}
	          catch(Exception e) {
	        	  e.printStackTrace();
	          }
		}
	}

