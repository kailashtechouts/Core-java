package org.assign14.java;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Manager extends Employee{
	
	Manager(int id, String name) {
		super(id, name);
	}
	public void create() {
		File fl =new File("D:\\TAsk14.1.txt");
		System.out.println("Manager class: "+fl.exists());
	}
	public void write(Object obj) throws IOException {
		PrintWriter pw =new PrintWriter("D:\\Task14.1.txt");
		pw.print(obj);
		pw.close();
	}
	public void read() throws IOException {
		FileReader fr =new FileReader("D:\\Task14.1.txt");
		Scanner sc=new Scanner(fr);
		while(sc.hasNext()) {
			System.out.println(sc.next());
		}
	}
}