package org.java8.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

class Product{
	int num;
	String name;
	double price;
	Product(int num, String name, Double price){
		 this.num = num;
		this.name = name;
		this.price = price;
	}
}
public class Lambda4 {

	public static void main(String[] args) {

		ArrayList<Product> ls = new ArrayList<Product>();
		   
	        ls.add(new Product(1,"New balance",17000d));  
	        ls.add(new Product(3,"Stanford",65000d));  
	        ls.add(new Product(2,"Mrf ",25000d));  
	        ls.add(new Product(4,"Ceat",15000d));  
	        ls.add(new Product(5,"Kukaburaa ",26000d));  
	        ls.add(new Product(6,"Sunil Gavaskar",19000d));  
	          
	        Stream<Product> filtered_data = ls.stream().filter(p -> p.price >= 15000);  
	          
	        filtered_data.forEach( product -> System.out.println(product.name+": "+product.price)  
	        );  
	        System.out.println("------------------------------------------------------------------");
	        Collections.sort(ls,(p1,p2)->{  
	            return p1.name.compareTo(p2.name);  
	            });  
	            for(Product p:ls){  
	                System.out.println(p.num+" "+p.name+" "+p.price);  
	            }  
	      
	        }  
	    }   	
