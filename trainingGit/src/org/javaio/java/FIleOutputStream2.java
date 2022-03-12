package org.javaio.java;

import java.io.FileOutputStream;

public class FIleOutputStream2 {

	public static void main(String[] args) {

		try {
			FileOutputStream fout = new	FileOutputStream("D:\\wakoo.txt");
			String s = "Welcome to Techouts";
			byte b[] = s.getBytes();
			fout.write(b);
			fout.close();
			System.out.println("Success");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
