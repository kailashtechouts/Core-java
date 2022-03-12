package org.java8.java;

import java.util.Arrays;

public class ParallelSort1 {
	
	    public static void main(String[] args) {  
	      
	        int[] arr = {7,9,3,0,8,12};  
	     
	        for (int i : arr) {  
	            System.out.print(i+" ");  
	        }  
	      
	        Arrays.parallelSort(arr);  
	        System.out.println("\nArray elements after sorting");  

	        for (int i : arr) {  
	            System.out.print(i+" ");  
	        }  
	    }  
	}  

