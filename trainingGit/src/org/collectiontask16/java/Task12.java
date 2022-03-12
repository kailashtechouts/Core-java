package org.collectiontask16.java;

import java.util.*;
import java.util.Collections;
import java.util.Iterator;

public class Task12 {

	public static void main(String[] args) {
		
		List<String> ayl = new ArrayList<>();
		ayl.add("shaw");
		ayl.add("tilak");
		ayl.add("iyer");
		ayl.add("gill");
		ayl.add("nagarkoti");
		
		ayl = Collections.synchronizedList(ayl);  
		  
        synchronized (ayl) {  
            Iterator<String> itr = ayl.iterator();  
            while (itr.hasNext()) {  
                System.out.println(itr.next());  
            }  
        }
	}
}
