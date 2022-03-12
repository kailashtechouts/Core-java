package org.exception.java;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exception6 {
	
	public static void myMethod() throws FileNotFoundException {
		
		FileReader fr = new FileReader("D:\\testone.txt");
		BufferedReader frinput = new BufferedReader(fr);
	
		throw  new FileNotFoundException();
	}

	public static void main(String[] args) {

			try {
				myMethod();
			}
			catch(FileNotFoundException fnfe) {
				
				fnfe.printStackTrace();
			}
				System.out.println("print remaining output");
	}

}
