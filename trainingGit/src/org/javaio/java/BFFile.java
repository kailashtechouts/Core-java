package org.javaio.java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class BFFile {

	public static void main(String[] args) {
		try
		{
		  File f = new File("D:\\test","test.txt");
		  f.createNewFile();
	        System.out.println(f.exists());
	        FileWriter fw = new FileWriter(f);
	        BufferedWriter bw = new BufferedWriter(fw);
	        bw.write("My name is Khan");
	        bw.newLine();
	        char[] ch =
	        { 'a', 'b', 'c', 'd' };
	        bw.write(ch);
	        bw.newLine();
	        bw.write("I am  a Wrestler");
	        bw.newLine();
	        bw.write(" I am  a trainer");
	        bw.flush();
	        bw.close();
	        
	        FileReader fr = new FileReader(f);
	        BufferedReader br = new BufferedReader(fr);
	        String s = br.readLine();
	        while (s != null)
	        {
	            System.out.println(s);
	            s = br.readLine();
	        }
	        br.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
