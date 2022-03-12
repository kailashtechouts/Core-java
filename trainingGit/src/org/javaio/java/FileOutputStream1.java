package org.javaio.java;
import java.io.FileOutputStream;

public class FileOutputStream1 {

	public static void main(String[] args) {

		try {
			FileOutputStream fout = new FileOutputStream("D:\\testout.txt");
			fout.write(45);
			fout.close();
			System.out.println("Success");
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
