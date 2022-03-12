package org.collectiontask17.java;
import java.util.Scanner;

public class ChidrenResult {
	
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	Task17 ts = new Task17();
	System.out.println("Enter the no of Students:");
	ts.myMethod(sc.nextInt());
	sc.close();
	}

}
