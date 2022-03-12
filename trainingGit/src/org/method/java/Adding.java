package org.method.java;

	class Adding1 {

    static int add(int a, int b) {
    	return a + b;
    }
    static int add(int a, int b, int c) {
    	return a + b + c;	
    }
	}  
	public class Adding{
    	
	public static void main(String[] args) {
		 
		System.out.println(Adding1.add(11, 15));
		System.out.println(Adding1.add(12, 15, 20));

		}
    }

