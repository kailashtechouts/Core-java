package org.javaio.java;
import java.io.*;
public class File2 {

	public static void main(String args[]) throws IOException {
		File f1 = new File("D:\\test");
		f1.mkdir();
		File f2 = new File("D:\\test", "testout2.txt");
		f2.createNewFile();
		System.out.println(f2.exists());
        Writer w = new FileWriter(f2);
        String s = "I love my Dad";
        w.write(s);
        w.flush();
        w.close();
        Reader r = new FileReader(f2);
        int data = r.read();  
        while (data != -1) {  
            System.out.print((char) data);  
            data = r.read();  
        }  
        r.close();  
	}
}
