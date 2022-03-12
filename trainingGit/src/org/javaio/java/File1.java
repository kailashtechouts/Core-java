package org.javaio.java;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class File1 {

	public static void main(String[] args) throws IOException {

		File f = new File("D:\\Sample");
		System.out.println(f.exists());
		f.mkdir();
		System.out.println(f.isFile());
		System.out.println(f.isDirectory());
	
		
		File f1 = new File("D:\\Sample", "test1.txt");
		f1.createNewFile();
		System.out.println(f1.exists());
		System.out.println(f1.isFile());
		System.out.println(f1.isDirectory());
		

		FileWriter fw = new FileWriter(f1, true);
		fw.write(98);
		fw.write(97);
		fw.write(116);
		fw.write("Hi\n How r u\n");
		fw.flush();
		fw.close();
	}

}
