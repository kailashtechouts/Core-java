package org.assign22.java;

public abstract class Task22 implements Company{

	public static void main(String args[]) {
		Company c =(sp,cp,name)->{
			int profit = sp-cp;
			return profit+ " "+name;
		};
		System.out.println(c.getCompanyDetails(100,73,"Kailash"));

	}
}
