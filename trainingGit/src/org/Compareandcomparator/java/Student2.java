package org.Compareandcomparator.java;

import java.lang.*;

class Student2 implements Comparable<Student2>{
    	int id_no;
    	int age;
    	String name;
    	Student2(int id, int age, String name) {
    		this.id_no = id;
    		this.age = age;
    		this.name = name;
    	}
    	public int compareTo(Student2 st1) {
    		if(age == st1.age)
    			return 0;
    		else if(age>st1.age)
    			return 1;
    		else
    			return -1;
		}
    }
