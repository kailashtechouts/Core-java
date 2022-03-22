package org.assign1.java;

import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Task16 {

	public static void main(String[] args) throws IOException {
		
		FileReader fr=new FileReader("D:\\Sample.CSV");
		PrintWriter pr= new PrintWriter("D:\\test1.XLS");
		Scanner sc= new Scanner(fr);
		while(sc.hasNext()) {
			pr.println(sc.next());
		}
		pr.close();
	}
}