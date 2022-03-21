package org.assign2.java;

public class Task2 {

	public static void main(String[] args) {

		Trainee t1 = new Trainee("Rajarajeshwari", "Biology");
		Trainee t2 = new Trainee("Geeta", "All");
		StudyMaterial s1 = new StudyMaterial(101,"Indrajit", 99);
		StudyMaterial s2 = new StudyMaterial(102, "Chetan", 91);
		System.out.println("Teacher has two students:"+s1.name+"-"+s2.name);
		System.out.println("Student has two Teachers:" +t1.name+"-"+t2.name);
	}

}
