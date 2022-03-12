package org.Compareandcomparator.java;

import java.util.ArrayList;
import java.util.Collections;

public class Comparable1  {

	public static void main(String[] args) {

		ArrayList<Student2> al=new ArrayList<Student2>();  
		al.add(new Student2(31,23,"chakri"));  
		al.add(new Student2(32,24,"hari"));  
		al.add(new Student2(30,22,"pavan"));  
		  
		Collections.sort(al);  
		for(Student2 st1:al){  
		System.out.println(st1.id_no+" "+st1.age+" "+st1.name);  
		}  
	}  
}  

