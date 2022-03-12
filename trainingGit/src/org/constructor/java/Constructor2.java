package org.constructor.java;

public class Constructor2 {
	
	int id;
	String name;
	Constructor2(int i, String n){
	id = i;
	name = n;
	}
	void display() {
		System.out.println(id+ " "+name);
	}

	public static void main(String[] args) {
		
		Constructor2 cs1 = new Constructor2(111, "raghu");
		Constructor2 cs2 = new Constructor2(112, "babu");
		cs1.display();
		cs2.display();
		}

}
