package org.multithreading.java;


class Multiple1 extends Thread{
	 public void run() {
		 System.out.println("thread is starting");
	 }
}
	class Multiple2 extends Thread{
		public void run() {
			System.out.println("thread is starting");
		}
	}
public class Multi2 {

	public static void main(String[] args) {
		
		Multiple1 m1 = new Multiple1();
		Multiple2 m2 = new Multiple2();
		m1.start();
		m2.start();
	
	}

}
