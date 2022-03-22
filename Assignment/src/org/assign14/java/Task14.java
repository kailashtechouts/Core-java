package org.assign14.java;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class Task14 {

		public static void main(String[] args) throws IOException {
			Manager Em=new Manager(101,"Shyam");
			Manager Em2=new Manager(102,"Chakri");
			List <Employee> ll=new LinkedList<>();
			ll.add(Em);
			ll.add(Em2);
			
			Em.create();
			Em.write(ll);
			Em.read();
			
		}

	}

