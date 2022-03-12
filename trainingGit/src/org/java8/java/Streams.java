package org.java8.java;
import java.util.*;
import java.util.stream.Collectors;
 class Company {

	int id;
	String name;
	float salary;
	Company(int id, String name, float salary){
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
}
public class Streams {  
    public static void main(String[] args) {  
        List<Company> cp = new ArrayList<Company>();  
      
        cp.add(new Company(1,"Tcs",25000f));  
        cp.add(new Company(2,"Infosys",30000f));  
        cp.add(new Company(3,"Icici",28000f));  
        cp.add(new Company(4,"Wipro",28000f));  
        cp.add(new Company(5,"Techouts",60000f));  
        List<Float> cp1price = cp.stream().
        		filter(s -> s.salary > 30000)
                .map(s->s.salary)         
                .collect(Collectors.toList()); 
System.out.println(cp1price);  

System.out.println("--------------------------------------------");

cp.stream()  
.filter(s -> s.salary == 30000)  
.forEach(product -> System.out.println(product.name));  

System.out.println("---------------------------------------------");

Float totalPrice = cp.stream()  
.map(s->s.salary)  
.reduce(0.0f,(sum, salary)->sum+salary);   
System.out.println(totalPrice);  

System.out.println("-----------------------------------------------");

double totalPrice3 = cp.stream()  
.collect(Collectors.summingDouble(s->s.salary));  
System.out.println(totalPrice3);  

    }
    
    
}
