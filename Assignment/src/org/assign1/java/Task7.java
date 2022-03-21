package org.assign1.java;

import java.util.HashMap;
import java.util.Map;

/*In an array of 1-10, multiple numbers are duplicates, how do you find duplicates using Map implemented classes.*/
public class Task7 {

	public static void main(String[] args) {

		int arr[] = {2,3,3,4,7,6,7,5,8,9};
		HashMap<Integer,Integer> hm2 = new HashMap<>();
		for(Integer key : arr) {
			if(hm2.containsKey(key)){
				hm2.put(key, hm2.get(key)+1);	
			}
			else {
				hm2.put(key,1);
			}
			
		}
		System.out.println(hm2);
	}
}
