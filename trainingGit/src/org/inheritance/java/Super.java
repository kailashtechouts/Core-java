package org.inheritance.java;
	
	class Customer{  
		int id;  
		String name;  
		Customer(int id,String name){  
		this.id=id;  
		this.name=name;  
		}  
}  
		class Emp2 extends Customer {  
			
		float salary;  
		Emp2(int id,String name,float salary){
			
		super(id,name);
		this.salary=salary;  
		}  
		void display(){System.out.println(id+" "+name+" "+salary);}  
		}  
		 public class Super{  
			
		public static void main(String[] args) {  
			
		Emp2 e1=new Emp2(1,"ankit",45000f);  
		e1.display();  
		}
}
