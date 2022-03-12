package org.java8.java;

import java.util.Arrays;

public class ParallelSort2 {
	   public static void main(String[] args) {  
		      
	        int[] arr =  {12,6,8,1,0,4,9,50,-3};    
	     
	        for (int i : arr) {  
	            System.out.print(i+" ");  
	        }  
	      
	        Arrays.parallelSort(arr,0,6);  
	        System.out.println("\nArray elements after sorting");  

	        for (int i : arr) {  
	            System.out.print(i+" ");  
	        }  
	    }  
	}  

