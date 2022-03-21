package org.assign1.java;
/* Implement one-many association for Company and Employee.(Make sure to have rating,startYear for Employee)*/
class Company {

	private String name;
	Company(String name)
	{
		this.name = name;
	}
	public String getCompanyName()
	{
		return this.name;
	}
}

class Employee {

	private String name;
	private int rating;
	private int startyear;
	Employee(String name,int rating, int startyear)
	{
		this.name = name;
		this.rating = rating;
		this.startyear = startyear;
	}
	public String getName()
	{
		return this.name;
	}
	public int getRating()
	{
		return this.rating;
	}
	public int getStartYear()
	{
		return this.startyear;
	}
}


class Task1 {

	public static void main(String[] args)
	{


		Company c = new Company("TECHOUTS");
		Employee emp1 = new Employee("ManiKanta",10, 2016 );
		Employee emp2 = new Employee("Prashanth",9, 2020 );
		Employee emp3 = new Employee("Venkat", 8, 2021);
		Employee emp4 = new Employee("Vishnu", 9, 2020);

		System.out.println(emp1.getName()+"-"+emp1.getRating()+"-"+emp1.getStartYear()+"-"+ "is employee of "+ c.getCompanyName());
		System.out.println(emp2.getName()+"-"+emp2.getRating()+"-"+emp2.getStartYear()+"-"+ "is employee of "+ c.getCompanyName());
		System.out.println(emp3.getName()+"-"+emp3.getRating()+"-"+emp3.getStartYear()+"-"+ "is employee of "+ c.getCompanyName());
		System.out.println(emp4.getName()+"-"+emp4.getRating()+"-"+emp4.getStartYear()+"-"+ "is employee of "+ c.getCompanyName());
	}
}
