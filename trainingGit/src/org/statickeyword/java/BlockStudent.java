package org.statickeyword.java;

public class BlockStudent {
	
	static int i;
	int j;
	
	static{
		i = 10;
		System.out.println("static block is called");
	}

	public static void main(String[] args) {
		
		System.out.println(BlockStudent.i);

	}

}
