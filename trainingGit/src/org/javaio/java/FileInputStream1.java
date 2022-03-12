package org.javaio.java;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileInputStream1 {

	public static void main(String[] args) {

		try {
			FileInputStream fin = new FileInputStream("D:\\testout.txt");
			int i = fin.read();
			System.out.println((char)i);
			fin.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
