package org.multithreading.java;

public class Multi1 extends Thread{
	public void run() {
		System.out.println("thread is running");
	}

	public static void main(String[] args) {
	Multi1 m =  new Multi1();
	m.start();
	}
}
