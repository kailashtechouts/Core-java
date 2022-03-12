package org.statickeyword.java;
 class MethodStudent {
		 
	int rollno;
	String name;
	static String college = "Dvrcet";
	static void change() {
		college = "jntu";
	}
	MethodStudent(int r, String n){
		rollno = r;
		name = n;
	}
	void display() {
		System.out.println(rollno+ " "+name+ " "+college);
	}
 }
public class MStudent{
	public static void main(String args[]) {
		
		MethodStudent.change();
		MethodStudent s1 = new MethodStudent(101, "Babu");
		MethodStudent s2 = new MethodStudent(102, "Raghu");
		s1.display();
		s2.display();
		}
}
