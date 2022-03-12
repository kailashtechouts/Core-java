package org.statickeyword.java;

public class VariableStudent {
	
	int rollno;
	String name;
	static String college = "Dvrcet";
	VariableStudent(int r, String n){
		rollno = r;
		name = n;
	}
	void display() {
		System.out.println(rollno+ " "+name+ " "+college);
	}
	

	public static void main(String[] args) {
		
		VariableStudent s1 = new VariableStudent(101, "Babu");
		VariableStudent s2 = new VariableStudent(102, "Raghu");
		s1.display();
		s2.display();
		
	}

}
