package org.assign1.java;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task17 {

	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("D:\\Sample1.xls");
		PrintWriter pw =new PrintWriter(new File("D:\\ExcelToCsv.CSV"));
		Scanner sc=new Scanner(fr);
		while(sc.hasNextLine()) {
			pw.println(sc.next());
		}
		pw.close();
	}

}

