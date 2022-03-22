package org.assign14.java;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Employee {
	int id;
	String name;
	Employee(int id,String name){
		this.id=id;
		this.name=name;	
	}
	public void create() {
		File fl =new File("D:\\Task14.txt");
		System.out.println(" Employee : "+fl.exists());
	}
	public void write(Object obj) throws IOException {
		PrintWriter pw =new PrintWriter("D:\\Task14.txt");
		pw.print(obj);
		pw.close();
	}
	public void read() throws IOException {
		FileReader fr =new FileReader("D:\\Task14.txt");
		Scanner sc=new Scanner(fr);
		while(sc.hasNext()) {

			System.out.println(sc.next());
		}
	}

	public String toString() {
		return "Employee [id=" + id + ",name=" + name;
	}

}