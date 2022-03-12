package org.inheritance.java;

 class AggregationAddress {
	
	String city,state,country;
	public AggregationAddress(String city,String state,String country) {
		this.city = city;
		this.state = state;
		this.country = country;
	}
}
class Employee{
	
	int id;
	String name;
	AggregationAddress address;
	public Employee(int id, String name, AggregationAddress address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}		
	void display() {
		System.out.println(id+ " "+name);
		System.out.println(address.city+ " "+address.state+ " "+address.country);
	}
}
    public class AAaddress{
	public static void main(String[] args) {
		
		AggregationAddress ad1 = new AggregationAddress("hyderabad", "telangana", "india");
		AggregationAddress ad2 = new AggregationAddress("mysore", "karnataka", "india");
		
		Employee emp1 = new Employee(101, "kailash",ad1);
		Employee emp2 = new Employee(102, "shreyas", ad2);
		
		emp1.display();
		emp2.display();
	}
}

