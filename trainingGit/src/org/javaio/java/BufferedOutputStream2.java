package org.javaio.java;

import java.io.*;

public class BufferedOutputStream2 {

	public static void main(String[] args)throws IOException {
		
			FileOutputStream fout = new FileOutputStream("D:\\testout.txt");
		    BufferedOutputStream bout = new BufferedOutputStream(fout);  
			String s = "Welcome to Techouts.com";
			byte b[] = s.getBytes();
			bout.write(b);
			bout.flush();
			bout.close();
			fout.close();
			System.out.println("Success");
		}

	}
