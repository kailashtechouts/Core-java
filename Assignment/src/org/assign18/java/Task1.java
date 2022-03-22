package org.assign18.java;
/* Implement one-many association for Company and Employee.(Make sure to have rating,startYear for Employee)*/

class Employee {

	String name;
	 int rating;
	 int startyear;
	Employee(String name,int rating, int startyear)
	{
		this.name = name;
		this.rating = rating;
		this.startyear = startyear;
	}
	
}
