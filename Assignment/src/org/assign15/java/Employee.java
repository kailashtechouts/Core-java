package org.assign15.java;
/* Employee has methods for create, read and write to a file.
	Manager extends employer and have these file methods overriden(Examine here without handling the exceptions) along with delete the file.*/
public class Employee {
	int id;
	String name;
	float sal;
	Employee(int id,String name,float sal){
		this.id=id;
		this.name=name;
		this.sal=sal;
	}
	public String toString() {
		return "Employee [id=" + id + ",name=" + name + ",salary=" + sal;
	}
}

