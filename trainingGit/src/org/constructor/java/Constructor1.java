package org.constructor.java;

public class Constructor1 {
	int id;
	String name;
	  void display() {
		System.out.println(id+ " "+name);
	}
      Constructor1() {
    	System.out.println("constructor is called");
      }
    	

	public static void main(String[] args) {
		Constructor1 cs = new Constructor1();
	    cs.display();
		cs.display();

	}

}
