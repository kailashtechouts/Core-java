package org.exceptionhandling1tasks.java;
import java.util.Scanner;
import java.util.ArrayList;

class InvalidEmployeeIDException extends Exception {
		
		public InvalidEmployeeIDException(String str) {
			
			super(str);
		}
	}
public class CustomException {

public static void main(String[] args) {
	 
	Scanner sc = new Scanner(System.in);
	PojosTask1  pj = new  PojosTask1("pavan",533,"sangareddy");
	PojosTask1  pj1 = new  PojosTask1("hari",534,"jogipet");
	PojosTask1  pj2 = new  PojosTask1("chakri",531,"balanagr");
	ArrayList<PojosTask1> list = new ArrayList<PojosTask1>();
	
	list.add(pj);
	list.add(pj1);
	list.add(pj2);
	System.out.println("enter your ids:");
	int id = sc.nextInt();
	try {
	for(int i =0; i<list.size(); i++ ) {
		if(list.get(i).id_no==id) {
			System.out.println("welcome to office");
			return;
		}
	
	}
         throw new InvalidEmployeeIDException("Invalid ID");

		}
		catch(InvalidEmployeeIDException ieie) {
			
			System.out.println("caught the exception");
		    System.out.println("Exception Occured" +ieie);
		}

System.out.println("Print remaining code...");
}
}

