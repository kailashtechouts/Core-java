package org.collectiontask7.java;

import java.util.ArrayList;
import java.util.Collections;

public class Task7 {

	public static void main(String[] args) {


		ArrayList<String> vechiles = new ArrayList<String>();
		vechiles.add("honda");
		vechiles.add("passion");
		vechiles.add("royal enfield");
		vechiles.add("bmw");
		vechiles.add("ninja");
		vechiles.add("harley");
		
		System.out.println("Before reversing");
		System.out.println(vechiles.toString());
		Collections.reverse(vechiles);
		System.out.println("After reversing");
		System.out.println(vechiles);

	}

}
