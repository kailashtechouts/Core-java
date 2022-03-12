package org.polymorphism.java;

class Runtime1 {

	void run() {
		System.out.println("He is running");
	}
}
	class Runner extends Runtime1{
		void run() {
			System.out.println("running with medium pace");
		}
	}
	public class Runtime {
	public static void main(String[] args) {
    
		Runtime1 rt = new Runner();
		rt.run();
	}
}
