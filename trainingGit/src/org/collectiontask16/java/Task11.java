package org.collectiontask16.java;

import java.util.HashMap;

	class Threads {
	int i;
	String name;
	static HashMap<String, Integer> hms = new HashMap<String, Integer>();
	synchronized static void read(String name, int i) {
	hms.put("Abhi", 10);
	hms.put("kamal", 20);
	hms.put("don",40);
	hms.put(name, i);
	System.out.println("the data of thread is:" +i);
	try {
		Thread.sleep(100);
		}
	catch(Exception e) {}
	}	
	}
	class Thread1 extends Thread{
		Threads m;
		Thread1(Threads m){
		this.m = m;
	}
	public void run() {
		m.read("pavan", 20);
	}
	}
	class Thread2 extends Thread{
		Threads m;
		Thread2(Threads m){
		this.m = m;
	}
	public void run() {
		  synchronized(m){   
		    {   
		      
		      m.read("Abhi",10);  
		    }   
		  }   

	}
	}
	public class Task11{
	public static void main(String args[]) {
		Threads th = new Threads();
		Thread1 t1 = new Thread1(th);
		Thread2 t2 = new Thread2(th);
		t1.start();
		t2.start();
	}
}
