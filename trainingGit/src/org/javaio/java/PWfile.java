package org.javaio.java;

import java.io.File;
import java.io.PrintWriter;

public class PWfile {

	public static void main(String[] args) {
		try
		{
	    File f = new File("D:\\test","test1.txt");
		f.createNewFile();
		System.out.println(f.exists());
		PrintWriter pw = new  PrintWriter(f);
		pw.write(107);
		pw.write("\n");
		char ch[] = { 'k', 'a', 'i', 'l', 'a', 's', 'h'};
		pw.write(ch);
		String s = "Chaitankar";
		pw.write(s);
		pw.write("\n");
		pw.println("Good boy");
		pw.println("I am a sports lover");
		pw.flush();
		pw.close();
		}
		 catch(Exception e) {
			 e.printStackTrace();
		 }
	}

}
