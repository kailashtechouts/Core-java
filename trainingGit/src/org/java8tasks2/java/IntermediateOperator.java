package org.java8tasks2.java;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
/* What are the most commonly used Intermediate operations? give an example for 1.distinct() 2.limit() 3.skip() 4. peek() 5.flatMap()*/
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class IntermediateOperator {

	public static void main(String[] args) {

		List<Employee> emp = new LinkedList<Employee>();  

		emp.add(new Employee(101,"Raghu",45000d));  
		emp.add(new Employee(102,"Babu",25000d));  
		emp.add(new Employee(103,"Saivarun",32000d));  
		emp.add(new Employee(103,"Saivarun",32000d));  
		emp.add(new Employee(104,"Ramesh",36000d));  
		emp.add(new Employee(105,"Yogesh",60000d));  

		System.out.println(emp);

		  emp.stream()
				.distinct()
				.forEach(s->System.out.println(s.name));

		System.out.println("----------------------------------------");

		emp.stream()
		.limit(3)
		.forEach(s->System.out.println(s.name));

		System.out.println("---------------------------------------");

		emp.stream()
		.skip(4)
		.forEach(s->System.out.println(s.name));

		System.out.println("-----------------------------------------");

		emp.stream()
		.filter(s -> s.name.startsWith("R"))
		.peek(e -> System.out.println("Filtered value: " + e.name))
		.collect(Collectors.toList());

		System.out.println("-------------------------------------------");

		List<Employee> list1 = new ArrayList();
		list1.add(new Employee(105,"karthik",32000d));  
		list1.add(new Employee(106,"kiran",32000d));  
		list1.add(new Employee(107,"vinod",36000d));  

		List<Employee> list2 = new ArrayList();
		list2.add(new Employee(108,"Suresh",32000d));  
		list2.add(new Employee(109,"ram",32000d));  
		list2.add(new Employee(110,"abhi",36000d));  

		List<List<Employee>> allLists = new ArrayList(); 
		allLists.add(list1);  
		allLists.add(list2);
		System.out.println("List Before Applying mapping and Flattening: \n");  
		Iterator<List<Employee>> itr =allLists.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next().toString());  
			
		}
		System.out.println(allLists);

		allLists.stream().flatMap(pList -> pList.stream()).collect(Collectors.toList());   
		System.out.println("List After Applying Mapping and Flattening Operation: \n");   

		System.out.println(allLists);          
	}  
}



