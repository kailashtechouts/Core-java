package org.just.java;

public class Intern  implements Runnable  {   
	public void run()  
	{    
	System.out.println("Now the thread is running ...");    
	}    
	    
	
	public static void main(String argvs[])  {
		
	Runnable r1 = new Intern();   
	  
	Thread th1 = new Thread(r1, "My new thread");    
	th1.start();  
	String str = th1.getName();  
	System.out.println(str);  
	}    
}