package org.javaio.java;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class SequenceInputStream1 {

	public static void main(String args[])throws IOException{
	
		FileInputStream fin1 = new FileInputStream("D:\\testout.txt");
		FileInputStream fin2 = new FileInputStream("D:\\testout.txt");
		SequenceInputStream sis = new SequenceInputStream(fin1, fin2);
		int k;
		while((k=sis.read())!=-1) {
			System.out.print((char)k);
		}
		sis.close();
		fin1.close();
		fin2.close();
	}
}
