package org.multithreadingtasks.java;

/*Create a multithreaded program by creating a subclass of Thread and then creating, initializing, and staring two Thread objects from your class.
The threads will execute concurrently and display Java is hot,aromatic, and invigorating to the console window.*/

 class Threading1 extends Thread {
	public void run() {
		System.out.println("java is hot,aromatic and invigorating");
		try {
			Thread.sleep(1000);
		}catch(Exception e) {}
	}

}
class Threading2 extends Thread{
	public void run() {
		System.out.println("java is hot,aromatic and invigorating");
		try {
			Thread.sleep(2000);
		}catch(Exception e) {}
	}
	
}
public class ThreadTaskOne{
	
	public static void main(String[] args) {
		
		Threading1 td1 = new Threading1();
		Threading2 td2 = new Threading2();
		td1.start();
		td2.start();
	}
}

