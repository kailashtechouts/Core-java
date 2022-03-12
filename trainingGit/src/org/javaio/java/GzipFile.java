package org.javaio.java;

import java.io.*;
import java.util.zip.GZIPOutputStream;
public class GzipFile {

	public static void main(String[] args) {
		
		String source_filepath = "D:\\test\\test.txt";
		String destination_filepath = "D:\\test\\test.gzip";
		
		GzipFile cgp =new  GzipFile();
		cgp.cgp(source_filepath, destination_filepath);
	}
	public void cgp(String source_filepath, String destination_filepath) {
		
		byte[] buffer = new byte[1024];
		try
		{
			FileInputStream fin = new FileInputStream(source_filepath);
			FileOutputStream fout = new FileOutputStream(destination_filepath);
			GZIPOutputStream gzip = new GZIPOutputStream(fout);
			
			int bytes_read;
            
            while ((bytes_read = fin.read(buffer)) != -1) {
                gzip.write(buffer, 0, bytes_read);
            }
 
            fin.close();
 
            gzip.finish();
            gzip.close();
 
            System.out.println("The file is compressed successfully!");
 
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
}


