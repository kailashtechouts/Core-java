package org.java8tasks1.java;
/*What are the Terminal operations? give an example for 1.collect() 2.reduce() 3. anyMatch() , noneMatch() , allMatch() 4. forEach() 5.forEachOrdered()*/
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class TerminateOperator {

	public static void main(String[] args) {
		List<Student> st = new ArrayList<Student>();  
	      
        st.add(new Student(9,"Harsha",45000));  
        st.add(new Student(2,"Abhilash",25000));  
        st.add(new Student(5,"Abdul",32000));  
        st.add(new Student(7,"Vikram",36000));  
        st.add(new Student(10,"Abishek",60000));  

        List<Student> st1 = st.stream()//collect
        		.filter(s -> s.fees >= 25000)      
                .collect(Collectors.toList()); 
        st1.forEach(b->System.out.println(b.fees));
        
        System.out.println("-------------------------------------");
        
        Float totalFees = st.stream()//reduce
        		.map(b->b.fees)
        		.reduce(0.0f, (sum,fees)->sum+fees);
        		System.out.println(totalFees);
        		
        		System.out.println("------------------------------");
        		
        	    boolean allStudents = st.stream()//allmatch
                        .allMatch(p -> p.fees > 20000);
        	    	System.out.println( allStudents);
        	    	
        	    	System.out.println("---------------------------");
        	    	
        	    	boolean match = st.stream()//anymatch
        	    			.anyMatch(s -> s.name.startsWith("V"));
        	        System.out.println(match);
        	        
        	        System.out.println("----------------------------");
        	        
        	        boolean match1 = st.stream()//nonematch
        	    			.noneMatch(s -> s.name.startsWith("k"));
        	        System.out.println(match1);
        	        
        	        System.out.println("-----------------------------");
        	        
        	        st1.parallelStream()//forEach
        	        .forEach(b->System.out.println("The Students:" +b.classNum+ " "+b.name+ " "+b.fees));
        	        
        	        System.out.println("-----------------------------");
        	        
        	        
        	        st1.parallelStream()//forEachOrdered
        	        .forEachOrdered(b->System.out.println("The Ordered of Students:" +b.classNum+ " "+b.name+ " "+b.fees));
		}

	}

