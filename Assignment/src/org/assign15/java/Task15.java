package org.assign15.java;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Task15 {

	public static void main(String[] args) throws IOException {
		
		Employee emp=new Employee(100,"Krishna",35000);
		Employee emp1=new Employee(101,"Ram",47000);
		List <Employee> l=new ArrayList<>();
		l.add(emp);
		l.add(emp1);
		File f = new File("D:\\Fileread.txt");
		PrintWriter pw =new PrintWriter(f);
		pw.print(l);
		pw.close();
		System.out.println("Only Read "+f.setReadOnly());

	}

}

